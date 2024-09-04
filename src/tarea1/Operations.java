package tarea1;
import java.util.Scanner;

enum OperationsEnum {
  SUM,
  SUBTRACT,
  MULTIPLY,
  DIVIDE
}

public class Operations {
  public static void run() {
    performOperation();
  }

  public static int calculate(int num1, int num2, OperationsEnum operation) {
    switch (operation) {
      case SUM:
        return num1 + num2;
      case SUBTRACT:
        return num1 - num2;
      case MULTIPLY:
        return num1 * num2;
      case DIVIDE:
        if (num2 != 0 && num1 != 0) {
          return num1 / num2;
        } else {
          throw new ArithmeticException("Cannot divide by zero");
        }
      default:
        throw new IllegalArgumentException("Invalid operation");
    }
  }

  public static void performOperation() {
    Scanner scanner = new Scanner(System.in);

      System.out.println("Enter the first number:");
      int num1 = scanner.nextInt(); 
   System.out.println("Enter the second number:"); 

    System.out.println("Enter the second number:");
    int num2 = scanner.nextInt();

    System.out.println("Choose an operation (SUM, SUBTRACT, MULTIPLY, DIVIDE):");
    String operationInput = scanner.next().toUpperCase();
    // try {
      OperationsEnum operation = OperationsEnum.valueOf(operationInput);
      int result = calculate(num1, num2, operation);
      System.out.println("Result: " + result);
    // } catch (ArithmeticException | IllegalArgumentException e) {
    //   System.out.println("Error: " + e.getMessage());
    // }
    scanner.close();
  }
}