package com.JavaMasterclass;

public class Main {

    public static void main(String[] args) {
	/*
	    INTERFACES:
	    ----------
	    The interface in Java is a mechanism to achieve abstraction.

	    There can be only abstract methods in the Java interface. Abstract Method can
	    only be used in an abstract class, and it does not have a body. The body is
	    provided by the subclass (inherited from).

	    An interface is a completely "abstract class" that is used to group related
	    methods with empty bodies.

	    Eg:
	        interface Animal {
              public void animalSound(); // interface method (does not have a body)
              public void run(); // interface method (does not have a body)
            }

        Implementing an Interface:
        -------------------------
        Like abstract classes, we cannot create objects of interfaces.

        To access the interface methods, the interface must be "implemented" (kinda
        like inherited) by another class with the 'implements' keyword (instead of
        extends). The body of the interface method is provided by the "implement"
        class.

        Eg:
            // Interface
            interface Animal {
                public void animalSound(); // interface method (does not have a body)
                public void sleep(); // interface method (does not have a body)
            }

            // Pig "implements" the Animal interface
            class Pig implements Animal {
                public void animalSound() {
                    // The body of animalSound() is provided here
                    System.out.println("The pig says: wee wee");
                }
                public void sleep() {
                    // The body of sleep() is provided here
                    System.out.println("Zzz");
                }
            }


        Notes on Interfaces:
        -------------------
            - On implementation of an interface, we must override all of its methods.
            - Interface methods are by default abstract and public.
            - Interface attributes are by default public, static and final.
            - An interface cannot contain a constructor (as it cannot be used to create objects).


        Why And When To Use Interfaces?
        ------------------------------
            - Java does not support "multiple inheritance" (a class can only inherit from one
              superclass). However, it can be achieved with interfaces, because the class can
              implement multiple interfaces.

              Note: To implement multiple interfaces, separate them with a comma.
              Eg:
                interface FirstInterface {
                      public void myMethod(); // interface method
                }

                interface SecondInterface {
                      public void myOtherMethod(); // interface method
                }

                class DemoClass implements FirstInterface, SecondInterface {
                      public void myMethod() {
                        System.out.println("Some text..");
                      }
                      public void myOtherMethod() {
                        System.out.println("Some other text...");
                      }
                }

            -  To achieve security i.e., complete abstraction - hide certain details and only
               show the important details of an object (interface).


        Why we need Interfaces if we have Abstract Classes?
        --------------------------------------------------
        The reason is, abstract classes may contain non-final variables, whereas variables in
        the interface are final, public and static.


        Extending an Interface:
        ----------------------
        Similar to classes, interfaces can extend other interfaces. The extends keyword is used
        for extending interfaces.

        Eg:
            interface Line {
              // members of Line interface
            }

            // extending interface
            interface Polygon extends Line {
              // members of Polygon interface
              // members of Line interface
            }


        Extending Multiple Interfaces:
        -----------------------------
        Eg:
            interface A {
               ...
            }
            interface B {
               ...
            }

            interface C extends A, B {
               ...
            }


        Default methods in Java Interfaces:
        ----------------------------------
        With the release of Java 8, we can now add methods with implementation inside an interface.
        These methods are called default methods.

        To declare default methods inside interfaces, we use the 'default' keyword.

        Eg:
            interface Polygon {
                  void getArea();

                  // default method
                  default void getSides() {
                        System.out.println("I can get sides of a polygon."); // Implementation
                  }
            }

        Why default methods?
        -------------------
        Suppose, we need to add a new method in an interface.

        We can add the method in our interface easily without implementation. However, all our
        classes that implement that interface must provide an implementation for the method.

        If a large number of classes were implementing this interface, we need to track all
        these classes and make changes to them. This is not only tedious but error-prone as
        well.

        To resolve this, Java introduced default methods. Default methods are inherited like
        ordinary methods.


        FACTS:
        -----
            - The Java 8 also added another feature to include static methods inside an
              interface.
              Eg:
                // create an interface
                interface Polygon {
                  staticMethod(){..}
                }

                // access static method
                Polygon.staticMethod();

            - With the release of Java 9, private methods are also supported in interfaces.
	*/

        ITelephone timPhone; // Why 'ITelephone' not DeskPhone as data type? Reason is given below.
        timPhone = new DeskPhone(790387091);

        timPhone.powerOn();
        timPhone.callPhone(790387091);
        timPhone.answer();


        timPhone = new MobilePhone(746373883);
        // The reassignment here works because the variable 'timPhone' has been defined with 'ITelephone'
        // data type which is applicable to both DeskPhone and MobilePhone.
        // If 'timPhone' was defined with 'DeskPhone', then reassignment must have given error.

        timPhone.powerOn();
        timPhone.callPhone(746373883);
        timPhone.answer();
    }
}
