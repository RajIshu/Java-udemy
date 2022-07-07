package com.JavaMasterclass;

public class Main {

    public static void main(String[] args) {
	/*
	Control Flow Statements:
	    - Statements that can be used to control the flow of Java code. Such
	      statements are called control flow statements.
	    - Java provides three types of control flow statements:
            1. Decision Making statements or Conditional Statements
                    a) if-else statement
                    b) switch statement
            2. Loop statements
                    a) for loop
                    b) while loop
                    c) do while loop
                    d) for-each loop
            3. Jump statements
                    a) break statement
                    b) continue statement

	*/

        int value = 1;

        if (value == 1){
            System.out.println("Value is 1.");
        }
        else if (value == 2){
            System.out.println("Value is 2.");
        }
        else {
            System.out.println("Value is neither 1 nor 2.");
        }

        // 'if else' statements are messy. They reduce the readability of code. So, to resolve
        // this issue here comes 'Switch case' statements at rescue.

        // We would need Jump statements so, lets discuss them here itself.


    /*
    Jump Statements:
        - Jump statements are used to transfer the execution control to the other part
          of the program.
        - There are two types of jump statements in Java:
            1. Break:
                - It is used to break the current flow of the program and transfer the
                  control to the next statement outside a loop or switch statement.
                - It can only be written inside the loop or switch statement.
                - Example:
                    for(int i = 0; i<= 10; i++) {
                        System.out.println(i);
                        if(i==6) {
                            break;
                        }
                    }

            2. Continue:
                - Unlike break statement, it doesn't break the loop, whereas, it skips
                  the specific part of the loop and jumps to the next iteration of the
                  loop immediately.
                - Example:
                    for(int i = 0; i<= 2; i++) {
                        for (int j = i; j<=5; j++) {
                            if(j == 4) {
                                continue;
                            }
                            System.out.println(j);
                        }
                    }

    */
    }
}
