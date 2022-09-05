package com.JavaMasterclass;

public class Main {

    public static void main(String[] args) {
	/*
	    Static Methods:
	    --------------
	    Static methods are declared using a static modifier.

        Static methods can't access instance methods and instance variables directly.

        They are usually used for operations that don't require any data from an instance of
        the class (from ‘this’). If you remember, the 'this' keyword is the current instance of a class.

        In static methods we can't use the 'this' keyword.

        Whenever you see a method that does not use instance variables that method
        should be declared as a static method.

        For example, main is a static method, and it is called by the JVM when it starts an
        application.

        NOTE: Static method don't require an instance to be created to access them. We can access them
        like this => className.methodName()
    */

        Calculator.printSum(5,10);
        printHello(); // shorter form of Main.printHello();

        /*
        Static methods are called as
            1) ClassName.methodName(); or
            2) methodName(); ==> only if in the same class
        */


    /*
        Instance Methods:
        ----------------
        Instance methods belong to an instance of a class.

        NOTE: To use an instance method we have to instantiate the class first usually by using the
        'new' keyword.

        Instance methods can access instance methods and instance variables directly.
        Instance methods can also access static methods and static variables directly.
	*/

        Dog rex = new Dog(); // Create Instance
        rex.bark(); // call instance method
    }

    public static void printHello(){
        System.out.println("Hello");
    }
}
