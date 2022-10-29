package com.JavaMasterclass;

import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);
    private static Button btnPrint = new Button("Print");

    public static void main(String[] args) {
	/*
        NESTED CLASS:
        ------------
	    In Java, it is possible to define a class within another class, such classes are known as nested classes.

	    Nested Class increases the use of encapsulation, and creates more readable and maintainable code.

	    Nested Classes are declared private by default.


	    Types of Nested Classes:
	    -----------------------
	    1) Static Nested Class
	    2) Non-static Nested Class or Inner Class


        Inner Class or Non-static Nested Class:
        --------------------------------------
        It has access to members of the enclosing class (outer class).

        Since the inner class exists within the outer class, we must instantiate the outer class first, in order to
        instantiate the inner class.
        Syntax: <OuterClass> outerClassVar = new <OuterClassConstructor>();
                <OuterClass>.<InnerClass> innerClassVar = outerClassVar.new <InnerClassConstructor>();
        Example: CPU cpu = new CPU();
                 CPU.Processor processor = cpu.new Processor();

        We can access the members of the outer class by using this keyword.
        Syntax: <OuterClass>.this.<MemberName>
        Example: Car.this.carType

        Why we use Outer Class name before this?
        Reason: It is because if we had not mentioned the name of the outer class Car, then this keyword will represent
                the member inside the inner class.
                And, also we can use Car.carType because carType is not static.

        There are two special kinds of inner classes:
        --------------------------------------------
        1) Local Inner Classes
        2) Anonymous Inner Classes


        Local Inner Classes:
        -------------------
        Local Inner Classes are defined inside a block.
        Generally, this block is a method body. Sometimes this block can be a for loop or an if clause.

        Local Inner classes are not a member of any enclosing classes.
        They belong to the block they are defined within, due to which local inner classes cannot have any access
        modifiers associated with them. However, they can be marked as final or abstract.

        Local Inner Class has access to the fields of the class enclosing it.

        Local inner class must be instantiated in the block they are defined in.

        Local inner classes can extend an abstract class or implement an interface.


        Anonymous Inner Classes:
        -----------------------
        It is an inner class without a name and for which only a single object is created.

        It is similar to local class only difference is that it has no name associated with it.


	    Static Nested Class:
	    -------------------
        This type of nested classes don’t share any relationship with the instance of an outer class.

        Without an outer class object existing, there may be a static nested class object. i.e., an object of a static
        nested class is not strongly associated with the outer class object.

        Static nested class can access only the static members (both private and public) of the outer class.

        Why Static Nested Class can not access non-static members of the outer class?
        ----------------------------------------------------------------------------
        Reason: Since the static nested class isn’t connected to an instance of the outer class, it does not have any
                special way to access the non-static (instance) variables and methods of outer class.

	*/

        GearBox mcLaren = new GearBox(6);

        // Inner Class Object creation
//        GearBox.Gear first = mcLaren.new Gear(1, 12.3);     // WORKS
//        GearBox.Gear second = new GearBox.Gear(2, 15.4);    // DOESN'T WORK
//        GearBox.Gear third = new mcLaren.Gear(2, 15.4);                     // DOESN'T WORK

//        System.out.println(first.driveSpeed(1000));

        mcLaren.addGear(1, 5.3);
        mcLaren.addGear(2, 10.6);
        mcLaren.addGear(3, 15.9);
        mcLaren.operateClutch(true);
        mcLaren.changeGear(1);
        mcLaren.operateClutch(false);

        System.out.println(mcLaren.wheelSpeed(1000));

        mcLaren.changeGear(2);
        System.out.println(mcLaren.wheelSpeed(3000));


        // Local Class Example
        class ClickListener implements Button.OnClickListener{
            public ClickListener(){
                System.out.println("I've been attached");
            }

            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }
        }

        btnPrint.setOnClickListener(new ClickListener());

        // Anonymous Class Example
        btnPrint.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }
        });

        listen();
    }

    private static void listen(){
        boolean quit = false;
        while (!quit){
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrint.onClick();
                    break;
            }
        }
    }
}
