package com.JavaMasterclass;

public class Main {

    public static void main(String[] args) {
	    // String is a data type which is not a primitive type. It is actually a class.
        String myString = "My name is Pushpa.\n";
        myString = myString + "Pushpa, naam sun ke \uD83C\uDF38 samjhe kya?";
        System.out.println(myString + " \uD83C\uDF38 nhi \uD83D\uDD25 hai apun.");

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println("Number String = " + numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt; // myInt is converted from Int to String
        System.out.println("Last String: " + lastString);

        double myDouble = 40.75d;
        lastString = lastString + myDouble; // myDouble is converted from Double to String
        System.out.println("Last String one more time: " + lastString);


        /*
            String in Java are Immutable i.e., instead of deleting a character
            from the String, a new string is created. So, String once created
            can not be changed.

            So, in above cases values were not appended instead a new string
            was created.

            Therefore, the code we used to append Strings was inefficient. Better way is
            to use StringBuffer instead of String.
            Unlike String, StringBuffer can be changed i.e., it is mutable.
        */


    }
}
