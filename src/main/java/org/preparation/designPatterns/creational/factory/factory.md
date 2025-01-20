# Factory Design Pattern 

## Factory Method is a creational design pattern that provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created.

## Use Cases of Factory Design Pattern

    It is used to create objects without specifying the exact class of the object being created. It provides a way to encapsulate the instantiation logic, making the code more flexible, modular, and easier to maintain.

    When the object creation process is complex or requires logic:
        If creating an object involves conditional logic or multiple steps, a Factory simplifies the process by abstracting the instantiation logic.
        Example: Parsing files of different formats (JSON, XML, CSV).

    When the exact type of object to create is determined at runtime:
        If the type of object depends on user input, configuration, or runtime conditions, the Factory can dynamically decide which class to instantiate.
        Example: Creating different shapes in a graphics editor (e.g., Circle, Rectangle).

    To centralize object creation:
        When you need to centralize and control how objects are created, the Factory pattern helps enforce consistent creation practices.
        Example: Managing database connections (e.g., MySQL, PostgreSQL, SQLite).

    To decouple client code from specific implementations:
        If the client code depends on specific implementations, the Factory pattern can decouple this dependency by using an interface or abstract class.
        Example: Creating different types of vehicles (e.g., Car, Bike) without the client needing to know their exact implementation.

    To support open/closed principle (OCP):
        The Factory pattern allows new types to be added without modifying existing client code, adhering to the open/closed principle.
        Example: Adding support for new payment methods (e.g., CreditCard, PayPal).

## Advantages of Factory Design Pattern:

    Encapsulation: Hides the object creation logic from the client.
    Flexibility: Adding new types requires minimal changes.
    Reusability: Reduces duplicate code for creating objects.
    Testability: Easier to mock or stub objects in unit tests.
