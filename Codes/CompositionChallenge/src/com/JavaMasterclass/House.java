package com.JavaMasterclass;

public class House {
    private String houseName;
    private Room room;

    public House(String houseName, Room room){
        this.houseName = houseName;
        this.room = room;
    }

    private Room getRoom(){
        return room;
    }

    public void useFurniture(){
        room.useChair();
        room.eatOnTable();
        room.useWashroom();
        room.sitOnSofa();
//        getRoom().useChair();
//        getRoom().eatOnTable();
//        getRoom().useWashroom();
//        getRoom().sitOnSofa();
    }

    public void cleanFurniture(){
        room.cleanChair();
        room.cleanTable();
        room.cleanWashRoom();
    }


}
