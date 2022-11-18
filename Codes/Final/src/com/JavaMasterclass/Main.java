package com.JavaMasterclass;

public class Main {

    public static void main(String[] args) {
    /*
        FINAL:
        -----
        The final keyword is a non-access modifier used for classes, attributes and methods,
        which makes them non-changeable.

        In Java, the final keyword is used to denote constants.

        The final keyword is useful when you want a variable to always store the same value,
        like PI (3.14159...).


        Advantages of FINAL keyword:
        ---------------------------
            1. Stop Value Change (=> For Final Variables)
            2. Stop Method Overriding (=> For Final Methods)
            3. Stop Inheritance (=> For Final Classes)

            The above three cases will produce error if tried to implement.
    */

        SomeClass one = new SomeClass("one");
        SomeClass two = new SomeClass("two");
        SomeClass three = new SomeClass("three");

        System.out.println(one.getInstanceNumber());
        System.out.println(two.getInstanceNumber());
        System.out.println(three.getInstanceNumber());

//        one.instanceNumber = 4; // Final Variable can not be changed

        System.out.println(one.getInstanceNumber());
        System.out.println(two.getInstanceNumber());
        System.out.println(three.getInstanceNumber());
        one.classCounter = 4; // Static member accessed via Instance reference
        System.out.println("SomeClass.getClassCounter() => " + SomeClass.getClassCounter());
        SomeClass.classCounter = 5; // Static member accessed via Class reference
        System.out.println("one.getClassCounter() => " + one.getClassCounter());

        SomeClass.classCounter = 6;
        System.out.println(SomeClass.getClassCounter());


    }
}
