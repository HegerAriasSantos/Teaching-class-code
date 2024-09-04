package tarea3;

import java.util.ArrayList;
import java.util.List;

public class Runner {

  public static void run() {
    int[] numbers2 = new int[4];
    numbers2[3] = 2;

    List<Integer> numberList = new ArrayList<>();
    numberList.add(1);
    numberList.add(2);
    numberList.add(3);
    numberList.add(4);
    numberList.add(1);
    // List<Integer> linkedList = new LinkedList<>();

    LinkedListSimple<Integer> linkedListSimple = new LinkedListSimple<>();

    linkedListSimple.add(1);
    linkedListSimple.add(2);
    linkedListSimple.add(3);
    linkedListSimple.read();
    linkedListSimple.remove(2);
    linkedListSimple.read();
    linkedListSimple.add(5);
    System.out.println(linkedListSimple.search(5).value);
    linkedListSimple.read();
    System.out.println(linkedListSimple.isCircularLinkedList());
    linkedListSimple.search(5).next = linkedListSimple.search(1);
    System.out.println(linkedListSimple.isCircularLinkedList());

  }

}
