package Day3ConditionalStatements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Objective
  In this challenge, we learn about conditional statements. Check out the Tutorial tab for learning materials and an instructional video.

  Task
  Given an integer, , perform the following conditional actions:

  If  is odd, print Weird
  If  is even and in the inclusive range of  to , print Not Weird
  If  is even and in the inclusive range of  to , print Weird
  If  is even and greater than , print Not Weird
  Complete the stub code provided in your editor to print whether or not  is weird.

  Input Format

  A single line containing a positive integer, .

  Constraints

  Output Format

  Print Weird if the number is weird; otherwise, print Not Weird.

  Sample Input 0

  3
  Sample Output 0

  Weird
  Sample Input 1

  24
  Sample Output 1

  Not Weird
  Explanation

  Sample Case 0: 
  is odd and odd numbers are weird, so we print Weird.

  Sample Case 1: 
  and  is even, so it is not weird. Thus, we print Not Weird.
 */

public class Day3ConditionalStatements {
  public static void main(String[] args) {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    try {
      int N = Integer.parseInt(bufferedReader.readLine().trim());
      bufferedReader.close();
      boolean isEven = N % 2 == 0;
      if(!isEven){
        System.out.println("Weird");
      } else if (isEven && N >= 2 && N <= 5) {
        System.out.println("Not Weird");
      } else if (isEven && N >= 6 && N <= 20) {
        System.out.println("Weird");
      } else if (isEven && N > 20) {
        System.out.println("Not Weird");
      }
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}
