package tarea3.Nodes;

public class DoublyLinkedListNode<T> {
  public T value;
  public DoublyLinkedListNode<T> next;
  public DoublyLinkedListNode<T> prev;

  public DoublyLinkedListNode(T value, DoublyLinkedListNode<T> next, DoublyLinkedListNode<T> prev) {
    this.value = value;
    this.next = next;
    this.prev = prev;
  }

  public DoublyLinkedListNode(T value, DoublyLinkedListNode<T> next) {
    this.value = value;
    this.next = next;
  }

  public DoublyLinkedListNode(T value) {
    this.value = value;
  }

  public DoublyLinkedListNode() {
  }

}
