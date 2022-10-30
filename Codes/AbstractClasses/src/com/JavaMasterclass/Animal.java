package com.JavaMasterclass;

public abstract class Animal {
    private String name;

    public Animal(String name){
        this.name = name;
    }

    // Abstract Methods
    public abstract void eat();
    public abstract void breathe();

    // Non-abstract Methods
    public void walk(){
        System.out.println(this.name + " is walking");
    }

    public String getName(){
        return name;
    }


}
