package tarea1;
import java.util.Scanner;

public class Input {
  static void Run() {
    Scanner myScanner = new Scanner(System.in);

    System.out.println("Enter username");
    String userName = myScanner.nextLine();
    System.out.println("Username is: " + userName);

    System.out.println("Enter edad");
    int edad = myScanner.nextInt();
    System.out.println("edad is: " + edad);

    System.out.println("Enter isMarried");
    boolean isMarried = myScanner.nextBoolean();
    System.out.println("isMarried: " + isMarried);

    myScanner.close();
  }
}
