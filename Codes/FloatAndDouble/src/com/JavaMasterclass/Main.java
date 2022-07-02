package com.JavaMasterclass;

public class Main {

    public static void main(String[] args) {

    /* FLOAT
            - It is SINGLE precision number.
              Precision here refers to the FORMAT and amount of SPACE occupied
              by the type.
            - Single precision occupies 32 bits.
    */
        float myFloatMinValue = Float.MIN_VALUE;
        float myFloatMaxValue = Float.MAX_VALUE;

        System.out.println("Float Minimum Value = " + myFloatMinValue); // 1.4E-45
        System.out.println("Float Maximum Value = " + myFloatMaxValue); // 3.4028235E+38


    /* DOUBLE
            - It is DOUBLE precision number.
            - Double precision occupies 64 bits.
    */
        double myDoubleMinValue = Double.MIN_VALUE;
        double myDoubleMaxValue = Double.MAX_VALUE;

        System.out.println("Double Minimum Value = " + myDoubleMinValue); // 4.9E-324
        System.out.println("Double Maximum Value = " + myDoubleMaxValue); // 1.7976931348623157E+308


        int myIntValue = 5;
        float myFloatValue = 5;
        double myDoubleValue = 5;
        // Here, we can write 5f for float and 5d for double instead of just number literals,
        // but we don't need it because Java compiler automatically Type Convert the int data
        // type to float and double data type respectively.



        // But what happen if we use decimal value to be assigned instead of whole number.
        // float myNewFloatValue = 5.25; // Uncomment it
        double myNewDoubleValue = 5.25;
        // We got error in case of float because Double is default data type for decimal
        // numbers. So, we have to explicitly specify that it belongs to float data type
        // by using 'f' beside the number literal.

        float myAnotherFloatValue = 5.25f;
        double myAnotherDoubleValue = 5.25d;


    // CHALLENGE
        float oneMoreFloatValue = (float)5.25;


    // Floating Point Precision
        System.out.println("Int Value = " + myIntValue);
        System.out.println("Float Value = " + myFloatValue);
        System.out.println("Double Value = " + myDoubleValue);

        // Float precision is 6 to 7 decimal digits.
        // Double can provide precision up to 15 to 16 decimal points.

        // Division by 2
        System.out.println("Divided Int Value by 2 = " + (myIntValue / 2));
        System.out.println("Divided Float Value by 2 = " + (myFloatValue / 2f));
        System.out.println("Divided Double Value by 2 = " + (myDoubleValue / 2d));

        // Division by 3
        System.out.println("Divided Int Value by 3 = " + (myIntValue / 3));
        System.out.println("Divided Float Value by 3 = " + (myFloatValue / 3f));
        System.out.println("Divided Double Value by 3 = " + (myDoubleValue / 3d));
        // Double is more precise than float

        // Division of number without specifying d or f
        System.out.println("Divided Double Value by 3 = " + (5.0 / 3.0));

        // Double takes 2 times more space than float but still double is recommended
        // because surprisingly double data type numbers are actually faster to process in many modern
        // computers. Second thing is that even the developer of JAVA i.e., James Gosling has written
        // most mathematical functions in Java library to process and give result in double data type.


    // CHALLENGE
        double pound = 2;
        double kilogram = pound * 0.45359237;
        System.out.println("Pound = " + pound + ", Kilogram = " + kilogram);


    // Underscore representation od Double
        double pi = 3.1415927d;
        double anotherNumber =  3_000_000.456_890_7d;
        System.out.println("Pi = " + pi);
        System.out.println("Another Number = " + anotherNumber);


    // When precise calculations are needed and necessary, such as when performing
    // currency calculations, float and double data types should not be used.
    // Here comes a Java class called BigDecimal to rescue or overcome this issue.

    }
}
