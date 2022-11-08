package com.JavaMasterclass;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	/*
	    Java Generics:
	    -------------
	    The Java Generics allows us to create a single class, interface, and method that can be used with different
	    types of data (objects).
	    This helps us to reuse our code.

	    NOTE: Generics does not work with primitive types (int, float, char, etc).

	    Generics means parameterized types.
	    The idea is to allow type (Integer, String, etc., and user-defined types) to be a parameter to methods,
	    classes, and interfaces.



	*/

        // Raw Type Declaration
        ArrayList items = new ArrayList();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add("Raj"); // This is correct, but it will give error at compile time.
        items.add(4);
        items.add(5);

        for(Object i : items) {
            System.out.println((Integer) i * 2);
        }

        // So it would be difficult to track these types of error in large code. So, here
        // comes Java Generics which enable us to use diamond braces (<>) to define type to the
        // Java classes.
        // For Example, see 'Team' Class

        // Parameterized Type Declaration or Generic Class Declaration - Use of Diamond braces
        ArrayList<Integer> items1 = new ArrayList<>();

        items1.add(1);
        items1.add(2);
        items1.add(3);
        items1.add(4);
        items1.add(5);
//        items1.add("Raj"); // It will give ERROR

        for(Integer i : items1) {
            System.out.println(i * 2);
        }


        // Player and Team Section

        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        adelaideCrows.addPlayer(joe);
//        adelaideCrows.addPlayer(pat); // Gives ERROR
//        adelaideCrows.addPlayer(beckham); // Gives ERROR

        System.out.println(adelaideCrows.numPlayers());

        Team<BaseballPlayer> chicagoCubs = new Team<>("Chicago Cubs");
        chicagoCubs.addPlayer(pat);

//        Team<String> anotherTeam = new Team<>("This won't work");
//        anotherTeam.addPlayer("Unknown"); // This will give a compilation error
        /* Reason for Error:
           We have type casted Player class in addPlayer method of Team class because we were using 'T' as
           Type Parameter.
           As we have type casted 'Player' class, so it was giving error when we passed 'String' class.

           To avoid these errors, we have to restrict the types that can be used as type arguments. This is called
           as Bound Type Parameter.

           Implementation of Bound Type Parameters:
           ---------------------------------------
           public class Team<T extends Player> { // Here, 'T' is a bound type parameter
           ...
           }
        */



    }
}
