package Day10BinaryNumbers;

/**
 * Here is the problem: https://www.hackerrank.com/challenges/30-binary-numbers/problem?isFullScreen=true&h_r=next-challenge&h_v=zen
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day10BinaryNumbers {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(bufferedReader.readLine().trim());
    bufferedReader.close();

    String binaryRep = Integer.toBinaryString(n);

    int count = 0;
    int maxRep = 0;
    for(int i = 0; i < binaryRep.length(); i++){
      String val = String.valueOf(binaryRep.charAt(i));
      if(val.equals("1")){
        count++;
        if(count > maxRep){
          maxRep = count;
        }
      } else {
        count = 0;
      }
    }
    System.out.println(String.valueOf(maxRep));
  }
}
