package com.codewithsid;

public class Hamburger {
    private String breadRoll;
    private int meat;
    private int lettuce;
    private int tomato;
    private int mayonnaise;
    private int carrot;
    private double price;

    public Hamburger(String breadRoll, int meat, double price) {
        this.breadRoll = breadRoll;
        this.meat = meat;
        this.price = price;
    }

    public int getMeat() {
        return meat;
    }

    public int getLettuce() {
        return lettuce;
    }

    public int getTomato() {
        return tomato;
    }

    public int getMayonnaise() {
        return mayonnaise;
    }

    public int getCarrot() {
        return carrot;
    }

    public void setLettuce(int lettuce) {
        this.lettuce = lettuce;
    }

    public void setTomato(int tomato) {
        this.tomato = tomato;
    }

    public void setMayonnaise(int mayonnaise) {
        this.mayonnaise = mayonnaise;
    }

    public void setCarrot(int carrot) {
        this.carrot = carrot;
    }

    public double getPrice() {
        return price;
    }

    public String getBreadRoll() {
        return breadRoll;
    }

    public void setBreadRoll(String breadRoll) {
        this.breadRoll = breadRoll;
    }

    public void setMeat(int meat) {
        this.meat = meat;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double priceOfProducts(){

        double priceOfNormalBread = 1.5;
        double priceOfBrownBread = 2.5;
        double priceOfMeat = 5.0;
        double priceOfLettuce = 0.5;
        double priceOfTomato = 0.5;
        double priceOfMayonnaise = 1.0;
        double priceOfCarrot = 0.5;

        if (breadRoll.equals("NormalBread")) {
            System.out.println("priceOfNormalBread" +priceOfNormalBread);
            this.price +=  priceOfNormalBread;
        }else {
            System.out.println("priceOfBrownBread" +priceOfBrownBread);
            this.price +=priceOfBrownBread;
        }
        System.out.println("priceOfMeat" +priceOfMeat);
        this.price += priceOfMeat;

        System.out.println("priceOfCarrot" +priceOfCarrot + "priceOfLettuce"+priceOfLettuce+
                            "priceOfMayonnaise" +priceOfMayonnaise+"priceOfTomato"+priceOfTomato);
        this.price += (carrot*priceOfCarrot) + (mayonnaise*priceOfMayonnaise) +
                    (lettuce*priceOfLettuce) + ((tomato)*priceOfTomato);

        return price;
    }
}
