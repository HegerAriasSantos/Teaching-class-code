package jeicoFinalProyect;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner {

  public static void run() {
    GestorEmpleado<Empleado> gestor = new GestorEmpleado<>();
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("Gestor de empleados");
      System.out.println("1. Add new employees");
      System.out.println("2. Update existing employees");
      System.out.println("3. Eliminate any employee");
      System.out.println("4. Show existing employees who are in the system");
      System.out.println("5. Close the program");

      int option = scanner.nextInt();

      System.out.print("\033[H\033[2J");
      System.out.flush();

      switch (option) {
        case 1:
          System.out.println("Enter employee name:");
          String name = scanner.next();
          System.out.println("Enter employee last name:");
          String lastName = scanner.next();
          System.out.println("Enter employee age:");
          int age = scanner.nextInt();
          System.out.println("Enter employee salary:");
          int salary = scanner.nextInt();

          Empleado empleado = new Empleado(name, lastName, age, salary);
          gestor.addEmpleado(empleado);
          break;
        case 2:
          gestor.updateEmpleado();
          break;
        case 3:
          System.out.println("Enter employee index to delete:");
          int indexToDelete = scanner.nextInt();
          gestor.deleteEmpleado(indexToDelete);
          break;
        case 4:
          gestor.showEmpleados();
          break;
        case 5:
          scanner.close();
          break;
        default:
          System.out.println("option invalide");
          break;
      }

    }
  }

}

interface IGestorEmpleado<T> {
  void addEmpleado(T empleado);

  void updateEmpleado(int index, T empleado);

  void deleteEmpleado(int index, T empleado);

  void showEmpleados();

  void askUserForData();
}

class Persona {
  private String name;
  private String lastName;
  private int age;

  @Override
  public String toString() {
    return "Persona [name=" + name + ", lastName=" + lastName + ", age=" + age + "]";
  }

  public Persona(String name, String lastName, int age) {
    this.name = name;
    this.lastName = lastName;
    this.age = age;
  }

  public Persona() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

}

class Empleado extends Persona {

  private int salary;

  public Empleado(String name, String lastName, int age, int salary) {
    super(name, lastName, age);
    this.salary = salary;
  }

  public Empleado() {
  }

  public String printInformation(int salary, String name, String lastName, int age) {
    return "salary " + salary + ", name " + name + ", last name " + lastName + ", Age " + age;
  }

  public String printInformation(String name) {
    return "name " + name;
  }

  public int annualSalary() {
    return salary * 12;
  }

  public int getSalary() {
    return salary;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }

}

class EmpleadoTiempoCompleto extends Empleado {
  private String schedule = "8 hour work day";

  public EmpleadoTiempoCompleto(String name, String lastName, int age, int salary, String schedule) {
    super(name, lastName, age, salary);
    this.schedule = schedule;
  }

  public EmpleadoTiempoCompleto() {
  }

  public String getSchedule() {
    return schedule;
  }

  public void setSchedule(String schedule) {
    this.schedule = schedule;
  }

}

class EmpleadoTiempoParcial extends Empleado {
  private String schedule = "part time day";

  public EmpleadoTiempoParcial(String name, String lastName, int age, int salary, String schedule) {
    super(name, lastName, age, salary);
    this.schedule = schedule;
  }

  public EmpleadoTiempoParcial() {
  }

  public String getSchedule() {
    return schedule;
  }

  public void setSchedule(String schedule) {
    this.schedule = schedule;
  }

}

class GestorEmpleado<T> implements IGestorEmpleado<T> {

  private List<T> empleados = new ArrayList<>();

  public void addEmpleado(T empleado) {
    empleados.add(empleado);
    System.out.println("employee added successfully");
  }

  public void updateEmpleado(int index, T empleadoActualizado) {

  }

  public void deleteEmpleado(int index, T empleado) {
    if (index >= 0 && index < empleados.size()) {
      empleados.remove(index);
      System.out.println("Employee successfully deleted");
    } else {
      System.out.println("Invalid employee index");
    }
  }

  public void showEmpleados() {
    for (T empleado : empleados) {
      System.out.println(empleado.toString());
    }
  }

  public void askUserForData() {
    System.out.println("Enter employee name:");
    String name = scanner.next();
    System.out.println("Enter employee last name:");
    String lastName = scanner.next();
    System.out.println("Enter employee age:");
    int age = scanner.nextInt();
    System.out.println("Enter employee salary:");
    int salary = scanner.nextInt();
  }
}
