package dstest;

import linkedlist.*;

public class LinkedListTest {
  public static void main(String... args) {
    // instantiate empty linkedlist
    LinkedList linkedList = new LinkedList();
    System.out.println(linkedList);

    Node node = new Node(10);
    linkedList.add(node);
    System.out.println(linkedList);

    Node node1 = new Node(20);
    linkedList.add(node1);
    System.out.println(linkedList);

    Node node2 = new Node(30);
    linkedList.add(node2);
    System.out.println(linkedList);

    Node node3 = new Node(40);
    linkedList.add(node3);
    System.out.println(linkedList);

    Node node4 = new Node(50);
    linkedList.add(node4);
    System.out.println(linkedList);

    Node node5 = new Node(20);
    linkedList.add(node5);
    System.out.println(linkedList);

    linkedList.delete(30);
    System.out.println(linkedList);

    linkedList.delete(20);
    System.out.println(linkedList);
  }
}
