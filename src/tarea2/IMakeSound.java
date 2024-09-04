package tarea2;

public interface IMakeSound {
  public void makeSound();
}

class Class2 {
  protected int algo = 10;

  public static void run() {
    Parent father = new Parent();
    Child child = new Child();
    Aberración aberración = new Aberración();
    Class2.makeSound(father);
    Class2.makeSound(child);
    Class2.makeSound(aberración);
  }

  public static void makeSound(IMakeSound makerSound) {
    makerSound.makeSound();
  }

}

// #region Encapsulation

class Encapsulation {
  private int a;
  protected String b;
  public Boolean c;
  char d;

  public Encapsulation() {
  }

  public Encapsulation(int a) {
    this.a = a;
  }

  public Encapsulation(int a, String b) {
    this(a);
    this.b = b;
  }

  public Encapsulation(int a, String b, Boolean c) {
    this(a, b);
    this.c = c;
  }

  public Encapsulation(int a, String b, Boolean c, char d) {
    this(a, b, c);
    this.d = d;
  }

  public int getA() {
    return a / 2;
  }

  public void setA(int a) {
    this.a = a;
  }

}

// #endregion

// #region Herencia

class Parent implements IMakeSound {
  public void makeSound() {
    System.out.println("aaaaaaaaaa");
  }
}

class Child implements IMakeSound {
  public void makeSound() {
    System.out.println("olaa");
  }

}

class Aberración implements IMakeSound {
  public void makeSound() {
    System.out.println("buaaaa");
  }
}

// #endregion

// #region Polimorfismo

// #endregion
