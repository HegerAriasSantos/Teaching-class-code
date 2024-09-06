package tarea3;

import tarea3.Nodes.LinkedListSimpleNode;

public class Stack<T> {

  private LinkedListSimple<T> items = new LinkedListSimple<>();
  private int size = 0;

  public int getSize() {
    return size;
  }

  public void push(T value) {
    items.addFirst(value);
    size++;
  }

  public LinkedListSimpleNode<T> pop() {
    size--;
    return items.pop();
  }

  public void read() {
    var str = "";
    var current = items.head;
    if (current == null) {
      System.out.println("null");
      return;
    }
    // "1 -> 2 -> 3 -> null"
    while (current != null) {
      str += "| " + current.value + " | \n";
      current = current.next;

    }
    System.out.println(str + "-----");
  }

}

// LIFO (last in, first out)

// | 4 |
// | 3 |
// | 2 |
// | 1 |
// ----
