package com.JavaMasterclass;

import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
	/*
	    ARRAYS:
	    ------
        Java array is an object which contains elements of a similar data type.
        The direct superclass of an array type is Object.

        Additionally, The elements of an array are stored in a contiguous memory location.

        It is a data structure where we store similar elements.

        Arrays in java are of fixed size.

	*/


//        int[] myIntArray; // Array DECLARATION
//        myIntArray = new int[10]; // Array INSTANTIATION

//        int[] myIntArray = new int[10]; // DECLARATION + INSTANTIATION

        // Assigning Value
//        myIntArray[0] = 1;
//        myIntArray[3] = 4;
//        myIntArray[5] = 6;
//        myIntArray[7] = 8;


        // Shortcut for assigning values
        int[] myIntArray = {1,2,3,4,5,6,7,8,9,10};

        // Another way to assign values
        int[] mySecondIntArray = new int[10];

        for (int i = 0; i < 10; i++){
            mySecondIntArray[i] = i * 10;
        }

        // Or we can use length instead of hardcoding 10 in for loop
        for (int i = 0; i < mySecondIntArray.length; i++){
            mySecondIntArray[i] = i * 10;
        }
        // NOTE: Remember, 'length' in Array.length is a field not method.

        // Passing Array as a parameter to a method
        printArray(mySecondIntArray);


        // Getting Array of Integer from a method
        int[] myIntegers = getIntegers(5);
        System.out.println("My Integers printing...");
        printArray(myIntegers);
        System.out.println("Average: " + getAverage(myIntegers));
    }

    public static int[] getIntegers(int number){
        System.out.println("Enter " + number + " integer values.\r");
        // '\r' is carriage return character. It moves the cursor to the beginning of the line.

        int[] values = new int[number];
        for (int i = 0; i < values.length; i++){
            values[i] = scan.nextInt();
        }
        return values;
    }


    public static void printArray(int[] myArray){
        for (int i = 0; i < myArray.length; i++){
            System.out.println("Number " + i + ": " + myArray[i]);
        }
    }

    public static double getAverage(int[] myArray){
        int sum = 0;

        // Oldest way of adding array's values
        // For loop:
//        for (int i = 0; i < myArray.length; i++){
//            sum += myArray[i];
//        }

        // Enhanced way of adding array's values
        // For-each loop:
        for (int j : myArray) {
            sum += j;
        }

        return sum/(double)myArray.length;
    }
}
