package Day14Scope;

/**
 * Here is the problem: https://www.hackerrank.com/challenges/30-scope/problem?isFullScreen=true&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
 */

public class Day14Scope {
  public static void main(String[] args) {
    
  }
}

class Difference {
	private int[] elements;
	public int maximumDifference;

  public Difference(int[] elements){
    this.elements = elements;
  }

  public void computeDifference(){
    int maxDiff = 0;
    for(int i = 0; i < elements.length - 1; i++){
      for(int j = 1; j < elements.length; j++){
        int absValue = Math.abs(this.elements[i] - this.elements[j]);
        if(absValue > maxDiff){
          maxDiff = absValue;
        }
      }
    }
    this.maximumDifference = maxDiff;
  }

}