package com.codewithsid;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Furniture furniture = new Furniture(1,1,2,1);
        DecorativeStuffs decorativeStuffs = new DecorativeStuffs(5,4,3);
        WallHangings wallHangings = new WallHangings(8);
        SidRoom theSidRoom = new SidRoom(3,1,4,furniture,
                decorativeStuffs,wallHangings);

        System.out.println(theSidRoom.furniture.noOfFurnitures());

        System.out.println(theSidRoom.decorativeStuffs.getFlowers());
    }
}
