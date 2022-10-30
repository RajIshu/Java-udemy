package com.JavaMasterclass;

public abstract class Bird extends Animal implements CanFly{

    public Bird(String name){
        super(name);
    }

    @Override
    public void eat(){
        System.out.println(getName() + " is pecking");
    }

    @Override
    public void breathe() {
        System.out.println("Breathe in, breathe out, repeat");
    }

//    public abstract void fly();
    // There is a problem here, we have implemented 'fly' method here in bird class but there are some mammals or
    // animals that can also fly. So, it is not a nice way to implement 'fly' method here, instead we can make an
    // interface for 'fly' which can be implemented by other class.


    @Override
    public void fly() {
        System.out.println(getName() + " is flying");
    }
}
