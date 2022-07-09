/*
Problem Description:

Write a method named getLargestPrime with one parameter of type int named number.

If the number is negative or does not have any prime numbers, the method should return -1 to indicate an invalid value.


The method should calculate the largest prime factor of a given number and return it.


EXAMPLE INPUT/OUTPUT:

* getLargestPrime (21); should return 7 since 7 is the largest prime (3 * 7 = 21)

* getLargestPrime (217); should return 31 since 31 is the largest prime (7 * 31 = 217)

* getLargestPrime (0); should return -1 since 0 does not have any prime numbers

* getLargestPrime (45); should return 5 since 5 is the largest prime (3 * 3 * 5 = 45)

* getLargestPrime (-1); should return -1 since the parameter is negative


HINT: Since the numbers 0 and 1 are not considered prime numbers, they cannot contain prime numbers.

NOTE: The method getLargestPrime should be defined as public static like we have been doing so far in the course.

NOTE: Do not add a main method to the solution code.
*/


public class LargestPrime {

    public static void main(String[] args) {
//        System.out.println(getLargestPrime (21));
//        System.out.println(getLargestPrime (217));
//        System.out.println(getLargestPrime (0));
//        System.out.println(getLargestPrime (45));
//        System.out.println(getLargestPrime (-1));
//        System.out.println(getLargestPrime (7));
        System.out.println(getLargestPrime (12));

    }

    public static int getLargestPrime(int number){
        if(number <= 1){
            return -1;
        }


        int LargestPrime = number;

        boolean check = false;
        for(int i = 2; i < number; i++){
            if(number % i == 0){
                for(int j = 2; j < i; j++){
                    if(i % j == 0){
                        check = true;
                    }
                }
                if(!check){
                    LargestPrime = i;
                }
            }

        }

        if(LargestPrime > 0){
            return LargestPrime;
        }
        return -1;
    }

//    public static boolean isPrime(int num){
//        if(num == 2){
//            return true;
//        }
//        else if(num <= 1){
//            return false;
//        }
//        else if(num % 2 == 0){
//            return false;
//        }
//        else{
//            // checking for odds only
//            for(int i = 3; i <= num/2; i+=2){
//                // we can use Math.sqrt(num) instead of num/2, it would have saved lots of time
//                // Comparison is done above
//                if(num % i == 0){
//                    return false;
//                }
//            }
//            return true;
//        }
//    }
}
