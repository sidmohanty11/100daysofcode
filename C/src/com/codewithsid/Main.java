package com.codewithsid;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Wall wall1 = new Wall("WEST");
        Wall wall2 = new Wall("EAST");
        Wall wall3 = new Wall("NORTH");
        Wall wall4 = new Wall("SOUTH");

        Ceiling ceiling = new Ceiling(10,5);

        Bed bed = new Bed("Modern",4,3,1,1);

        Lamp lamp = new Lamp("Classic", false,75);


        Bedroom bedroom = new Bedroom("Sid's",wall1,wall2,wall3,wall4,ceiling,bed,lamp);
        bedroom.makeBed();
    }
}
