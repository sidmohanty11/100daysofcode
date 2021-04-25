package com.codewithsid;

public class HealthyBurger extends Hamburger{
    private int cheese;
    private int olives;

    public HealthyBurger( int meat, double price) {
        super("BrownBread", meat, price);
    }

    @Override
    public int getMeat() {
        return super.getMeat();
    }

    @Override
    public int getLettuce() {
        return super.getLettuce();
    }

    @Override
    public int getTomato() {
        return super.getTomato();
    }

    @Override
    public int getMayonnaise() {
        return super.getMayonnaise();
    }

    @Override
    public int getCarrot() {
        return super.getCarrot();
    }

    @Override
    public void setLettuce(int lettuce) {
        super.setLettuce(lettuce);
    }

    @Override
    public void setTomato(int tomato) {
        super.setTomato(tomato);
    }

    @Override
    public void setMayonnaise(int mayonnaise) {
        super.setMayonnaise(mayonnaise);
    }

    @Override
    public void setCarrot(int carrot) {
        super.setCarrot(carrot);
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    public void setCheese(int cheese) {
        this.cheese = cheese;
    }

    public void setOlives(int olives) {
        this.olives = olives;
    }

    public int getCheese() {
        return cheese;
    }

    public int getOlives() {
        return olives;
    }

    @Override
    public double priceOfProducts() {
         double hamburgerPrice = super.priceOfProducts();
         hamburgerPrice += olives*1.5 + cheese*5.0;
         return hamburgerPrice;
    }
}
