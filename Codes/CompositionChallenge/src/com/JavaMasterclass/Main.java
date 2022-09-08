package com.JavaMasterclass;

public class Main {

    public static void main(String[] args) {
	/* CHALLENGE:
	   ---------
	   Create a single room of a house using composition.
       Think about the things that should be included in the room.
       Maybe physical parts of the house but furniture as well.
       Add at least one method to access an object via a getter and
       then that objects public method as you saw in the previous video
       then add at least one method to hide the object e.g. not using a getter
       but to access the object used in composition within the main class
       like you saw in this video.
	*/

        Room livingRoom = new Room("Living Room", 5, 2, 2, 12);
        House RajHouse = new House("Vaikunthapuram", livingRoom);

//        RajHouse.getRoom().sitOnSofa();
//        RajHouse.getRoom().eatOnTable();

        RajHouse.useFurniture();
        RajHouse.cleanFurniture();
    }
}
