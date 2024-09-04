package tarea2;

enum JobsEnum {
  DOCTOR,
  DISHWASHER,
  LAWYER,
  ACTOR
}

// #region firstExample
class Calculator {

}

class Persona {
  private String name;
  private String lastName;
  private int age;
  final Calculator _calculatorClass;

  // #region constructors
  public Persona(String name, String lastName, int age, Calculator calculatorClass) {
    this.name = name;
    this.lastName = lastName;
    this.age = age;
    this._calculatorClass = calculatorClass;
  }

  public Persona(String name, String lastName) {
    this.name = name;
    this.lastName = lastName;
    this._calculatorClass = new Calculator();
  }

  public Persona(String name) {
    this.name = name;
    this._calculatorClass = new Calculator();
  }

  // #endregion

  public Persona() {
    this._calculatorClass = new Calculator();
  }

  public void walk() {
    System.out.println(name + " is walking");
  }

  public void talk() {
    System.out.println(name + " is talking to no one");
  }

  @Override
  public String toString() {
    return "Persona [name=" + name + ", lastName=" + lastName + ", age=" + age + "]";
  }

  // #region getterAndSetters
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

  public Calculator get_calculatorClass() {
    return _calculatorClass;
  }
  // #endregion
}

class Worker extends Persona {
  JobsEnum job;
  double salary;

  public Worker(String name, String lastName, int age, JobsEnum job, double salary) {
    super(name, lastName, age, new Calculator());
    this.job = job;
    this.salary = salary;
  }

  public Worker() {
  }

  @Override
  public void talk() {
    System.out.println(this.getName() + " is talking with a worker flow to no one");
  }

}

class Student extends Persona {
  @Override
  public void talk() {
    System.out.println(this.getName() + " is talking with a student flow to no one");
  }
}

// #endregion

// #region secondExample
interface IMakeSound {
  public void makeSound();
}

class Cat implements IMakeSound {

  public void makeSound() {
    System.out.println("meaww");
  }

}

class Dog implements IMakeSound {

  public void makeSound() {
    System.out.println("Gau");
  }

}

class Cow implements IMakeSound {

  public void makeSound() {
    System.out.println("Muuuu");
  }

}

// #endregion

// #region thirdExample
abstract class MakeSound {
  public void makeSound() {
    System.out.println("uaaaaaaaaa");
  }
}

class MakerSound1 extends MakeSound {

}
// #endregion

// #region fourthExample

class Box<X, J> {
  X xItem;
  J jItem;

  public X getXItem() {
    return xItem;
  }

  public void setXItem(X xItem) {
    this.xItem = xItem;
  }

  public J getJItem() {
    return jItem;
  }

  public void setJItem(J jItem) {
    this.jItem = jItem;
  }

}

public class Class {
  public static void run() {
    Box<Integer, Boolean> box = new Box<>();
    box.setXItem(1);
    box.setJItem(true);

    System.out.println(box.getXItem());
    System.out.println(box.getJItem());

  }

  public static void makeSound(MakeSound makerSound) {
    makerSound.makeSound();
  }
}