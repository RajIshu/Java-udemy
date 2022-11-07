package com.JavaMasterclass;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	/*
	    Java Generics:
	    -------------
	    The Java Generics allows us to create a single class, interface, and method that can be used with different
	    types of data (objects).
	    This helps us to reuse our code.

	    NOTE: Generics does not work with primitive types (int, float, char, etc).

	    Generics means parameterized types.
	    The idea is to allow type (Integer, String, etc., and user-defined types) to be a parameter to methods,
	    classes, and interfaces.



	*/

        // Raw Type Declaration
        ArrayList items = new ArrayList();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add("Raj"); // This is correct, but it will give error at compile time.
        items.add(4);
        items.add(5);

        for(Object i : items) {
            System.out.println((Integer) i * 2);
        }

        // So it would be difficult to track these types of error in large code. So, here
        // comes Java Generics which enable us to use diamond braces (<>) to define type to the
        // Java classes.

        // Parameterized Type Declaration - Use of Diamond braces
        ArrayList<Integer> items1 = new ArrayList<>();

        items1.add(1);
        items1.add(2);
        items1.add(3);
        items1.add(4);
        items1.add(5);
//        items1.add("Raj"); // It will give ERROR

        for(Integer i : items1) {
            System.out.println(i * 2);
        }

    }
}
