package tarea3;

public class Recursive {

  public static void runUntil(int n) {
    // Base Case
    if (n == 0) {
      return;
    }

    System.out.println(n);
    runUntil(n - 1);
  }

  public static long fibonacci(int n) {
    if (n == 0 || n == 1) {
      return n;
    }
    return fibonacci(n - 1) + fibonacci(n - 2);
  }
}