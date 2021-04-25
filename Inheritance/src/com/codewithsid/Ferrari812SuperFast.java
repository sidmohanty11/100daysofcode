package com.codewithsid;

public class Ferrari812SuperFast extends Car {
    private String name;
    private int topSpeed;
    private int doors;
    private String color;

    public Ferrari812SuperFast(int speed, String name, String color) {
        super(1, speed, 6,4);
        this.name = name;
        this.topSpeed = 230;
        this.doors = 2;
        this.color = color;
    }
}
