package com.JavaMasterclass;

public class Mitsubishi extends Car{

    public Mitsubishi(int cylinders, String name){
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return this.getClass().getSimpleName() + " -> startEngine()";
    }

    @Override
    public String accelerate() {
        return this.getClass().getSimpleName() + " -> accelerate()";
    }

    @Override
    public String brake() {
        return this.getClass().getSimpleName() + " -> brake()";
    }
}
