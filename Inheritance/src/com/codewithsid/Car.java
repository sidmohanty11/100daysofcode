package com.codewithsid;

public class Car extends Vehicle {
    private int gears;
    private int wheels;

    public Car(int steering, int speed, int gears,int wheels) {
        super(steering, speed);
        this.gears = gears;
        this.wheels = wheels;
    }
}
