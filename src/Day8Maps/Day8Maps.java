package Day8Maps;

import java.util.HashMap;
import java.util.Scanner;

public class Day8Maps {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int iterations = Integer.parseInt(scanner.nextLine());
    HashMap<String, Long> addresses = new HashMap<>();
    for(int i = 0; i < iterations; i++){
      String[] textDivided = scanner.nextLine().split(" ");
      addresses.put(textDivided[0], Long.valueOf(textDivided[1]));
    }
    while(scanner.hasNextLine()){
      String nextLine = scanner.nextLine();
      if(addresses.get(nextLine) != null){
        System.out.println(nextLine+"="+addresses.get(nextLine));
      } else {
        System.out.println("Not found");
      }
    }
  }
}
