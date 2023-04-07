package Day22BinarySearchTrees;

/*
 * Here is the problem: https://www.hackerrank.com/challenges/30-binary-search-trees/problem
 */

import java.util.Scanner;

class Node {
  Node left, right;
  int data;

  Node(int data) {
    this.data = data;
    left = right = null;
  }
}

public class Day22BinarySearchTrees {

  public static int getHeight(Node root){
    return returnHeight(root) - 1;
  }

  public static int returnHeight(Node root){
    if(root == null){
      return 0;
    }
    int leftHeight = returnHeight(root.left);
    int rightHeight = returnHeight(root.right);

    if(leftHeight > rightHeight){
      return leftHeight + 1;
    } else {
      return rightHeight + 1;
    }
  }

      public static Node insert(Node root, int data) {
    if (root == null) {
      return new Node(data);
    } else {
      Node cur;
      if (data <= root.data) {
        cur = insert(root.left, data);
        root.left = cur;
      } else {
        cur = insert(root.right, data);
        root.right = cur;
      }
      return root;
    }
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    Node root = null;
    while (T-- > 0) {
      int data = sc.nextInt();
      root = insert(root, data);
    }
    int height = getHeight(root);
    System.out.println(height);
  }
}
