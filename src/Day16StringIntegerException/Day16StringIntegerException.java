package Day16StringIntegerException;

/**
 * Here is the problem: https://www.hackerrank.com/challenges/30-exceptions-string-to-integer/problem?isFullScreen=true
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day16StringIntegerException {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    String S = bufferedReader.readLine();

    bufferedReader.close();
    try{
      int sint = Integer.parseInt(S);
      System.out.println(sint);
      } catch (NumberFormatException exception) {
      System.out.println("Bad String");
    }
  }
}