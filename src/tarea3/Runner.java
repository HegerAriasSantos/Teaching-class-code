package tarea3;

public class Runner {

  public static void run() {
    var stack = new Stack<Integer>();

    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    stack.push(5);
    stack.read();
    System.out.println("pop: " + stack.pop().value);
    System.out.println("pop: " + stack.pop().value);
    System.out.println("pop: " + stack.pop().value);
    stack.push(6);
    System.out.println("pop: " + stack.pop().value);
    stack.read();
  }

}
