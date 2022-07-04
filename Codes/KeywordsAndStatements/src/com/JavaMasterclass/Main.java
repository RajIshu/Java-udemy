package com.JavaMasterclass;

public class Main {

    public static void main(String[] args) {
	// Statement
        /* Statement = Keyword + Expression
           Semicolon ends or completes the statement.
           Example:
                a) int myVariable = 50;
                b) myVariable++;
                c) myVariable--;
                d) System.out.println("This is a test");
        */

        // Statement doesn't need to be in one line, it can be in multiple lines.
        System.out.println("This is" +
                " another" +
                " test.");

        // One line can contain more than one statement.
        int myNewInt = 5; myNewInt++; // It is not recommended, it is confusing.


    // Whitespace
        // Whitespace is used to separate keywords, expressions and statements using spaces.
        // Whitespace make code readable.
        int            mySecondInt
                =
                50; // Whitespace never gives any error.
        System.out.println("My Second Int = " + mySecondInt);


    // Indentation
        // It also improves the readability of the code.
        // It is also used to indicate the block of code.
        // Some programming languages are strict about indentation. Example: Python.

    }
}
