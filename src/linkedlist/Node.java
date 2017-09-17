package linkedlist;

public class Node {
  // properties
  private int value;
  private Node next;

  // Constructors
  public Node() {}

  public Node(int value) {
    this.value = value;
  }

  public Node(int value, Node next) {
    this.value = value;
    this.next = next;
  }

  // Getters and Setters
  public void setValue(int value) {
    this.value = value;
  }

  public void setNext(Node next) {
    this.next = next;
  }

  public int getValue() {
    return this.value;
  }

  public Node getNext() {
    return this.next;
  }

  @Override
  public String toString() {
    return this.value + "";
  }
}
