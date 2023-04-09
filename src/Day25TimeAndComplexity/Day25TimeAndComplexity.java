package Day25TimeAndComplexity;

/**
 * This is the problem: https://www.hackerrank.com/challenges/30-running-time-and-complexity/problem
 */

import java.util.Scanner;

public class Day25TimeAndComplexity {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int cases = scanner.nextInt();
    for(int i = 0; i < cases; i++){
      int n = scanner.nextInt();
      boolean isPrime = true;
      if(n == 1){
        isPrime = false;
      }
      for(int j = 2; j <= Math.floor(Math.sqrt(n)); j++){
        if(isPrime){
          isPrime = n % j != 0;
        }
      }
      if(isPrime){
        System.out.println("Prime");
      } else {
        System.out.println("Not prime");
      }
    }
  }
}