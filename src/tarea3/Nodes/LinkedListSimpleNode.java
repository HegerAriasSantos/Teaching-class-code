package tarea3.Nodes;

public class LinkedListSimpleNode<T> {
  public T value;
  public LinkedListSimpleNode<T> next;

  public LinkedListSimpleNode(T value, LinkedListSimpleNode<T> next) {
    this.value = value;
    this.next = next;
  }

  public LinkedListSimpleNode(T value) {
    this.value = value;
  }

  public LinkedListSimpleNode() {
  }

}
