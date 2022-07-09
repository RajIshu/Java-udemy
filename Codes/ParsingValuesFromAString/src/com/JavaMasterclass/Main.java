package com.JavaMasterclass;

public class Main {

    public static void main(String[] args) {
	    String numberAsString = "2018";
        System.out.println("numberAsString = " + numberAsString);


    // Parsing String Values into Integer
        // Parsing is a method where one string of data gets converted into a different type of data.

        int number = Integer.parseInt(numberAsString);
        // Integer ==> Wrapper Class
        // .parseInt() ==> static method which is used to get the primitive data type 'int' of a certain String.

        // The wrapper class in Java provides the mechanism to convert primitive into object and object into primitive.
        // Object means instance of a class.

        System.out.println(number);

        numberAsString += 1; // 1 will be just appended to the string value. As 1 will be converted into string.
        number += 1;

        System.out.println("numberAsString = " + numberAsString);
        System.out.println("number = " + number);


    // Parsing String Values into Double
        numberAsString = "2018";

        double doubleNumber = Double.parseDouble(numberAsString);

        System.out.println(numberAsString);
        System.out.println(doubleNumber);

        numberAsString += 1;
        doubleNumber += 1;

        System.out.println("numberAsString = " + numberAsString);
        System.out.println("doubleNumber = " + doubleNumber);
    }
}
