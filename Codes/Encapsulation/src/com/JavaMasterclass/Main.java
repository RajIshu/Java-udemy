package com.JavaMasterclass;

public class Main {

    public static void main(String[] args) {
	/*
	    ENCAPSULATION:
	    -------------
	    Encapsulation describes the idea of bundling data and methods that work on that data
	    within one unit, like a class in Java.

	    Encapsulation is the mechanism that allows us to restrict access to certain components.

	    Encapsulation is a protective shield that prevents the data from being accessed by the
	    code outside this shield.

	    We can create a fully encapsulated class in Java by making all the data members of the
	    class 'private'. Now we can use setter and getter methods to set and get the data in it.
	*/

//        Player player = new Player();
//        player.name = "Tim";    // field name changed in Player class from 'name' to 'fullName'
////        player.health = 20;   // Missing field value
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health =  " + player.healthRemaining());
//
//        damage = 11;
//        player.health = 200; // Fields value can be changed anytime through unauthorised access.
//        player.loseHealth(damage);
//        System.out.println("Remaining health =  " + player.healthRemaining());

        EnhancedPlayer player = new EnhancedPlayer("Tim", 70, "Sword");
        System.out.println("Initial health is " + player.getHealth());
    }
}
