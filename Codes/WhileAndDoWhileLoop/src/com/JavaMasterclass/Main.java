package com.JavaMasterclass;

public class Main {

    public static void main(String[] args) {
	// While Loop
        int count = 1;
        while(count != 6){
            System.out.println(count);
            count++;
        }


    // Do-While Loop
        // Do-while loop executes at least once.

        count = 1;
        do{
            System.out.println(count);
            count++;
        }while (count != 6);


    // CHALLENGE
        // Create a method called isEvenNumber that takes a parameter of type int
        // Its purpose is to determine if the argument passed to the method is
        // an even number or not.
        // return true if an even number, otherwise return false;
        // Check for a range of number whether they are even or not using while loop
        // and printing the even number found
        // Modify the while code above
        // Make it also record the total number of even numbers it has found
        // and break once 5 are found
        // and at the end, display the total number of even numbers found

        int start  = 4;
        int end = 20;
        count = 0;

        while(start != end+1){
            if(isEvenNumber(start)) {
                System.out.println(start);
                count++;
            }
            start++;
            if(count == 5){
                break;
            }
        }
        System.out.println("Total number of Even number = " + count);
    }

    public static boolean isEvenNumber(int num){
        return num % 2 == 0;
    }
}
