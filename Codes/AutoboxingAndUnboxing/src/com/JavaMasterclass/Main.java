package com.JavaMasterclass;

import java.util.ArrayList;

class IntClass{
    private int myValue;

    public IntClass(int value){
        this.myValue = value;
    }

    public int getMyValue(){
        return myValue;
    }

    public void setMyValue(int value){
        this.myValue = value;
    }
}

public class Main {

    public static void main(String[] args) {
	    String[] strArray = new String[10];
	    int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<>();
        strArrayList.add("Ishu");

        // ArrayList<int> intArrayList = new ArrayList<int>();  // It will generate error as argument can not be of primitive type

        // Instead, we can create a class for int, and then we can use that class in ArrayList
        ArrayList<IntClass> intClassArrayList = new ArrayList<>();
        intClassArrayList.add(new IntClass(57));

        System.out.println(intClassArrayList); // but it doesn't store '57' in the ArrayList, it instead adds address of the object in which 57 is stored.

        // If we want to print the int value '57' then we can do it like this
        System.out.println(intClassArrayList.get(0).getMyValue());


        /*
            WRAPPER CLASS:
            -------------
            A Wrapper class is a class which contains the primitive data types (int, char, short, byte, etc).

            In other words, wrapper classes provide a way to use primitive data types (int, char, short, byte,
            etc) as objects.

            A wrapper class wraps (encloses) around a data type and gives it an object appearance.

            Wrapper classes are final and immutable.


            Why do we need Wrapper Class?
            -------------------------
            Data structures in the Collection framework such as ArrayList and Vector store only the objects
            (reference types) and not the primitive types.

            So, if we want to store int or any other primitive data types into these collection framework like
            ArrayList then it wouldn't be possible then we need Wrapper Class that will convert these primitive
            data types into object and can be stored in these collection frameworks.

            NOTE: 'IntClass' created above is a Wrapper Class created by us i.e., User Defined Wrapper Class.
                  But, Java already has a wrapper class for int i.e., INTEGER.


            Two important Concepts of Wrapper Class:
            ---------------------------------------
            1. AutoBoxing:
                    - Primitive Type to Wrapper Object
                    - In autoboxing, the Java compiler automatically converts primitive types into their
                      corresponding wrapper class objects.

            2. Unboxing:
                    - Wrapper Objects to Primitive Types
                    - In unboxing, the Java compiler automatically converts wrapper class objects into their
                      corresponding primitive types.

        */


    }
}
