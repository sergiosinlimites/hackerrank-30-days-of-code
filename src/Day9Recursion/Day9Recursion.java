package Day9Recursion;

/**
 * Here is the problem: https://www.hackerrank.com/challenges/30-binary-numbers/problem?isFullScreen=true&h_r=next-challenge&h_v=zen
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day9Recursion {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

    int n = Integer.parseInt(bufferedReader.readLine().trim());

    int result = Result.factorial(n);

    bufferedWriter.write(String.valueOf(result));
    bufferedWriter.newLine();

    bufferedReader.close();
    bufferedWriter.close();
  }
}

class Result {

  /*
   * Complete the 'factorial' function below.
   *
   * The function is expected to return an INTEGER.
   * The function accepts INTEGER n as parameter.
   */

  public static int factorial(int n) {
    if(n <= 1){
      return 1;
    } else {
      return n * factorial(n-1);
    }
  }

}