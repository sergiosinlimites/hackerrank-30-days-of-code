package Day18QueuesStacks;

/**
 * Here is the problem: https://www.hackerrank.com/challenges/30-queues-stacks/problem
 */

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Day18QueuesStacks {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String input = scan.nextLine();
    scan.close();

    // Convert input String to an array of characters:
    char[] s = input.toCharArray();

    // Create a Solution object:
    Solution p = new Solution();

    // Enqueue/Push all chars to their respective data structures:
    for (char c : s) {
        p.pushCharacter(c);
        p.enqueueCharacter(c);
    }

    // Pop/Dequeue the chars at the head of both data structures and compare them:
    boolean isPalindrome = true;
    for (int i = 0; i < s.length/2; i++) {
        if (p.popCharacter() != p.dequeueCharacter()) {
            isPalindrome = false;
            break;
        }
    }

    //Finally, print whether string s is palindrome or not.
    System.out.println( "The word, " + input + ", is " 
                        + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
  }
}

class Solution {

  private Stack<Character> myStack;
  private Queue<Character> myQueue;

  public Solution(){
    myStack = new Stack<Character>();
    myQueue = new Queue<Character>();
  }

  public void pushCharacter(char c){
    myStack.push(c);
  }

  public void enqueueCharacter(char c) {
    myQueue.enqueue(c);
  }

  public char popCharacter() {
    return myStack.pop();
  }

  public char dequeueCharacter() {
    return myQueue.dequeue();
  }
}

/** This is created here because lets say I cannot use the Java structures */
class LinkedList<T> {
  private Node<T> head;
  private Node<T> tail;
  private int size;

  public LinkedList() {
      head = null;
      tail = null;
      size = 0;
  }

  public void addFirst(T element) {
      Node<T> newNode = new Node<T>(element);
      newNode.next = head;
      head = newNode;
      if (tail == null) {
          tail = newNode;
      }
      size++;
  }

  public T removeFirst() {
      if (head == null) {
          throw new NoSuchElementException("List is empty");
      }
      T element = head.data;
      head = head.next;
      if (head == null) {
          tail = null;
      }
      size--;
      return element;
  }

  public T peekFirst() {
      if (head == null) {
          throw new NoSuchElementException("List is empty");
      }
      return head.data;
  }

  public void addLast(T element) {
      Node<T> newNode = new Node<T>(element);
      if (tail == null) {
          head = newNode;
          tail = newNode;
      } else {
          tail.next = newNode;
          tail = newNode;
      }
      size++;
  }

  public T removeLast() {
      if (tail == null) {
          throw new NoSuchElementException("List is empty");
      }
      T element;
      if (head == tail) {
          element = head.data;
          head = null;
          tail = null;
      } else {
          Node<T> current = head;
          while (current.next != tail) {
              current = current.next;
          }
          element = tail.data;
          tail = current;
          tail.next = null;
      }
      size--;
      return element;
  }

  public T peekLast() {
      if (tail == null) {
          throw new NoSuchElementException("List is empty");
      }
      return tail.data;
  }

  public int size() {
      return size;
  }

  private static class Node<T> {
      private T data;
      private Node<T> next;

      public Node(T data) {
          this.data = data;
          next = null;
      }
  }
}

/** This is created here because lets say I cannot use the Java structures */
class Stack<T> {

  private int size;
  private LinkedList<T> elements;

  public Stack() {
    size = 0;
    elements = new LinkedList<>();
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public int size() {
    return size;
  }

  public T pop() {
    if (isEmpty()) {
      throw new NoSuchElementException("Stack is empty");
    }
    T element = elements.removeFirst();
    size--;
    return element;
  }

  public void push(T element) {
    elements.addFirst(element);
    size++;
  }

  public T peek() {
    if (isEmpty()) {
      throw new NoSuchElementException("Stack is empty");
    }
    return elements.peekFirst();
  }
}

/** This is created here because lets say I cannot use the Java structures */
class Queue<T> {

  private int size;
  private LinkedList<T> elements;

  public Queue() {
    size = 0;
    elements = new LinkedList<>();
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public int size() {
    return size;
  }

  public void enqueue(T element) {
    elements.addFirst(element);
    size++;
  }

  public T dequeue() {
    if (isEmpty()) {
      throw new NoSuchElementException("Queue is empty");
    }
    T element = elements.removeLast();
    size--;
    return element;
  }

  public T peek() {
    if (isEmpty()) {
      throw new NoSuchElementException("Queue is empty");
    }
    return elements.peekFirst();
  }
}