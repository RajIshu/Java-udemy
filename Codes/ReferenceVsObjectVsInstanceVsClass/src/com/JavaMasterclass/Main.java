package com.JavaMasterclass;

public class Main {

    public static void main(String[] args) {
	    /*
            Let's understand these words using analogy of building a house.

            A CLASS is basically a blueprint for a house, using the blueprint (plans) we can build as
            many houses as we like based on those plans.

            Each house you build (in other words instantiate using the new operator) is an OBJECT
            also known as an INSTANCE.

            Each house you build has an address (a physical location). In other words if you want to
            tell someone where you live, you give them your address (perhaps written on a piece of
            paper). This is known as a REFERENCE.

            You can copy that REFERENCE as many times as you like but there is still just one house.
            In other words we are copying the paper that has address on it not the house itself.


            In programming terms,
                We can pass references as parameters to constructors and methods.
	    */

        House blueHouse = new House("blue");
        House anotherHouse = blueHouse;

        /*
            Here,
                House is class
                new House("blue") is creating an instance or a object of the 'House' class
                blueHouse, anotherHouse are the references to a same object or instance
        */

        System.out.println(blueHouse.getColor());
        System.out.println(anotherHouse.getColor());
    }
}
