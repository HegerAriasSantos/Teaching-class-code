package tarea2;

// SOLID Principles
// S - Single Responsibility Principle
// O - Open/Closed Principle
// L - Liskov Substitution Principle
// I - Interface Segregation Principle
// D - Dependency Inversion Principle
// DRY - Don't Repeat Yourself
// KISS - Keep It Simple, Stupid
// YAGNI - You Aren't Gonna Need It

public class Solid {
  public GenericService<String> list;

  public void doSomething() {
    this.list = new GenericService<String>();
    list.create("hola");
    System.out.println(list.read());
  }

  public void setList() {
    this.list = new GenericService<String>();
  }

  public void createItem(String name) {
    this.list.create(name);
  }

  public void readList() {
    System.out.println(list.read());
  }
}

class CreditCardPaymentMethod implements PaymentMethod {
  public String type = "creditCard";

  @Override
  public void processPayment(double amount) {
    // process credit card payment
  }
}

class PayPalPaymentMethod implements PaymentMethod {
  @Override
  public void processPayment(double amount) {
    // process PayPal payment
  }
}

class BankTransferPaymentMethod implements PaymentMethod {
  @Override
  public void processPayment(double amount) {
    // process bank transfer payment
  }
}

class PaymentGateway {
  private List<PaymentMethod> paymentMethods;

  public PaymentGateway(List<PaymentMethod> paymentMethods) {
    this.paymentMethods = paymentMethods;
  }

  public void processPayment(String paymentMethod, double amount) {
    for (PaymentMethod pm : paymentMethods) {
      if (pm instanceof CreditCardPaymentMethod && paymentMethod.equals("creditCard")) {
        pm.processPayment(amount);
        return;
      } else if (pm instanceof PayPalPaymentMethod && paymentMethod.equals("paypal")) {
        pm.processPayment(amount);
        return;
      } else if (pm instanceof BankTransferPaymentMethod && paymentMethod.equals("bankTransfer")) {
        pm.processPayment(amount);
        return;
      }
    }
    throw new UnsupportedOperationException("Unsupported payment method");
  }
}