package com.JavaMasterclass;

public class VipCustomer {

    private String name;
    private double creditLimit;
    private String email;


    public VipCustomer(){
        this("Default Name", 2500.00, "defaultemail@gmail.com");
    }

    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "unknown@gmail.com");
    }

    public VipCustomer(String name, double creditLimit, String email){
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
