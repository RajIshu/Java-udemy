package com.JavaMasterclass;

import java.util.Locale;

public class Car {
    /*
        - Public here is the Java keyword which is a access modifier which means here
          Unrestricted access to this class.
        - Other Access Modifiers:
            1. Private - No other class can access this class
            2. Protected - It allows classes in this package to access this class.

        - Variables defined inside a Class is known as Class Variables or Member Variables.
          But most commonly they are known as FIELDS.
          These variables are accessible from anywhere within the class.
        - Defining variables inside a class requires defining access modifiers for that variable.
          Mostly, Private access modifier is used with Class Variables.


    */

    private int doors;
    private int wheels;
    // Using private access modifier will not let objects, created from this class in main class,
    // to use these fields or variables, but public access modifiers can let them use.
    // public String model;

    // But making access modifier public violets the rule of encapsulation.
    // So, we can take help of methods to use these fields in other class by the objects created.
    // public String model;
    private String model;
    private String engine;
    private String color;


    public void setModel(String model){
        String validModel = model.toLowerCase();

        if (validModel.equals("xuv300") || validModel.equals("nexon")){
            this.model = model;
        }
        else {
            this.model = "unknown";
        }
    }

    public String getModel(){
        return this.model;
    }

}
