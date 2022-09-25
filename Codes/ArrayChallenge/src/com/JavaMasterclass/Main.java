package com.JavaMasterclass;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*
	    CHALLENGE:
	    ---------
	    // Create a program using arrays that sorts a list of integers in descending order.
        // Descending order is the highest value to lowest.
        // In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
        // ultimately have an array with 106,81,26, 15, 5 in it.
        // Set up the program so that the numbers to sort are read in from the keyboard.
        // Implement the following methods - getIntegers, printArray, and sortIntegers
        // getIntegers returns an array of entered integers from keyboard
        // printArray prints out the contents of the array
        // and sortIntegers should sort the array and return a new array containing the sorted numbers
        // you will have to figure out how to copy the array elements from the passed array into a new
        // array and sort them and return the new sorted array.

	*/

//        int[] arr = new int[] {3,2,5,1,6,8,8,12,7,9};
        // System.out.println(arr.length);

        int[] arr = getIntegers(14);

        arr = sortIntegers(arr);

        printArray(arr);


        // Arrays.copyOf(int[] Array, int length) method is used to copy one array to another array.
        int[] oneMoreArray = Arrays.copyOf(arr, arr.length);

    }

    public static int[] getIntegers(int number){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter " + number + " Integer value...");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++){
            values[i] = scan.nextInt();
        }

        return values;
    }


    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.println("Element " + i + ": " + array[i]);
        }
    }

//    public static int[] sortIntegers(int[] array){
//        int random = (int) (Math.random() * array.length);
//
//        int[] values = new int[array.length];
//
//        values[0] = array[random];
//
//        for (int i = 0; i < array.length; i++){
//            if(array[i] < array[random]){
//                if(i == 0){
//                    int c = values[i];
//                    values[i] = array[i];
//                    values = shiftPlace(values, c, j+1);
//                    shiftPlace(values, )
//                }
//            }
//        }
//        return array;
//    }

    public static int[] sortIntegers(int[] array){
        int[] values = new int[array.length];
        int k = 0;
        for (int i = 0; i < array.length; i++){
            if(i == 0){
                values[k] = array[i];
                k++;
            }
            else{
                for (int j = 0; j < i; j++){
                    if(array[i] >= values[j] && array[i] >= values[k-1]){
                        values[k] = array[i];
                        k++;
                        break;
                    }
                    else if(array[i] < values[j]){
                        int c = values[j];
                        values[j] = array[i];
                        values = shiftPlace(values, c, j+1);
                        k++;
                        break;
                    }
                }
            }
        }

        return values;
    }

    public static int[] shiftPlace(int[] arr, int displacedElement, int position){
        int[] newArray = new int[arr.length];

        for(int i = 0; i < newArray.length; i++){
            if(i < position){
                newArray[i] = arr[i];
            }
            else if(i == position){
                newArray[i] = displacedElement;
            }
            else {
                newArray[i] = arr[i-1];
            }
        }

        return newArray;
    }
}
