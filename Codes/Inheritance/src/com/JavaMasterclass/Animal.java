package com.JavaMasterclass;

public class Animal {
    private String name;
    private int brain;
    private int body;
    private int size;
    private int weight;

//    public Animal(){
//        this("Unknown Animal", 1, 1, 30, 60);
//    }

    public Animal(String name, int brain, int body, int size, int weight){
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }

    // Behaviour or Methods
    public void eat(){
        System.out.println("Animal.eat() called.");
    }

    public void move(int speed){
        System.out.println("Animal.move() is called. Animal moving at " + speed);
    }


    // Getters
    public String getName() {
        return name;
    }

    public int getBrain(){
        return brain;
    }

    public int getBody(){
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }
}
