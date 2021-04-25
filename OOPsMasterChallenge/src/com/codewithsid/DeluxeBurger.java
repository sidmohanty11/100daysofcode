package com.codewithsid;

public class DeluxeBurger extends Hamburger{
    private int chips;
    private int drinks;

    public DeluxeBurger(String breadRoll, int meat, double price) {
        super(breadRoll, meat, price);
    }

    public int getChips() {
        return chips;
    }

    public int getDrinks() {
        return drinks;
    }

    public void setChips(int chips) {
        this.chips = chips;
    }

    public void setDrinks(int drinks) {
        this.drinks = drinks;
    }

    @Override
    public int getMeat() {
        return super.getMeat();
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public double priceOfProducts() {
        double priceOfNormalBread = 1.5;
        double priceOfBrownBread = 2.5;
        double priceOfMeat = 5.0;
        double priceOfChips = 10.0;
        double priceOfDrinks = 9.99;
        double x = getPrice();

        if (getBreadRoll().equals("NormalBread")) {
            System.out.println("priceOfNormalBread" +priceOfNormalBread);
            x +=  priceOfNormalBread;
        }else {
            System.out.println("priceOfBrownBread" +priceOfBrownBread);
            x +=priceOfBrownBread;
        }
        System.out.println("priceOfMeat" +priceOfMeat);
        x += priceOfMeat;

        x+= (chips*priceOfChips) + (drinks*priceOfDrinks);

        return x;
    }
}
