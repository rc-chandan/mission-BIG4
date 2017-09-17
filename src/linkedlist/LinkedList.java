package linkedlist;

import javax.net.ssl.ExtendedSSLSession;

public class LinkedList {

  // Properties
  private Node head;

  // Constructors
  public LinkedList() {}

  public LinkedList(Node head) {
    this.head = head;
  }

  // Instance methods
  private boolean isEmpty() {
    if(this.head == null)
      return true;
    return false;
  }

  @Override
  public String toString() {
    StringBuilder output = new StringBuilder();
    if(this.isEmpty())
      return "LinkedList is empty";

    for(Node currentNode = this.head; currentNode != null;
    currentNode = currentNode.getNext()) {
      output.append(currentNode.getValue());
      if(currentNode.getNext() != null)
        output.append("-->");
    }
    return output.toString();
  }

  public void add(Node node) {
    if (node == null) {
      System.out.println("Cannot add null as a node to the list");
      return;
    }
    if(this.isEmpty()) {
      this.head = node;
      return;
    }

    Node currentNode = null;
    for (currentNode = this.head; currentNode.getNext() != null;
    currentNode = currentNode.getNext());

    currentNode.setNext(node);
  }

  public void delete(int valueToDelete) {
    if(this.isEmpty())
      System.out.println("LinkedList is empty");

    // Delete from begining
    if(valueToDelete == head.getValue()) {
      head = head.getNext();
      return;
    }

    Node previous = head;
    // Delete from middle
    for(Node current=head; current != null; current = current.getNext()) {
      if(current.getValue() == valueToDelete) {
        previous.setNext(current.getNext());
      }
      previous = current;
    }
  }

}
