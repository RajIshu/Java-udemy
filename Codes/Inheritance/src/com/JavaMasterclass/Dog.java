package com.JavaMasterclass;

public class Dog extends Animal{

    // Characteristics specifically for dogs
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;


    public Dog(String name, int brain, int body, int size, int weight) {
        super(name, brain, body, size, weight);
    }

    /* If the above constructor is commented then it will generate an error. we can
       resolve the error in two ways:
            1. Either, create a default constructor in Animal Class
            2. Or, create a constructor in Dog Class


       'Super' is used to call the constructor of parent class.
    */
}
