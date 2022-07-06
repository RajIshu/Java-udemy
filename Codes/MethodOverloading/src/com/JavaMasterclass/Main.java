package com.JavaMasterclass;

public class Main {

    // Constant
    public static final String INVALID_VALUE_MESSAGE = "Invalid value. ";

    public static void main(String[] args) {

    /*
    Method Overloading
     If a class has multiple methods having same name but different in
     parameters, it is known as Method Overloading.

     Parameters can be different in two ways:
        1. Number of Parameter can be different
        2. Data types of arguments are different

     NOTE: Method Overloading is not possible by changing the return data type of method only.

     Method overloading is a form of polymorphism in OOP.

     println is a great example of method overloading. There are actually 10
     methods with the name println.
     Examples:
            System.out.println("Hello!");
            System.out.println(5);
            System.out.println(7.6);


    CONSTANTS: a variable whose value cannot change once it has been assigned.
    Example:
            final float PI = 3.14f;
            static final String INVALID_VALUE_MESSAGE = "Invalid value.";

    CONSTANTS are usually typed in uppercase so that they can be easily identified.

    */

        int newScore = calculateScore("Raj", 299);
        System.out.println("New Score is " + newScore);

        calculateScore(75);
        calculateScore();

        // calculateScore("Yash", 24, 9) // No. of arguments different

        // calculateScore(24, 9) // Data type of argument different


    // CHALLENGE
        // Create a method called calcFeetAndInchesToCentimeters
        // It needs to have two parameters.
        // feet is the first parameter, inches is the 2nd parameter
        //
        // You should validate that the first parameter feet is >= 0
        // You should validate that the 2nd parameter inches is >=0 and <=12
        // return -1 from the method if either of the above is not true
        //
        // If the parameters are valid, then calculate how many centimetres
        // comprise the feet and inches passed to this method and return
        // that value.
        //
        // Create a 2nd method of the same name but with only one parameter
        // inches is the parameter
        // validate that its >=0
        // return -1 if it is not true
        // But if its valid, then calculate how many feet are in the inches
        // and then here is the tricky part
        // call the other overloaded method passing the correct feet and inches
        // calculated so that it can calculate correctly.
        // hints: Use double for your number datatypes is probably a good idea
        // 1 inch = 2.54cm  and one foot = 12 inches
        // use the link I give you to confirm your code is calculating correctly.
        // Calling another overloaded method just requires you to use the
        // right number of parameters.

        System.out.println("Total Centimeters = " + calcFeetAndInchesToCentimeters(4.67,7.50));
        System.out.println("Total Centimeters = " + calcFeetAndInchesToCentimeters(300.678));
        System.out.println("Total Centimeters = " + calcFeetAndInchesToCentimeters(-300.678));

        // To check answer: https://www.metric-conversions.org/length/feet-to-centimeters.htm
    }


    // Method Overloading: changing no. of arguments
    // Method 1
    public static int calculateScore (String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    // Method 2
    public static int calculateScore (int score){
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    // Method 3
    public static int calculateScore (){
        System.out.println("No player name, no player score.");
        return 0;
    }

    /*
     Method Overloading is not possible by changing the return type of method only.

     This will give error because just changing the return data type of the method
     doesn't change the overall method.

     public static void calculateScore (){ // Trying overloading of above method.
         System.out.println("No player name, no player score.");
     }
    */


    // Method Overloading: changing data type of arguments
    public static int calculateScore (String playerName, double score){ // Method Overloading of Method 1
        System.out.println("Player " + playerName + " scored " + score + " points");
        return (int)score * 1000;
    }


    // Challenge
    public static double calcFeetAndInchesToCentimeters (double feet, double inches){
        if (feet >= 0 && (inches >= 0 && inches <= 12)){
            return (feet * 12 * 2.54) + (inches * 2.54);
        }
        System.out.print(INVALID_VALUE_MESSAGE);
        return -1;
    }

    public static double calcFeetAndInchesToCentimeters (double inches){
        if (inches >= 0){
            int feet = (int)(inches / 12);
            // System.out.println("Feet = " + feet);
            double inchesLeft = (inches % 12);
            // System.out.println("Inches = " + inchesLeft);
            return calcFeetAndInchesToCentimeters(feet, inchesLeft);
        }
        System.out.print(INVALID_VALUE_MESSAGE);
        return -1;
    }

}
