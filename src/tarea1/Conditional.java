package tarea1;
import java.util.Scanner;

public class Conditional {

  public static void Run() {
    Scanner myScanner = new Scanner(System.in);

    System.out.println("Enter edad");
    Integer edad = myScanner.nextInt();
    System.out.println("edad is: " + edad);

    myScanner.close();

    // cosas a tener en cuenta
    // && = and = y
    // || = Or = o
    // true && true = true
    // false && true = false
    // false && false = false
    // true || true = true
    // false || true = true
    // false || false = false

    String a = "";
    final String contrasenaMamalona = "ASDFU$#U!@#$@!$";

    boolean isAContrasenaMamalona = contrasenaMamalona == a;
    boolean is7MayorQue8 = 7 > 8;
    boolean is8IgualQue8 = 8 == 8;
    boolean is10MayorQue8 = 10 > 8;
    boolean is2MayorQue8 = 2 > 8;

    // usando ! antes de la condicion puedo tener el contrario del misma por ejemplo
    // - !true = false
    // - !false = true

    if (!"algo".equals("algo")) {
      return;
    }

    if (!(isAContrasenaMamalona || is2MayorQue8)) {
      System.out.println("La contraseña no sirve mi loco");
      return;
    }

    if (!(is8IgualQue8 || is7MayorQue8)) {
      System.out.println("a");
      return;
    }

    if ((isAContrasenaMamalona || is10MayorQue8) && (is8IgualQue8 || is7MayorQue8)) {
    }

    if (edad > 18) {
      System.out.println("ah perro puedes beber");
    } else if (edad > 18) {
      System.out.println("La creta que viejo");
    } else if (edad > 18) {
      System.out.println("La creta que viejo");
    } else if (edad > 18) {
      System.out.println("La creta que viejo");
    } else {
      System.out.println("a casa a jugar maincra");
    }

    switch (edad) {
      case 18:
        System.out.println("es igual a 18");
        break;

      default:
        System.out.println("no es igual a 18");
        break;
    }

  }

}
