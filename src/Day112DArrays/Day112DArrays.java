package Day112DArrays;

/**
 * Here is the problem: https://www.hackerrank.com/challenges/30-2d-arrays/problem?isFullScreen=true&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;

public class Day112DArrays {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    List<List<Integer>> arr = new ArrayList<>();

    IntStream.range(0, 6).forEach(i -> {
        try {
            arr.add(
                Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList())
            );
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    });
    int maxVal = -60;
    int currentGlass = 0;
    for(int j = 0; j < 4; j++){
      for(int i = 0; i < 4; i++){
        currentGlass = arr.get(j).get(i) + arr.get(j).get(i+1) + arr.get(j).get(i+2);
        currentGlass += arr.get(j+1).get(i+1);
        currentGlass += arr.get(j+2).get(i) + arr.get(j+2).get(i+1) + arr.get(j+2).get(i+2);
        if(currentGlass > maxVal){
          maxVal = currentGlass;
        }
      }
    }
    System.out.println(maxVal);

    bufferedReader.close();
}
}
