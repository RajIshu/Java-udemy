package com.JavaMasterclass;

public class Main {

    public static void main(String[] args) {
	/*
	    Inheritance:
	    -----------
	    If a Car class is extending a Vehicle Class then we will say Car "is a" Vehicle.
	    So, "is a" is relationship that child class and parent class have in case of
	    inheritance.

	    Composition:
	    -----------
        There is "has a" relationship between Objects in case of Composition.

        Let's understand this concept with an example:

        There are three Objects a Computer, a keyboard, a mouse.
        There is no role of inheritance as neither a keyboard "is a" computer is correct
        nor a mouse "is a" computer.
        But there is a role of composition as a computer "has a" keyboard and a computer
        "has a" mouse.

        IMPLEMENTATION OF COMPOSITION:
        -----------------------------
        In Monitor Class, line number 7.
            ==> private Resolution nativeResolution;
            ==> Monitor isn't a Resolution, but Monitor has a Resolution.
        In Case CLass, line number 7.
            ==> private Dimensions dimensions;
            ==> Case isn't a Dimension, but Case has a Dimension.

        Simply, we can say that when a class is defined inside another class as a FIELD,
        then there is Composition.


        ADVANTAGE OF COMPOSITION:
        ------------------------
        In Java, a class can inherit from one class at a time. So, there is a limitation in
        case of Inheritance.
        But, in case of Composition, we can define a class or more class as the sum of a class
        parts.
        Simply, Composition allows us to use functionality from different class.
	*/

        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("2208", "Dell", "240", dimensions);

        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));

        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);
//        thePC.getMonitor().drawPixelAt(1400, 400, "Red" );
//        thePC.getMotherboard().loadProgram("Windows 1.0");
//        thePC.getTheCase().pressPowerButton();

        thePC.powerUP();
    }
}
