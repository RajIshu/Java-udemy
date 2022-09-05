package com.JavaMasterclass;

public class Car extends Vehicle{
    private int sunroof;
    private int door;
    private int airBag;

    public Car(int headlight, int wheel, int seat, int sunroof, int door, int airBag){
        super(headlight, wheel, seat);
        this.sunroof = sunroof;
        this.door = door;
        this.airBag = airBag;
    }

    public void handSteering(){
        System.out.println("Car.handSteering() called.");
    }

    public void changingGears(){
        System.out.println("Car.changingGears() called.");
    }

    public int getSunroof() {
        return sunroof;
    }

    public int getDoor() {
        return door;
    }

    public int getAirBag() {
        return airBag;
    }
}
