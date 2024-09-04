package tarea1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Loops {
  public static void run() {
    List<String> list = new ArrayList<>();
    list.add("algo");
    list.add("algo2");
    list.add("algo3");
    list.add("algo4");
    list.add("algo5");

    // int i = 0;
    // i++;
    // i = i + 1;

    // i--;
    // i = i - 1;
    // int i = 0;
    // System.out.println(++i);
    // System.out.println(i++); // 1
    // System.out.println(i); // 2

    // continue == ir a la siguiente iteración
    // break == romper la ejecución del ciclo

    for (int i = 1; i <= 15; i++) {
      if (i % 2 == 0 && i % 5 == 0) {
        break;
      } else {
        System.out.print(i);
      }
      System.out.println(" no es par ");
    }

    // System.out.println("i = " + i + " " + list.get(i)); // i = 0; i = 1; i = 2;
    // continue;

    int option = 0;
    Scanner scan = new Scanner(System.in);
    while (true) {
      option = scan.nextInt();
      if (option == 9) {
        break;
      }
      System.out.println("Prueba con otro numero");
    }
    scan.close();

    // No Usar
    // int a = 0;
    // do {
    // a++;
    // } while (a >= 10);

    for (int i = 0; i > list.size() - 1; i++) {
      System.out.println(list.get(i));
    }

    List<Integer> numbers = new ArrayList<>();
    numbers.add(1);
    numbers.add(2);
    numbers.add(3);
    numbers.add(4);
    numbers.add(5);

    for (int number : numbers) {
      for (int i = 0; i < 3; i++) {
        System.out.println(number + " x " + i + " = " + number * i);
      }
    }
  }
}
