package tarea3;

import tarea3.Nodes.LinkedListSimpleNode;

public class Queue<T> {

  private LinkedListSimple<T> linkedListSimple = new LinkedListSimple<>();
  private int size = 0;

  public int getSize() {
    return size;
  }

  public void enqueue(T value) {
    linkedListSimple.addFirst(value);
    size++;
  }

  public LinkedListSimpleNode<T> dequeue() {
    size--;
    return linkedListSimple.dequeue();
  }

  public void read() {
    linkedListSimple.read();
  }

}
// FIFO (first in, first out)
// queue = cola

// 1. Enqueue (add)
// 2. Dequeue (remove)

// entrada 4 -> 3 -> 2 -> 1 salida
