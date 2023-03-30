package Day5Loops;

/**
 * Here is the problem: https://www.hackerrank.com/challenges/30-loops/problem?isFullScreen=true
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day4Loops {
  public static void main(String[] args) {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    try {
      int n = Integer.parseInt(bufferedReader.readLine().trim());
      bufferedReader.close();

      for(int i = 1; i <= 10; i++){
        System.out.println(String.valueOf(n) + " x " + String.valueOf(i) + " = " + String.valueOf(i * n));
      }

    } catch (NumberFormatException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}
