package com.JavaMasterclass;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Scanner is a class in java.util package used to get user input of the
        // primitive types like int, double, etc. and strings from different sources
        // like input streams, users, files, etc.

        // The new operator is used in Java to create new objects or used to create
        // an instance of the class.
        // In other words, new operator instantiates a class by allocating memory for a new
        // object and returning a reference to that memory.

        System.out.print("Enter your year of birth: ");
        int yearOfBirth = scanner.nextInt();
        scanner.nextLine(); // for handling next line character or enter key

        // nextInt() scans int value from input stream


        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // The nextLine() method of the java.util.Scanner class scans from the current
        // position until it finds a line separator delimiter.
        // The line separator or delimiter can be anything like '\n' or 'press Enter' etc.


        int age = 2022 - yearOfBirth;


    // .useDelimiter()
        //The useDelimiter() is a Java Scanner class method which is used to set the
        // delimiting pattern of the Scanner
        /* Example:
                 String input = "1 fish 2 fish red fish blue fish";
                 Scanner s = new Scanner(input).useDelimiter("\\s*fish\\s*");
                 System.out.println(s.nextInt());
                 System.out.println(s.nextInt());
                 System.out.println(s.next());
                 System.out.println(s.next());
                 s.close();

                 Here, The string \s is a regular expression that means "whitespace",
                 and you have to write it with two backslash characters ("\\s") when
                 writing it as a string in Java.
                 And ("\\s*") means any number of whitespaces.

               Output:
               1
               2
               red
               blue
        */

        System.out.println("Your name is " + name + ", and you are " + age + " years old.");
        System.out.println("Current Delimiter: " + scanner.delimiter());

        //.delimiter() is used to get the Pattern which the Scanner
        // class is currently using to match delimiters.

        scanner.close();
        // .close() is used to close the stream and release the resources
        // that were busy in the stream, if any.
    }
}
