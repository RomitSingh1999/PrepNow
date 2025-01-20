# Solid Principle 

## Defination
The SOLID principles are five design principles that help developers write better, maintainable, scalable, and robust object-oriented code. These principles aim to improve software design by reducing tight coupling and increasing modularity.

### 1. Single Responsibility Principle (SRP)

Definition:
    A class should have only one reason to change, meaning it should have only one responsibility or job.

Why It's Important:

Avoids mixing responsibilities, which can make the code hard to understand, test, and maintain.
Leads to smaller, more focused classes. 

Example:

    // Without SRP: A single class doing multiple things
    class Invoice {
    public void calculateTotal() { /* Calculate total logic */ }
    public void printInvoice() { /* Printing logic */ }
    public void saveToDatabase() { /* Save to DB logic */ }
    }

    // With SRP: Separation of responsibilities
    class InvoiceCalculator {
    public void calculateTotal() { /* Calculate total logic */ }
    }

    class InvoicePrinter {
    public void printInvoice() { /* Printing logic */ }
    }

    class InvoiceRepository {
    public void saveToDatabase() { /* Save to DB logic */ }
    }

Use Case:
    Separating business logic, presentation logic, and persistence logic in an e-commerce application.

### 2. Open/Closed Principle (OCP)

Definition:
    Software entities (classes, modules, functions) should be open for extension but closed for modification.
    
Why It's Important:
    Avoids modifying existing code, which reduces the risk of introducing bugs.
    Encourages adding new features via extension.

Example:
    
    // Without OCP: Modifying existing code for new functionality
    class PaymentProcessor {
    public void processPayment(String paymentType) {
    if (paymentType.equals("CreditCard")) {
    System.out.println("Processing credit card payment...");
    } else if (paymentType.equals("PayPal")) {
    System.out.println("Processing PayPal payment...");
    }
    }
    }
    
    // With OCP: Extending functionality without modifying existing code
    interface Payment {
    void process();
    }
    
    class CreditCardPayment implements Payment {
    public void process() {
    System.out.println("Processing credit card payment...");
    }
    }
    
    class PayPalPayment implements Payment {
    public void process() {
    System.out.println("Processing PayPal payment...");
    }
    }
    
    class PaymentProcessor {
    public void processPayment(Payment payment) {
    payment.process();
    }
    }
    
    Use Case:
    Adding support for new payment methods without altering existing payment processing code.
### 3. Liskov Substitution Principle (LSP)

Definition:
    Objects of a superclass should be replaceable with objects of a subclass without altering the correctness of the program.
    
Why It's Important:
    Ensures that a subclass can be used wherever its parent class is expected.
    Prevents unintended behaviors caused by improper subclassing.

Example:
    
    // Violating LSP: Subclass changes behavior unexpectedly
    class Bird {
    public void fly() {
    System.out.println("Flying...");
    }
    }
    
    class Ostrich extends Bird {
    @Override
    public void fly() {
    throw new UnsupportedOperationException("Ostriches can't fly!");
    }
    }
    
    // Correcting LSP: Use a better abstraction
    abstract class Bird {
    abstract void move();
    }
    
    class FlyingBird extends Bird {
    public void move() {
    System.out.println("Flying...");
    }
    }
    
    class NonFlyingBird extends Bird {
    public void move() {
    System.out.println("Walking...");
    }
    }
    
Use Case:
    Designing a hierarchy for vehicles where land and water vehicles behave appropriately without breaking assumptions.
    
### 4. Interface Segregation Principle (ISP)

Definition:
    A class should not be forced to implement interfaces it does not use.
    
Why It's Important:    
        Avoids bloated interfaces.
        Leads to smaller, more focused interfaces.
    
Example:
    
    // Violating ISP: A large interface
    interface Worker {
    void work();
    void eat();
    }
    
    class Robot implements Worker {
    public void work() {
    System.out.println("Robot working...");
    }
    
        public void eat() {
            throw new UnsupportedOperationException("Robots don't eat!");
        }
    }
    
    // Following ISP: Smaller, specific interfaces
    interface Workable {
    void work();
    }
    
    interface Eatable {
    void eat();
    }
    
    class Robot implements Workable {
    public void work() {
    System.out.println("Robot working...");
    }
    }
    
    class Human implements Workable, Eatable {
    public void work() {
    System.out.println("Human working...");
    }
    
        public void eat() {
            System.out.println("Human eating...");
        }
    }
    
    Use Case:
    Creating device drivers or APIs with specific operations (e.g., printers, scanners) without forcing unused methods.

### 5. Dependency Inversion Principle (DIP)

Definition:
    High-level modules should not depend on low-level modules. Both should depend on abstractions.
    
Why It's Important:
    Reduces coupling between classes.
    Makes the system easier to extend and maintain.

Example:
    
    // Without DIP: High-level module depends on low-level module
    class Keyboard {
    public String getInput() {
    return "User input";
    }
    }
    
    class Computer {
    private Keyboard keyboard;
    
        public Computer() {
            this.keyboard = new Keyboard(); // Direct dependency
        }
    
        public void start() {
            System.out.println("Input: " + keyboard.getInput());
        }
    }
    
    // With DIP: High-level module depends on abstraction
    interface InputDevice {
    String getInput();
    }
    
    class Keyboard implements InputDevice {
    public String getInput() {
    return "User input from keyboard";
    }
    }
    
    class Mouse implements InputDevice {
    public String getInput() {
    return "User input from mouse";
    }
    }
    
    class Computer {
    private InputDevice inputDevice;

    public Computer(InputDevice inputDevice) {
        this.inputDevice = inputDevice; // Dependency injected
    }

    public void start() {
        System.out.println("Input: " + inputDevice.getInput());
    }
    }   

Use Case:
    Dependency injection frameworks (e.g., Spring) are built on this principle.
