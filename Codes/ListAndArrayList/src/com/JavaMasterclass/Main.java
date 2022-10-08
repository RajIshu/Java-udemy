package com.JavaMasterclass;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner s = new Scanner(System.in);
    private static int[] baseData = new int[10];

    public static void main(String[] args) {

        /*
        ARRAYS:
        ------
        Arrays are fixed length data structure.

        We cannot change length of array once created in Java.

        So, here comes List and ArrayList at rescue.


        LIST:
        ----
        List is an ordered collection, also known as a SEQUENCE.

        List is an interface found in the java.util package and inherits the Collection
        interface.
        And Collection interface inherits Iterable interface.

        List can have the duplicate elements also. We can also store the null elements
        in the list.

        NOTE:
            An interface is a completely "abstract class" that is used to group related
            methods with empty bodies.

            Example:

            interface Animal {
                public void animalSound(); // interface method (does not have a body)
                public void run(); // interface method (does not have a body)
            }

            Like abstract classes, we cannot create objects of interfaces.
            To use an interface, other classes must implement it. We use the 'implements'
            keyword to implement an interface.


        ARRAYLIST:
        ---------
        ArrayList inherits from the List.

        ArrayList is a resizable-array implementation of the List interface.
        --> Precisely, ArrayList actually inherits AbstractList and AbstractList uses List
            interface.

        It uses a dynamic array for storing the elements.

        It is like an array, but there is no size limit. We can add or remove elements anytime.
        So, it is much more flexible than the traditional array. It is found in the java.util
        package.

        The ArrayList in Java can have the duplicate elements also.

        Implementation of ArrayList:
        ---------------------------
        Before using ArrayList, we need to import the java.util.ArrayList package first.

        ArrayList<Type> arrayList= new ArrayList<>();

            Type: Unlike Arrays, we can not create an array list of the primitive types, such
                  as int, float, char, etc. It is required to use the required wrapper class
                  in such cases.

            ArrayList<>(): It is an empty ArrayList Constructor.

            Example: GroceryList.java file has ArrayList implementation.

        */

        System.out.println("Enter 10 integers:");
        getInput();
        printArray(baseData);
        resizeArray(); // Here as the input size changes we have to define a new array
        System.out.println("Enter 12 integers:");
        getInput();
//        baseData[10] = 67;
//        baseData[11] = 34;
        printArray(baseData);
    }

    private static void getInput()
    {
        for(int i = 0; i < baseData.length; i++)
            baseData[i] = s.nextInt();
    }

    private static void printArray(int[] arr)
    {
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    private static void resizeArray()
    {
        int[] original = baseData;

        baseData = new int[12];
        for (int i = 0; i < original.length; i++)
            baseData[i] = original[i];
    }
}
