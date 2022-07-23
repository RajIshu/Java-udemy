/*
Challenge Description:

-Read the numbers from the console entered by the user and print the minimum
 and maximum number the user has entered.
-Before the user enters the number, print the message "Enter number:"
-If the user enters an invalid number, break out of the loop and print the
 minimum and maximum number.

Hint:
-Use an endless while loop.

Bonus:
-Create a project with the name MinAndMaxInputChallenge.
*/


import java.util.Scanner;

public class MinAndMax {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean hasInt;

        int num, max = 0, min = 0;

        // Other way to do this is to assign
        // min = 2147483647 (maximum value an Int can hold)
        // max = -2147483648 (minimum value an Int can hold)

        while (true){
            System.out.println("Enter number: ");
            hasInt = sc.hasNextInt();
            if(hasInt){
                num = sc.nextInt();
                // if we use the other way then we don't need this if statement
                if(max == 0 && min == 0){
                    max = num;
                    min = num;
                }
                else if(max < num) {
                    max = num;
                }
                else if(min > num){
                    min = num;
                }
            }
            else {
                break;
            }
            sc.nextLine(); // It's best to use it for avoiding unpredicted error.

        }

        System.out.println("Max = " + max);
        System.out.println("Min = " + min);

        sc.close();

    }
}
