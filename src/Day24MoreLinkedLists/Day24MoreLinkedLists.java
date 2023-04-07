package Day24MoreLinkedLists;

/**
 * This is the problem: https://www.hackerrank.com/challenges/30-linked-list-deletion/problem
 */

import java.util.Scanner;

class Node {
  int data;
  Node next;

  Node(int d) {
    data = d;
    next = null;
  }

}

public class Day24MoreLinkedLists {
  public static Node removeDuplicates(Node head) {
    // Write your code here
    Node currentHead = head;
    // This works too but it is harder to read
    // while (currentHead != null) {
    //   int currentNum = currentHead.data;
    //   if (currentHead.next != null) {
    //     int nextNum = currentHead.next.data;
    //     if (currentNum == nextNum) {
    //       currentHead.next = currentHead.next.next;
    //     } else {
    //       currentHead = currentHead.next;
    //     }
    //   } else {
    //     currentHead.next = null;
    //     currentHead = currentHead.next;
    //   }
    // }
    while(currentHead.next != null){
      if(currentHead.data == currentHead.next.data){
        currentHead.next = currentHead.next.next;
      } else {
        currentHead = currentHead.next;
      }
    }
    return head;
  }

  public static Node insert(Node head, int data) {
    Node p = new Node(data);
    if (head == null)
      head = p;
    else if (head.next == null)
      head.next = p;
    else {
      Node start = head;
      while (start.next != null)
        start = start.next;
      start.next = p;

    }
    return head;
  }

  public static void display(Node head) {
    Node start = head;
    while (start != null) {
      System.out.print(start.data + " ");
      start = start.next;
    }
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    Node head = null;
    int T = sc.nextInt();
    while (T-- > 0) {
      int ele = sc.nextInt();
      head = insert(head, ele);
    }
    head = removeDuplicates(head);
    display(head);

  }
}
