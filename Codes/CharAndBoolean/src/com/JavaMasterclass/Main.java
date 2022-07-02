package com.JavaMasterclass;

public class Main {

    public static void main(String[] args) {

	// CHAR
        char myChar = 'D'; // Only one character can be assigned to char data type.
        // char incorrectChar = 'DD'; // Uncomment it

        char magicalChar = ' '; // Space as a character is assigned to variable here.

        /*
            - Char occupies 16 bits in the memory.
            - Why Char occupies 2 bytes instead of 1 byte?
              ==> Because Char allows us to store Unicode characters. Unicode is an
                  international character encoding standard that provides a unique
                  number for every character across languages and scripts, making
                  almost all characters accessible across platforms, programs,
                  and devices.
                  Unicode can represent 65535 different types of characters.
        */

        char myUnicodeChar = '\u0044'; // '\\u' is used to represent Unicode character. Here,
                                       // extra backslash is used to avoid "illegal unicode
                                       // escape error" i.e., extra backslash for escaping.
        System.out.println("Normal Char: " + myChar);
        System.out.println("Unicode Char: " + myUnicodeChar);

        char copyrightUniChar = '\u00A9';
        System.out.println("Copyright Character: " + copyrightUniChar);

        char devanagariUniChar = '\u0915';
        System.out.println("Devanagari Character: " + devanagariUniChar);

        char bitcoinUniChar = '\u20bf';
        System.out.println("Bitcoin Character: " + bitcoinUniChar);

        char teaUniChar = '\u2615';
        System.out.println("Tea Character: " + teaUniChar);

        char starUniChar = '\u2b50';
        System.out.println("Star Character: " + starUniChar);

        // char testUniChar = '\u1F494'; // Five digit Unicode Character. (Uncomment it)

        // But how to print these Complex Characters?
        // ==> The solution is using String data type and surrogate pairs
        String check = "\uD83D\uDC94"; // U+1F494 = (U+D83D) + (U+DC94)
        System.out.println("Broken Heart: " + check);


    // BOOLEAN
        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;
        // Boolean are mostly used in conditional statement.
    }
}
