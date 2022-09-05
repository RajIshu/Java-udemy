package com.JavaMasterclass;

public class Dog {

    private static String name;

    public Dog(String name){
        Dog.name = name;
        // In case of instance variable, 'this' keyword must be used instead of
        // class name.
    }

    public void printName(){
        System.out.println("Name = " + name);
    }
}
