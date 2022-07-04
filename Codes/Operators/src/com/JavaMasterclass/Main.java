package com.JavaMasterclass;

public class Main {

    public static void main(String[] args) {
	// Operators: +, -, *, /, etc.
    // Operands
    // Expression: Combination of Operators and Operands

    // a = 5 + 6;
    // Operators: +, =
    // Operands: a, 5, 6

    // Statement ==> Keyword + Expression ==> int a = 5 + 6;


    // Addition Operator or Summation Operator
        int result = 3 + 2;
        System.out.println("3 + 2 = " + result);

    // Assignment Operator
        int previousResult = result;
        System.out.println("Previous Result = " + previousResult);

    // Minus Operator
        result = result - 1;
        System.out.println("5 - 1 = " + result);

    // Multiplication Operator
        result = result * 10;
        System.out.println("4 x 10 = " + result);

    // Division Operator
        result = result / 2;
        System.out.println("40 / 2 = " + result);

    // Modulus or Remainder Operator
        result = result % 6;
        System.out.println("20 % 6 = " + result);


    // Abbreviating Operator or Unary Operator
        // A unary operator is an operator used to operate on a single
        // operand to return a new value.

        // Increment Operator
        result++; // postfix increment
        System.out.println("2++ = 2 + 1 = " + result);

        ++result; // prefix increment
        System.out.println("++3 = 3 + 1 = " + result);


        // Decrement Operator
        result--; // postfix decrement
        System.out.println("4-- = 4 - 1 = " + result);

        --result; // prefix decrement
        System.out.println("--3 = 3 - 1 = " + result);


        // Unary Plus Operator
        result =+ 3; // It is equivalent to "result = 3", not "result += 3"
        System.out.println("result =+ 3 ==> result =  " + result);

        // Unary Minus Operator
        result =- 3; // It is equivalent to "result = -1 * 3", not "result -= 3"
        System.out.println("result =- 3 ==> result = " + result);


    // Shorthand Operator
        // Addition assignment operator
        result += 3;
        System.out.println("-3 += 3 ==> -3 + 3 = " + result);

        // Subtraction assignment operator
        result -= 1;
        System.out.println("0 -= 1 ==> 0 - 1 = " + result);

        // Multiplication assignment operator
        result *= 2;
        System.out.println("-1 *= 2 ==> -1 * 2 = " + result);

        // Division assignment operator
        result /= -2;
        System.out.println("-2 /= -2 ==> -2 / -2 = " + result);


    // if-then Statement
        boolean setBool = true;
        if (setBool)
            System.out.println("Set Boolean is true.");

        // More than one statement
        setBool = false;
        if (setBool)
            System.out.println("SetBoolean is false.");
            System.out.println("I am supposed to NOT execute."); // It will execute

        // Code block allows more than one statement to be executed
        if(setBool)
        {
            System.out.println("SetBoolean is false.");
            System.out.println("I will NOT execute."); // It will not execute
        }

        setBool = true;
        if(setBool)
        {
            System.out.println("SetBoolean is True.");
            System.out.println("I am supposed to execute now.");
        }



    // Equality and Relational Operators or Comparison Operators

        // Equal to Operator (==)
        setBool = false;
        if(setBool == false)
        {
            System.out.println("SetBoolean is False.");
            System.out.println("But the expression or condition evaluates to TRUE.");
        }

        // Equals to operator (==) vs Assignment operator (=)
        boolean isCar = false;
        if (isCar = true){ // Here, == is to be used instead of =
            System.out.println("This is not supposed to happen.");
        }
        // Inside the parenthesis of 'if' it should always a boolean value
        // because it is an expression or condition that needs to be either
        // satisfy or fail.

        // The above code executed because irrespective of assignment operator
        // it was still a boolean value.

        // It will give error if:
        int getValue = 5;
        // if(getValue = 7){ // replacing = with == will resolve the error
        //     System.out.println("The expression is giving an int value instead of boolean.");
        // }


        // Not Equal to Operator (!=)
        getValue = 6;
        if(getValue != 7){
            System.out.println("GetValue is 6 i.e., 6 is not equal to 7.");
        }

        // Greater than Operator (>)
        getValue = 10;
        if(getValue > 7){
            System.out.println("GetValue is 10 i.e., 10 greater than 7.");
        }

        // Less than Operator (<)
        getValue = 5;
        if(getValue < 7){
            System.out.println("GetValue is 5 i.e., 5 less than 7.");
        }

        // Greater than or equal to Operator (>=)
        getValue = 7;
        if(getValue >= 7){
            System.out.println("GetValue is 7 i.e., 7 is greater than or equal to 7.");
        }

        // Less than or equal to Operator (<=)
        getValue = 7;
        if(getValue <= 7){
            System.out.println("GetValue is 7 i.e., 7 is lesser than or equal to 7.");
        }

        // check >= vs =>
        if(getValue >= 7){
            System.out.println(">= and =>, BOTH ARE DIFFERENT.");
        }

        //if(getValue => 7){
        //    System.out.println("It is an error.");
        //}
        // '=>' doesn't have any meaning but in some other languages it is used
        // as lambda operator or lambda arrow in lambda expression


    // Conditional Operators
        // AND operator (&&)
        getValue = 5;
        setBool = true;
        if ((getValue == 5) && setBool){
            System.out.println("Both expressions are TRUE.");
        }

        // OR operator (||)
        if ((getValue == 5) || (setBool == false)){
            System.out.println("One of two expression is TRUE.");
        }

        // Ternary Operator (?:)
        getValue = 10;
        setBool = (getValue % 5) == 0 ? true : false;
        System.out.println("setBool = " + setBool);


    // NOT Operator / Logical Compliment Operator / Negation Operator (!)
        setBool = false;
        if (!setBool){
            System.out.println("setBool is false but we used Negation Operator.");
        }


    // CHALLENGE
        double a = 20.00d, b = 80.00d;

        double c = (a + b) * 100.00d;

        boolean check = (c % 40.00d) == 0 ? true : false;

        if (!check){
            System.out.println("Got some remainder");
        }

    }
}
