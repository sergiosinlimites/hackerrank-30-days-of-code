package Day7Arrays;

/**
 * Here is the problem: https://www.hackerrank.com/challenges/30-arrays/problem?isFullScreen=true
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;

public class Day7Arrays {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(bufferedReader.readLine().trim());

    List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
        .map(Integer::parseInt)
        .collect(toList());

    bufferedReader.close();

    StringBuffer stringBuffer = new StringBuffer();
    for(int i = n - 1; i >= 0; i--){
      stringBuffer.append(arr.get(i)+ " ");
    }
    System.out.println(stringBuffer.toString().trim());
}
}
