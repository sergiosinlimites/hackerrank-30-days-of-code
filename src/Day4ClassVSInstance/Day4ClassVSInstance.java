package Day4ClassVSInstance;

import java.util.Scanner;

/**
 * Here is the problem: https://www.hackerrank.com/challenges/30-class-vs-instance/problem?isFullScreen=true
 */

public class Day4ClassVSInstance {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int iterations = Integer.parseInt(scanner.nextLine());
    for(int i = 0; i < iterations; i++){
      int newAge = Integer.parseInt(scanner.nextLine());
      Person person = new Person(newAge);
      person.amIOld();
      for(int j = 0; j < 3; j++){
          person.yearPasses();
      }
      person.amIOld();
      System.out.println();
    }
  }
}

class Person {
  private int age;
  public Person(int initialAge) {
    if(initialAge < 0){
      age = 0;
      System.out.println("Age is not valid, setting age to 0.");
    } else {
      age = initialAge;
    }
  }

  public void amIOld() {
    if (age < 13) {
      System.out.println("You are young.");
    } else if (age >= 13 && age < 18) {
      System.out.println("You are a teenager.");
    } else {
      System.out.println("You are old.");
    }
  }

  public void yearPasses() {
    age += 1;
  }
}