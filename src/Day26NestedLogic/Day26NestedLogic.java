package Day26NestedLogic;

/**
 * This is the problem: https://www.hackerrank.com/challenges/30-nested-logic/problem
 */

import java.util.Scanner;

public class Day26NestedLogic {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String returnString = scanner.nextLine();
    String dueString = scanner.nextLine();
    scanner.close();
    String[] returnDate = returnString.split(" ");
    String[] dueDate = dueString.split(" ");

    int returnYear = Integer.valueOf(returnDate[2]).intValue();
    int returnMonth = Integer.valueOf(returnDate[1]).intValue();
    int returnDay = Integer.valueOf(returnDate[0]).intValue();

    int dueYear = Integer.valueOf(dueDate[2]).intValue();
    int dueMonth = Integer.valueOf(dueDate[1]).intValue();
    int dueDay = Integer.valueOf(dueDate[0]).intValue();

    if (returnYear > dueYear) {
      System.out.println("10000");
      return;
    }
    if(returnYear == dueYear){
      if(returnMonth > dueMonth) {
        int expectedMonth = Integer.valueOf(dueDate[1]);
        int returnedMonth = Integer.valueOf(returnDate[1]);
        System.out.println((500*(returnedMonth - expectedMonth))+"");
        return;
      }
      if(returnMonth == dueMonth && returnDay > dueDay) {
        int expectedDay = Integer.valueOf(dueDate[0]);
        int returnedDay = Integer.valueOf(returnDate[0]);
        System.out.println((15*(returnedDay - expectedDay))+"");
        return;
      }
    }
    System.out.println("0");
  }
}
