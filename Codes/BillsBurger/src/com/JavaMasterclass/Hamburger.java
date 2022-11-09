package com.JavaMasterclass;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String addition1Name = null;
    private double addition1Price;
    private String addition2Name = null;
    private double addition2Price;
    private String addition3Name = null;
    private double addition3Price;
    private String addition4Name = null;
    private double addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
        System.out.println(name + " hamburger on a " + breadRollType + " roll with " + meat + ", price is " + price);
    }

    public void addHamburgerAddition1(String additionName, double additionPrice) {
        this.addition1Name = additionName;
        this.addition1Price = additionPrice;
    }

    public void addHamburgerAddition2(String additionName, double additionPrice) {
        this.addition2Name = additionName;
        this.addition2Price = additionPrice;
    }

    public void addHamburgerAddition3(String additionName, double additionPrice) {
        this.addition3Name = additionName;
        this.addition3Price = additionPrice;
    }

    public void addHamburgerAddition4(String additionName, double additionPrice) {
        this.addition4Name = additionName;
        this.addition4Price = additionPrice;
    }

    public double itemizeHamburger(){
        double total = price;
        if(addition1Name != null){
            System.out.println("Added " + addition1Name + " for an extra " + addition1Price);
            total += addition1Price;
        }

        if(addition2Name != null){
            System.out.println("Added " + addition2Name + " for an extra " + addition2Price);
            total += addition2Price;
        }

        if(addition3Name != null){
            System.out.println("Added " + addition3Name + " for an extra " + addition3Price);
            total += addition3Price;
        }

        if(addition4Name != null){
            System.out.println("Added " + addition4Name + " for an extra " + addition4Price);
            total += addition4Price;
        }

        return total;
    }
}
