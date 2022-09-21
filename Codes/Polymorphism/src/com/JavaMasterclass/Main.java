package com.JavaMasterclass;

class Movie{
    private String name;

    public Movie(String name){
        this.name = name;
    }

    public String plot(){
        return "No plot here";
    }

    public String getName(){
        return name;
    }
}

class Jaws extends Movie{
    public Jaws(){
        super("Jaws");
    }

    public String plot(){
        return "A shark eats lots of people.";
    }
}

class IndependenceDay extends Movie{
    public IndependenceDay(){
        super("Independence Day");
    }

    public String plot(){
        return "Aliens try to take over the planet Earth.";
    }
}

class OMG extends Movie{
    public OMG(){
        super("Oh My God!");
    }

    public String plot(){
        return "A businessman tries to sue God.";
    }
}

class GoW extends Movie{
    public GoW(){
        super("Gangs of Wasseypur");
    }

    public String plot(){
        return "Gang war between Sultans and Qureshis in the city of Dhanbad.";
    }
}

class Forgettable extends Movie{
    public Forgettable(){
        super("Forgettable Movie");
    }

    // No plot
}



public class Main {

    // method will return a random movie
    public static Movie randomMovie(){

        // Math.random returns a random double positive value greater than and equal to 0.0 and lesser than 1.0
        // Multiplying 5 will give random number greater than and equal to 0.0 and lesser than 5.0
        // Adding 1 will give random number greater than and equal to 1.0 and lesser than and equal to 5.0
        int randomNumber = (int)(Math.random() * 5) + 1;

        System.out.println("Random number generated: " + randomNumber);
        return switch (randomNumber) {
            case 1 -> new Jaws();
            case 2 -> new IndependenceDay();
            case 3 -> new OMG();
            case 4 -> new GoW();
            case 5 -> new Forgettable();
            default -> null;
        };
        /*
        Above Code is similar to this:

            switch (randomNumber) {
                case 1:
                    return new Jaws();
                case 2:
                    return new IndependenceDay();
                case 3:
                    return new OMG();
                case 4:
                    return new GoW();
                case 5:
                    return new Forgettable();
                default:
                    return null;
            }
        */
    }

    public static void main(String[] args) {
	/*
	    POLYMORPHISM:
	    ------------
	    The word polymorphism means having many forms.

	    Real-life Illustration:
	    A person at the same time can have different characteristics. Like a man
	    at the same time is a father, a husband, an employee. So the same person
	    possesses different behavior in different situations. This is called
	    polymorphism.

	    Polymorphism allows us to perform a single action in different ways.

	    Polymorphism occurs when we have many classes that are related to each
	    other by inheritance.

	    Types of polymorphism:
	    ---------------------
            1. Compile-time Polymorphism
                    - It is also known as static polymorphism.
                    - This type of polymorphism is achieved by function overloading
                      or operator overloading.

               Note: But Java doesn't support the Operator Overloading.

            2. Runtime Polymorphism
                    - It is also known as Dynamic Method Dispatch.
                    - This type of polymorphism is achieved by Method Overriding.


        NOTE: Moddable Classes are the classes which can be modded (modified by the end user).
	*/

        for(int i=1; i<11; i++) {
            Movie movie = randomMovie();

            System.out.println("Movie #" + i +
                    " : " + movie.getName() + "\n" +
                    "Plot: " + movie.plot() + "\n");
        }
    }
}
