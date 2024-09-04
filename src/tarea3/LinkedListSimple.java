package tarea3;

import tarea3.Nodes.LinkedListSimpleNode;

public class LinkedListSimple<T> {
  public LinkedListSimpleNode<T> head;

  public LinkedListSimple() {
    head = null;
  }

  public LinkedListSimple(LinkedListSimpleNode<T> head) {
    this.head = head;
  }

  public void add(T value) {
    var newNode = new LinkedListSimpleNode<T>(value);

    if (head == null) {
      head = newNode;
      return;
    }

    var current = head;

    while (current.next != null) {
      current = current.next;
    }
    current.next = newNode;

  }

  public LinkedListSimpleNode<T> search(T value) {
    var current = head;
    // c
    // 1 -> 2 -> 3 -> null
    while (current != null) {
      if (current.value.equals(value)) {
        return current;
      }
      current = current.next;
    }
    return current;
  }

  public void read() {
    var str = "";
    var current = head;
    if (current == null) {
      System.out.println("null");
      return;
    }
    // "1 -> 2 -> 3 -> null"
    while (current != null) {
      str += current.value + " -> ";
      current = current.next;

    }
    System.out.println(str + "null");

  }

  public void update(T value, T newValue) {
    var current = head;
    while (current != null) {
      if (current.value.equals(value)) {
        current.value = newValue;
        return;
      }
      current = current.next;
    }
  }

  public void remove(T value) {
    var current = head;

    if (current == null) {
      return;
    }

    if (current.value.equals(value)) {
      head = current.next;
      // this is unnecessary to delete the head
      // current.next = null;
      // current = null;
      return;
    }

    var temp = current.next;

    // "1 -> 2 -> 3 -> null"
    while (temp != null) {
      if (temp.value.equals(value)) {
        current.next = temp.next;
        // this is unnecessary to delete the node
        // temp.next = null;
        // temp = null;
        return;
      }

      current = current.next;
      temp = temp.next;
    }

  }

  public boolean isCircularLinkedList() {
    var slow = head;
    var fast = head;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
      if (slow == fast) {
        return true;
      }
    }
    return false;

    // t
    // l
    // 1 -> 2 -> 3 -> 4 -> 5 -> 1

  }

}
