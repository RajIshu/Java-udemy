package com.JavaMasterclass;

import java.util.ArrayList;

public class GroceryList{
    private ArrayList<String> groceryList = new ArrayList<>();

    public ArrayList<String> getGroceryList(){
        return groceryList;
    }

    public void addGroceryItem(String item){
        groceryList.add(item);
    }

    public void printGroceryList(){
        System.out.println("You have " + groceryList.size() + " items in your grocery list");

        for(int i = 0; i < groceryList.size(); i++){
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(int position, String newItem){
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position + 1) + " has been modified.");
    }

    public void modifyGroceryItem(String oldItem, String newItem){
        groceryList.set(groceryList.indexOf(oldItem), newItem);
        System.out.println("Grocery item " + oldItem + " has been modified.");
    }

    public void removeGroceryItem(int position){
        groceryList.remove(position);
//        String theItem = groceryList.get(position);
//        groceryList.remove(theItem);
    }

    public void removeGroceryItem(String itemName){
        groceryList.remove(itemName);
    }

    public String findAnItem(String searchItem){
//        boolean exists = groceryList.contains(searchItem);
        int position = groceryList.indexOf(searchItem);
        if(position >= 0){
            return groceryList.get(position);
        }
        return null;
    }
}
