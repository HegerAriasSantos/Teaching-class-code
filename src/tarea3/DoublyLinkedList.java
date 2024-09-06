package tarea3;

import tarea3.Nodes.DoublyLinkedListNode;

public class DoublyLinkedList<T> {
  public DoublyLinkedListNode<T> head;
  public DoublyLinkedListNode<T> tail;

  public DoublyLinkedList() {
    head = null;
    tail = null;
  }

  public DoublyLinkedList(DoublyLinkedListNode<T> head) {
    this.head = head;
    tail = head;
  }

  public void addFirst(T value) {
    var newNode = new DoublyLinkedListNode<T>(value);
    head.prev = newNode;
    newNode.next = head;
    head = newNode;
  }

  public void removeFirst() {
    head = head.next;
    head.prev = null;
  }

  public DoublyLinkedListNode<T> pop() {
    var temp = head;
    head = head.next;
    head.prev = null;
    return temp;
  }

  public void removeLast() {
    var slow = head;
    var fast = head.next;
    while (fast.next != null) {
      fast = fast.next;
      slow = slow.next;
    }
    slow.next = null;
  }

  public DoublyLinkedListNode<T> dequeue() {
    var slow = head;
    var fast = head.next;
    while (fast.next != null) {
      fast = fast.next;
      slow = slow.next;
    }
    slow.next = null;
    return fast;
  }

  public void add(T value) {
    var newNode = new DoublyLinkedListNode<T>(value);

    if (head == null) {
      head = newNode;
      tail = newNode;
      return;
    }

    tail.next = newNode;
    newNode.prev = tail;
    tail = newNode;
  }

  public DoublyLinkedListNode<T> search(T value) {
    var current = head;
    while (current != null) {
      if (current.value.equals(value)) {
        return current;
      }
      current = current.next;
    }
    return current;
  }

  public void read() {
    var str = "null <-> ";
    var current = head;
    if (current == null) {
      System.out.println("null");
      return;
    }
    // "null <-> 1 <-> 2 <-> 3 <-> null"
    while (current != null) {
      str += current.value + " <-> ";
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
    if (head == null) {
      return;
    }

    if (head.equals(value)) {
      this.removeFirst();
      return;
    }

    var current = head;
    var temp = current.next;

    // null <-> 0 <-> 1 <-> 2 <-> null

    while (temp != null) {
      if (temp.value.equals(value)) {
        current.next = temp.next;
        current = temp.next;
        current.prev = temp.prev;
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
  }
}
