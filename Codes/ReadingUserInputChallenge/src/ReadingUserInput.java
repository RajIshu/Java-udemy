/*
-Read 10 numbers from the console entered by the user and print the sum of those numbers.
-Create a Scanner like we did in the previous video.
-Use the hasNextInt() method from the scanner to check if the user has entered an int value.
-If hasNextInt() returns false, print the message "Invalid Number". Continue reading until
 you have read 10 numbers.
-Use the nextInt() method to get the number and add it to the sum.
-Before the user enters each number, print the message "Enter number #x: " where x represents
 the count, i.e. 1, 2, 3, 4, etc.
-For example, the first message printed to the user would be "Enter number #1: ", the
 next "Enter number #2: ", and so on.

Hint:
-Use a while loop.
-Use a counter variable for counting valid numbers.
-Close the scanner after you don't need it anymore.
-Create a project with the name ReadingUserInputChallenge.
*/


import java.util.Scanner;

public class ReadingUserInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, sum = 0, i = 1;

        boolean hasInt;

        while (true){
            System.out.print("Enter number #" + i + ": ");
            hasInt = sc.hasNextInt();
            if(hasInt) {
                num = sc.nextInt();
                sum += num;
                i++;
                if(i == 11) {
                    break;
                }
            }else {
                System.out.println("Invalid Number");
            }
             sc.nextLine(); // handle end of line (enter key)
        }

        System.out.println("Sum: " + sum);

        sc.close();
    }
}
