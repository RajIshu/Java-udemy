package com.JavaMasterclass;

public class Main {

    public static void main(String[] args) {
	/*
	    ABSTRACTION:
	    -----------
	    Abstraction is the process of hiding certain details and showing only essential information to the user.
        In other words, the user will have the information on what the object does instead of how it does it.

	    Abstraction can be achieved with either abstract classes or interfaces.

	    We can achieve 0 to 100% abstraction through Abstract Classes and 100% abstraction through Interfaces.


        ABSTRACT CLASS:
        --------------
        A class which contains the abstract keyword in its declaration is known as abstract class.

        It is a restricted class that cannot be used to create objects.
        To access abstract class, and it's member, it must be inherited from another class.
        So, Abstract Class needs to extended, not instantiated.

        NOTE: If any class inherit an abstract class, it has to provide implementations to all the abstract
              methods in it.

        An Abstract Class can have abstract and non-abstract methods.

        An Abstract Class can have constructors and static methods also.


        ABSTRACT METHOD:
        ---------------
        An Abstract Method can only be used in an abstract class, and it does not have a body.
            - Does not have a body means does not have implementation, only have declaration.
        The body of an abstract method is provided by the subclass.

        NOTE: An Abstract Class can have final methods which will force the subclass not to change the
              body of the method.

        NOTE: A FACTORY METHOD is a method that returns the instance of the class.

	*/

        Dog dog = new Dog("Bella");
        dog.eat();
        dog.walk();
        dog.breathe();

        Parrot parrot = new Parrot("Australian Ringneck");
        parrot.eat();
        parrot.walk();
        parrot.fly();
        parrot.breathe();

        Penguin penguin = new Penguin("Emperor");
        penguin.eat();
        penguin.walk();
        penguin.fly();
        penguin.breathe();


    /*
        Difference between Abstract Class and Interface:
        -----------------------------------------------

         _______________________________________________________________________________________________
        |               Abstract Class                  |                   Interface                   |
        |_______________________________________________|_______________________________________________|
        | 1. Abstract class can have abstract and       | 1. Interface can have only abstract methods.  |
        |    non-abstract methods.                      |    Since Java 8, it can have default and      |
        |                                               |    static methods also.                       |
        | 2. Abstract class doesn't support multiple    | 2. Interface supports multiple inheritance.   |
        |    inheritance.                               |                                               |
        | 3. Abstract class can have final, non-final,  | 3. Interface has only static and final        |
        |    static and non-static variables.           |    variables.                                 |
        | 4. The abstract keyword is used to declare    | 4. The interface keyword is used to declare   |
        |    abstract class.                            |    interface.                                 |
        | 5. Abstract Class can have constructor.       | 5. Interfaces do not have constructor.        |
        |                                               |                                               |
        |                                               |                                               |
        |_______________________________________________|_______________________________________________|


        When to use Interfaces?
        ----------------------
        1) When you expect that unrelated classes will implement your interface.
        2) When you want to specify the behavior of a particular data type, but you are not concerned
            about who implements its behavior.
        3) When you want to separate different behavior.

    */
    }
}
