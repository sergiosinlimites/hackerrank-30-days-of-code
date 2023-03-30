package Day12Inheritance;

/**
 * Here is the problem: https://www.hackerrank.com/challenges/30-inheritance/problem?isFullScreen=true
 */

import java.util.Scanner;

public class Day12Inheritance {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate() );
  }
}

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
}

class Student extends Person{
	private int[] testScores;

    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here
    public Student(String firstName, String lastName, int id, int[] scores){
      super(firstName, lastName, id);
      this.testScores = scores;
    }

    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
    public char calculate(){
      float grade = 0;
      for(int i = 0; i < this.testScores.length; i++){
        grade += this.testScores[i];
      }
      float average = grade / this.testScores.length;
      if(average <= 100 && average >= 90){
        return "O".charAt(0);
      } else if (average >= 80 && average < 90){
        return "E".charAt(0);
      } else if (average >= 70 && average < 80){
        return "A".charAt(0);
      } else if (average >= 55 && average < 70){
        return "P".charAt(0);
      } else if (average >= 40 && average < 55){
        return "D".charAt(0);
      } else {
        return "T".charAt(0);
      }
    }
}
