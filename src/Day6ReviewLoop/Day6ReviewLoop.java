package Day6ReviewLoop;

/**
 * Here is the problem: https://www.hackerrank.com/challenges/30-review-loop/problem?isFullScreen=true
 */

import java.util.Scanner;

public class Day6ReviewLoop {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int iterations = Integer.parseInt(scanner.nextLine());

    for(int i = 0; i < iterations; i++){
      StringBuffer evenCharsBuffer = new StringBuffer();
      StringBuffer oddCharsBuffer = new StringBuffer();
      String text = scanner.nextLine();
      for(int j = 0; j < text.length(); j++){
        if(j % 2 == 0){
          evenCharsBuffer.append(String.valueOf(text.charAt(j)));
        } else {
          oddCharsBuffer.append(String.valueOf(text.charAt(j)));
        }
      }
      System.out.println(evenCharsBuffer.toString() + " " + oddCharsBuffer.toString());
    }
    scanner.close();
  }
}
