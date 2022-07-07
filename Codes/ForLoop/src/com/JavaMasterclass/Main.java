package com.JavaMasterclass;

public class Main {

    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000,2));
        System.out.println("10,000 at 3% interest = " + calculateInterest(10000,3));
        System.out.println("10,000 at 4% interest = " + calculateInterest(10000,4));
        System.out.println("10,000 at 5% interest = " + calculateInterest(10000,5));

        // It is not the efficient way. So, here we can use for loop

    // CHALLENGE
        // using the for statement, call the calculateInterest method with
        // the amount of 10000 with an interestRate of 2,3,4,5,6,7, and 8
        // and print the results to the console window.
        for (int i = 2; i <= 8; i++){
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.1f", calculateInterest(10000, i)));
        }

        // How would you modify the for loop above to do the same thing as
        // shown but to start from 8% and work back to 2%
        for (int i = 8; i >= 2; i--){
            System.out.println("10,000 at " + (i) + "% interest = " + String.format("%.1f", calculateInterest(10000, i)));
        }


        // Create a for statement using any range of numbers
        // Determine if the number is a prime number using the isPrime method
        // if it is a prime number, print it out AND increment a count of the
        // number of prime numbers found
        // if that count is 3 exit the for loop
        // hint:  Use the break; statement to exit

        int count = 0;
        for (int i = 2; i<=100 && count < 3; i++){
            if(isPrime(i)){
                System.out.println(i);
                count++;
            }
        }


    // Comparison between num/2 and Math.sqrt(num)
        int num = 43;
        for(int i = 2; i <= num/2; i++){
            System.out.println("Looping " + i);
            if(num % i == 0){
                break;
            }
        }
        System.out.println("====================================");
        for(int i = 2; i <= Math.sqrt(num); i++){
            System.out.println("Looping " + i);
            if(num % i == 0){
                break;
            }
        }



    }

    public static double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate/100));
    }

    public static boolean isPrime(int num){
        if(num == 2){
            return true;
        }
        else if(num <= 1){
            return false;
        }
        else if(num % 2 == 0){
            return false;
        }
        else{
            // checking for odds only
            for(int i = 3; i <= num/2; i+=2){
                // we can use Math.sqrt(num) instead of num/2, it would have saved lots of time
                // Comparison is done above
                if(num % i == 0){
                    return false;
                }
            }
            return true;
        }
    }
}
