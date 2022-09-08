package com.JavaMasterclass;

public class Room {
    private String name;
    private int sofa;
    private int washroom;
    private int table;
    private int chair;

    public Room(String name, int sofa, int washroom, int table, int chair){
        this.name = name;
        this.sofa = sofa;
        this.washroom = washroom;
        this.table = table;
        this.chair = chair;
    }

    public void sitOnSofa(){
        System.out.println("Sofa is being used.");
    }

    public void useWashroom(){
        System.out.println("Washroom Occupied.");
    }

    public void eatOnTable(){
        System.out.println("Table is being used.");
    }

    public void useChair(){
        System.out.println("Chair Occupied.");
    }

    public void cleanSofa(){
        System.out.println("Sofa cleaning.");
    }

    public void cleanWashRoom(){
        System.out.println("Washroom cleaning.");
    }

    public void cleanTable(){
        System.out.println("Table cleaning.");
    }

    public void cleanChair(){
        System.out.println("Chair cleaning.");
    }

}

