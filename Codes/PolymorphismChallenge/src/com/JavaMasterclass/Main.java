package com.JavaMasterclass;

class Car{
    private static String name;
    private boolean engine;
    private int cylinders;
    private int wheels;
    private int speed;

    public Car(String name, int cylinders){
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public static String getName() {
        return name;
    }

    // We don't need to check for boolean engine as all car will have engine but still we are doing it
    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public void setSpeed(){
        this.speed = 20;
        System.out.println("Speed is set to " + this.speed);
    }

    public void setSpeed(int speed){
        this.speed = speed;
        System.out.println("Speed is set to " + this.speed);
    }

    public void getSpeed(){
        accelerate(0);
    }

    public void startEngine(){
        System.out.println(isEngine() ? "Engine Starting" : "No Engine");

        /*
        Above code is similar to below code:

            if(isEngine())
                System.out.println("Engine Starting");
            else
                System.out.println("No Engine");
        */
    }

    public void accelerate(int changeSpeed){
        this.speed = changeSpeed > 0 ? (this.speed + changeSpeed) : (this.speed - changeSpeed);
        System.out.println("Current Speed: " + this.speed);
    }

    public void brake(){
        this.speed = 0;
        System.out.println("Car Stopped.");
    }
}

class XUV300 extends Car{
    public XUV300(){
        super("XUV300", 3);
    }

    @Override
    public void setSpeed() {
        super.setSpeed(30);
    }

    @Override
    public void startEngine() {
        System.out.println("XUV Engine is starting");
    }

}


class Scorpio extends Car{
    public Scorpio(){
        super("Scorpio", 4);
    }

    @Override
    public void setSpeed() {
        super.setSpeed(40);
    }

    @Override
    public void startEngine() {
        System.out.println("Scorpio Engine is starting");
    }
}


class Thar extends Car{
    public Thar(){
        super("Thar", 4);
    }

    @Override
    public void setSpeed() {
        super.setSpeed(40);
    }

    @Override
    public void startEngine() {
        System.out.println("Thar Engine is starting");
    }
}


// Created and moved in main class using Refactor
class Seltos extends Car{
    public Seltos(){
        super("Scorpio", 4);
    }

    @Override
    public void setSpeed() {
        super.setSpeed(40);
    }

    @Override
    public void startEngine() {
        System.out.println(getClass().getSimpleName() + " Engine is starting (Simple Name)");
        System.out.println(getClass().getName() + " Engine is starting (Qualified Name)");
        /* getClass(): It is a method which returns the runtime class of this object.

           getSimpleName(): It is a method which returns the "simple name" of this class
           in the form of String. If this class is anonymous, then this method returns
           empty string.
           Example: Seltos (here)

           getName(): It is a method which returns the "qualified name" of this class
           in the form of String. Qualified name is a sequence of simple names separated
           by dots.
           Example: com.JavaMasterclass.Seltos (here)
        */
    }
}



class Unknown extends Car{
    public Unknown(){
        super("Unknown Car", 3);
    }
}

public class Main {

    public static void main(String[] args) {
	/*
	    CHALLENGE:
	    ---------

	    We are going to go back to the car analogy.
        Create a base class called Car.
        It should have a few fields that would be appropriate for a generic car class like
        engine, cylinders, wheels, etc.
        Constructor should initialize cylinders (number of) and name, and set wheels to 4
        and engine to true. Cylinders and names would be passed parameters.

        Create appropriate getters.

        Create some methods like startEngine, accelerate, and brake.

        Show a message for each in the base class
        Now create 3 subclasses for your favorite vehicles.
        Override the appropriate methods to demonstrate polymorphism in use.
        put all classes in the one java file (this one).
	*/

        for (int i = 1; i < 5; i++){
            Car car = randomCar();
            System.out.println("Car #" + i +
                    " : " + Car.getName() + "\n" +
                    "Cylinder: " + car.getCylinders());
            car.startEngine();
            car.setSpeed();
            car.accelerate(25);
            car.getSpeed();
            car.brake();
            System.out.println(" ");
        }


    /*  ANONYMOUS CLASS or INLINE CLASS:
        ----------------------
        In Java, a class can contain another class known as nested class. It's possible
        to create a nested class without giving any name.

        A nested class that doesn't have any name is known as an anonymous class.

        An anonymous class must be defined inside another class. Hence, it is also known
        as an anonymous inner class.

        Its syntax is:

            class outerClass {
                // defining anonymous class or anonymous inner class
                object1 = new Type(parameterList) {
                     // body of the anonymous class
                };
            }
    */

        Car Creta = new Car("Creta", 3){
            @Override
            public void setSpeed() {
                super.setSpeed(40);
            }

            @Override
            public void startEngine() {
                System.out.println("Creta Engine is starting");
            }
        };

        System.out.println("Car #" + 5 +
                " : " + Car.getName() + "\n" +
                "Cylinder: " + Creta.getCylinders());
        Creta.startEngine();
        Creta.setSpeed();
        Creta.accelerate(25);
        Creta.getSpeed();
        Creta.brake();
        System.out.println(" ");


        Car seltos = new Seltos();
        System.out.println("Car #" + 6 +
                " : " + seltos.getName() + "\n" +
                "Cylinder: " + seltos.getCylinders());
        seltos.startEngine();
        seltos.setSpeed();
        seltos.accelerate(25);
        seltos.getSpeed();
        seltos.brake();
        System.out.println(" ");
    }

    public static Car randomCar() {

        // Math.random returns a random double positive value greater than and equal to 0.0 and lesser than 1.0
        // Multiplying 5 will give random number greater than and equal to 0.0 and lesser than 5.0
        // Adding 1 will give random number greater than and equal to 1.0 and lesser than and equal to 5.0
        int randomNumber = (int) (Math.random() * 4) + 1;

        System.out.println("Random number generated: " + randomNumber);
        return switch (randomNumber) {
            case 1 -> new XUV300();
            case 2 -> new Scorpio();
            case 3 -> new Thar();
            case 4 -> new Unknown();
            default -> null;
        };
    }
}
