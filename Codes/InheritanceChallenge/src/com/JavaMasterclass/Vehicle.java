package com.JavaMasterclass;

public class Vehicle {

    private int headlight;
    private int wheel;
    private int seat;

    public Vehicle(int headlight, int wheel, int seat){
        this.headlight = headlight;
        this.wheel = wheel;
        this.seat = seat;
    }

    public void move(int speed){
        System.out.println("Vehicle.move() called. Vehicle is moving at " + speed);
    }

    public int getHeadlight() {
        return headlight;
    }

    public int getWheel() {
        return wheel;
    }

    public int getSeat() {
        return seat;
    }
}
