package com.JavaMasterclass;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
	/*
	    ARRAYS:
	    ------
        An array is a data structure that allows you to store multiple values of the same type
        into a single variable.

        The default values of numeric array elements are set to 'zero' i.e., for int array, all
        the array elements are initialized to 'zero'.
        For boolean array elements they would be initialized to 'false'.
        For string or other objects, elements would be initialized to 'null'.

        The direct superclass of an array type is Object.

        Additionally, The elements of an array are stored in a contiguous memory location.

        It is a data structure where we store similar elements.

        Arrays are zero indexed: an array with n elements is indexed from 0 to n-1, for
        example 10 elements index range is from 0 to 9.

        FACT: There are 20 Programming Languages in the World where the array index starts
        from 1 and not from 0. Some popular languages include R, COBOL, Matlab and Julia.

        Arrays in java are of fixed size.

        If we try to access index that is out of range Java will give us an 1
        ArrayIndexOutOfBoundsException, which indicates that the index is out of range in
        other words out of bounds.

        To access array elements we use the square braces [ and ], also known as array access
        operator.

	*/


//        int[] myIntArray; // Array DECLARATION
//        myIntArray = new int[10]; // Array INSTANTIATION

//        int[] myIntArray = new int[10]; // DECLARATION + INSTANTIATION

        // Assigning Value
//        myIntArray[0] = 1;
//        myIntArray[3] = 4;
//        myIntArray[5] = 6;
//        myIntArray[7] = 8;


        // Shortcut for assigning values also known as Inline Initialization and the
        // array is known as anonymous array. { and } are called as Array Initializer Blocks.
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
