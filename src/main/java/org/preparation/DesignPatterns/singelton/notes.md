# Intent

Singleton is a creational design pattern that lets you ensure that a class has only one instance, while providing a global access point to this instance.

## So now we have to make sure that there is only one Instance of the class whenever it is user

To do it we have to 1st change the access specifier of the constructor from default to private, which will insure that new key word cannot be used to create a instance
But we still need to create atleast 1 instance for that we have to create a static object and a static method so that when the static method is called it will create only
one instance of the class and assign it to the static object before that we also need to check if the obj is null or not, we will create the object only when it is null.

## Things are still not perfect, what if the static method is called simultanously using two different threads

To handle this we have to make the getInstance method a public static Synchronised method
