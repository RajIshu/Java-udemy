package com.JavaMasterclass;

public class Main {

    public static void main(String[] args) {

    // INT - Occupies 32 bits in the memory

	    int myMinIntValue = Integer.MIN_VALUE;
	    int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer Minimum Value = " + myMinIntValue); // -2147483648
        System.out.println("Integer Maximum Value = " + myMaxIntValue); // 2147483647

        // Integer OVERFLOW
        System.out.println("Busted MAX Value = " + (myMaxIntValue + 1));

        // Integer UNDERFLOW
        System.out.println("Busted MIN Value = " + (myMinIntValue - 1));

        // UNDERSCORES in Numeric Literals
            /* Any number of underscore characters (_) can appear anywhere
               between digits in a numerical literal. This feature enables us,
               to separate groups of digits in numeric literals, which can
               improve the readability of your code.
            */
        int myMaxIntInternational = 2_147_483_647; // International Representation
        int myMaxIntInd           = 2_14_74_83_647; // Indian Representation
        System.out.println("Underscore Version of MAX Int = " + myMaxIntInternational);
        System.out.println("Underscore Version of MAX Int = " + myMaxIntInd);


    // BYTE - Occupies 8 bits in the memory
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;

        System.out.println("Byte Minimum Value = " + myMinByteValue); // -128
        System.out.println("Byte Maximum Value = " + myMaxByteValue); // 127


    // SHORT - Occupies 16 bits in the memory
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;

        System.out.println("Short Minimum Value = " + myMinShortValue); // -32768
        System.out.println("Short Maximum Value = " + myMaxShortValue); // 32767


    //LONG - Occupies 64 bits in the memory
        // L postfix is added to specify that its belong to Long data type not int data type.

        long myLongValueWithSmallCase = 100l;

        // L (uppercase) is preferred, because the letter l (lowercase)
        // is often confusing and hard to distinguish from the digit 1 (one).

        long myLongValue = 100L;


        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;

        System.out.println("Long Minimum Value = " + myMinLongValue); // -9223372036854775808
        System.out.println("Long Maximum Value = " + myMaxLongValue); // 9223372036854775807

        // Long also has concept of Overflow and Underflow value.

        // Byte and Short also have Overflow and Underflow value but when we add 1 it gets converted into integer.
        System.out.println("Busted Short Value = " + (short)(myMaxShortValue + 1));

        // Why we need L as prefix?
        // If we declare a long variable without L then it will not give any error in some case
        long mySmallLong = 100;
        System.out.println("Small Long Value = " + mySmallLong);

        // It hasn't given any error because Number is so small that it comes under range of Integer
        // so, when Java compiler finds that long data type has been specified on the left side of the declaration
        // then compiler convert the value into long data type from int.

        // But if we try to assign a number beyond the range of integer then it will give "Integer number
        // too Large" error as compiler was treating the RHS as of int data type.
        // long myBigLong = 2147483648; // uncomment it --> Here, RHS > Integer.MAX_INT

        long myBigLongCRCT = 2147483648L;


    // Casting
        int myNewIntValue = (myMinIntValue / 2);

        // byte myNewByteValue = (myMinByteValue / 2); // Uncomment it
        byte myNewByteValue = (byte)(myMinByteValue / 2);

        // short myNewShortValue = (myMinShortValue / 2); // Uncomment it
        short myNewShortValue = (short)(myMinShortValue / 2);

        
    // Challenge
        byte myChalByteValue = 10;     
        short myChalShortValue = 100;
        int myChalIntValue = 2_000_000;
        long myChalLongValue = 50_000 + (10 * (myChalByteValue + myChalShortValue + myChalIntValue));

        System.out.println("Challenge Long Value = " + myChalLongValue);

    }
}
