package com.JavaMasterclass;

public class Main {

    public static void main(String[] args) {
	/*
	    Static Variables:
	    ----------------
	    Declared by using the keyword static.

        Static variables are also known as static member variables.

        Every instance of that class shares the same static variable.

        If changes are made to that variable, all other instances will see the effect
        of the change.

        Static variables are not used very often but can sometimes be very useful.
        For example, when reading user input using Scanner we will declare scanner as a static
        variable. That way static methods can access it directly.
	*/

        Dog rex = new Dog("Rex");
        Dog fluffy = new Dog("Fluffy");

        rex.printName(); // print 'Fluffy'
        fluffy.printName(); // print 'Fluffy'

        // Both print same name because static variables are shared between instances so,
        // in other words, once we change the static variable all instances will see that
        // change we made.


    /*
        Instance Variable:
        -----------------
        They don’t use the static keyword.

        Instance variables are also known as fields or member variables.

        Instance variables belong to an instance of a class.

        Every instance has its own copy of an instance variable.

        Every instance can have a different value (state).

        Instance variables represent the state of an instance.
    */
    }
}
