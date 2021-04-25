package com.codewithsid;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Hamburger hamburger = new Hamburger("NormalBread",2,0);
        hamburger.setCarrot(10);
        System.out.println(hamburger.getPrice());

        HealthyBurger healthyBurger = new HealthyBurger(2,0.0);
        healthyBurger.setCarrot(10);
        healthyBurger.setMayonnaise(10);
        healthyBurger.setOlives(10);
        System.out.println(healthyBurger.priceOfProducts());


        DeluxeBurger deluxeBurger = new DeluxeBurger("NormalBread",2,0);
        deluxeBurger.setChips(10);
        deluxeBurger.setDrinks(10);
        System.out.println(deluxeBurger.priceOfProducts());
    }
}
