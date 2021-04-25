package com.codewithsid;

public class Furniture {
    private int beds;
    private int coolers;
    private int almirah;
    private int dressingTable;

    public Furniture(int beds, int coolers, int almirah, int dressingTable) {
        this.beds = beds;
        this.coolers = coolers;
        this.almirah = almirah;
        this.dressingTable = dressingTable;
    }

    public void whyCoolers(){
        System.out.println("Don't worry, it isn't working.");
    }

    public int noOfFurnitures(){
        System.out.println("Richie Rich... ");
        return this.beds+this.coolers+this.almirah+this.dressingTable;
    }

    public int getBeds() {
        return beds;
    }

    public int getCoolers() {
        return coolers;
    }

    public int getAlmirah() {
        return almirah;
    }

    public int getDressingTable() {
        return dressingTable;
    }
}
