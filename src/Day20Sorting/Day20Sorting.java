package Day20Sorting;

/**
 * Here is the problem: https://www.hackerrank.com/challenges/30-sorting/problem
 */

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class Day20Sorting {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(bufferedReader.readLine().trim());

    List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
        .map(Integer::parseInt)
        .collect(toList());

    // Write your code here

    bufferedReader.close();
    int numberOfSwaps = 0;
    
    for (int i = 0; i < n; i++) {
      // Track number of elements swapped during a single array traversal

      
      for (int j = 0; j < n - 1; j++) {
          // Swap adjacent elements if they are in decreasing order
          if (a.get(j) > a.get(j + 1)) {
              int temporal = a.get(j);
              a.set(j, a.get(j+1));
              a.set(j+1, temporal);
              numberOfSwaps++;
          }
      }
      
      // If no elements were swapped during a traversal, array is sorted
      if (numberOfSwaps == 0) {
          break;
      }
    }

    System.out.println("Array is sorted in "+ numberOfSwaps +" swaps.");
    System.out.println("First Element: "+a.get(0));
    System.out.println("Last Element: "+a.get(a.size() - 1));

  }
}
