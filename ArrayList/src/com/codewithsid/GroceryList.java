package com.codewithsid;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<>();
    public void addGroceryItem(String item){
        groceryList.add(item);
    }
    public void printGroceryItem(){
        System.out.println("You have "+groceryList.size()+" items in your grocery List");
        for (int i = 0; i<groceryList.size();i++){
            System.out.println(i+1 +"."+groceryList.get(i));
        }
    }
    public void modifyGroceryItem(int position,String newItem){
        groceryList.set(position,newItem);
        System.out.println("GroceryItem "+(position+1)+"has been modified");
    }
    public void removeGroceryItem(int position){
        String theItem = groceryList.get(position);
        groceryList.remove(position+1);
    }
    public String findItem(String searchItem){
        int position = groceryList.indexOf(searchItem);
        if (position>=0){
            return groceryList.get(position);
        }
        return null;
    }
}
