package com.JavaMasterclass;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	    int switchValue = 2;

        // Without break statement
        switch (switchValue) {
            case 1:
                System.out.println("Value is 1.");
            case 2:
                System.out.println("Value is 2.");
            case 3:
                System.out.println("Value is 3.");
            default:
                System.out.println("Value is undefined.");
        }

        // with break statement
        switch (switchValue) {
            case 1:
                System.out.println("Value is 1.");
                break;

            case 2:
                System.out.println("Value is 2.");
                break;

            case 3: case 4: case 5: // Shortcut for multiple case statements
                System.out.println("Value is 3 or 4 or 5.");
                break;

            default:
                System.out.println("Value is undefined.");
        }


        // Enhanced Switch-case Statement (Similar to above switch-case statement):
        switch (switchValue) {
            case 1 -> System.out.println("Value is 1.");
            case 2 -> System.out.println("Value is 2.");
            // Shortcut for multiple case statements
            case 3, 4, 5 -> System.out.println("Value is 3 or 4 or 5.");
            default -> System.out.println("Value is undefined.");
        }


    // CHALLENGE
        // Create a new switch statement using char instead of int
        // create a new char variable
        // create a switch statement testing for
        // A, B, C, D, or E
        // display a message if any of these are found and then break
        // Add a default which displays a message saying not found

        char switchCharValue = 'D';

        switch (switchCharValue) {
            case 'A':
                System.out.println("Found A!");
                break;
            case 'B':
                System.out.println("Found B!");
                break;
            case 'C':
                System.out.println("Found C!");
                break;
            case 'D': case 'E':
                System.out.println("Found " + switchCharValue + "!");
                break;
            default:
                System.out.println("Not Found!");
        }

        // NOTE: 'a' != 'A' and "January" != "january"  ==> Letter Case sensitive

    // toLowerCase()
        // The toLowerCase() method converts a string to lower case letters.
        // Example:
        String msg = "Hello";
        System.out.println("Original: " + msg);
        System.out.println(msg.toLowerCase());

    // toUpperCase()
        // The toUpperCase() method converts a string to upper case letters.
        // Example:
        System.out.println("Original: " + msg);
        System.out.println(msg.toUpperCase());
        
    }
}
