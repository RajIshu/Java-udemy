package com.JavaMasterclass;

public class Main {

    public static int multiplier = 7;

    public static void main(String[] args) {
	/*
	    STATIC:
	    ------
	        - The static keyword belongs to the class rather than an instance of the class.
	          It means there is only one copy of the variable in the memory. So, if any change
	          brought to it, prevails forever and for each and every instance too.

	          All instance of the class share that one variable.
	*/



//	    StaticTest firstInstance = new StaticTest("1st Instance");
//        System.out.println(firstInstance.getName() + " is instance number " + StaticTest.getNumInstances());
//
//        StaticTest secondInstance = new StaticTest("2nd instance");
//        System.out.println(secondInstance.getName() + " is instance number " + StaticTest.getNumInstances());
//
//        StaticTest thirdInstance = new StaticTest("3rd instance");
//        System.out.println(thirdInstance.getName() + " is instance number " + StaticTest.getNumInstances());

        // Here, Value doesn't change for each instance because they are sharing the same variable.
        // Also, we have defined getNumInstances() method static so, we don't need an object to access it.

            // java com.company._static.Main
            int answer = multiply(6);
            System.out.println("The answer is " + answer);
            System.out.println("Multiplier is " + multiplier);

    }

    public static int multiply(int number) {
        return number * multiplier;
    }
}
