# Intent

    Singleton is a creational design pattern that lets you ensure that a class has only one instance, while providing a global access point to this instance.

## So now we have to make sure that there is only one Instance of the class whenever it is user

    To do it we have to 1st change the access specifier of the constructor from default to private, which will insure that new key word cannot be used to create a instance
    But we still need to create atleast 1 instance for that we have to create a static object and a static method so that when the static method is called it will create only
    one instance of the class and assign it to the static object before that we also need to check if the obj is null or not, we will create the object only when it is null.

## Things are still not perfect, what if the static method is called simultanously using two different threads

    To handle this we have to make the getInstance method a public static Synchronised method
## Use Cases for Singleton Design Pattern

    1) Configuration Management
        Scenario: A system-wide configuration is needed, and having multiple configurations can lead to inconsistencies.
        Example:
            Reading application configuration settings (e.g., from a properties file).

    2) Logging

    Scenario: A single instance of a logger is needed to ensure all logs are written in a consistent and thread-safe manner.
    Example:
        Writing logs to a file or console.

    3) Database Connection Pool

    Scenario: Only one instance of a connection pool is required to manage connections to a database.
    Example:
        Managing a pool of database connections for efficient resource usage.

    4) Cache Management

    Scenario: A single instance of a cache is needed to avoid duplicate caching and ensure consistent data.
    Example:
        A centralized in-memory cache for storing frequently accessed data.
    Implementation: Similar to the configuration management example, but focused on caching logic.


    5) Thread Pool Management

    Scenario: Managing a single thread pool to avoid creating multiple pools, which can lead to resource contention.
    Example:
        Executor services for task execution in Java.

    6) File System Management

    Scenario: A single instance is used to manage file access or perform operations like reading and writing to files.
    Example:
        Centralized file system operations to avoid conflicts.