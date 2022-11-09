package com.JavaMasterclass;

public class DeluxeBurger extends Hamburger{

    private String message = "Cannot not add additional items to a deluxe burger\n" +
            "Deluxe hamburger on a White roll with Sausage & Bacon, price is 14.54\n" +
            "Added Chips for an extra 2.75\n" +
            "Added Drink for an extra 1.81";

    public DeluxeBurger(){
        super("Deluxe", "Sausage & Bacon",19.10, "White");
    }

    @Override
    public void addHamburgerAddition1(String additionName, double additionPrice) {
        System.out.println(message);
    }

    @Override
    public void addHamburgerAddition2(String additionName, double additionPrice) {
        System.out.println(message);
    }

    @Override
    public void addHamburgerAddition3(String additionName, double additionPrice) {
        System.out.println(message);
    }

    @Override
    public void addHamburgerAddition4(String additionName, double additionPrice) {
        System.out.println(message);
    }

//    @Override
//    public double itemizeHamburger() {
//        return 19.10;
//    }
}
