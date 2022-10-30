package com.JavaMasterclass;

public class Parrot extends Bird{

    public Parrot(String name){
        super(name);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("Flitting from branch to branch");
    }
}
