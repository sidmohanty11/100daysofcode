package com.codewithsid;

public class Printer {
    private int tonerLevel;
    private int noOfPagesPrinted;
    private boolean isADuplexPrinter;

    public Printer(int tonerLevel, boolean isADuplexPrinter) {
        this.tonerLevel = tonerLevel;
        this.isADuplexPrinter = isADuplexPrinter;
        this.noOfPagesPrinted = 0;
    }

    public void fillUpToner(int filling) {
        if (this.tonerLevel >= 0 && this.tonerLevel <= 100) {
            if (filling <= 100 && filling >= 0) {
                this.tonerLevel += filling;
                if (this.tonerLevel + filling <= 100) {
                    System.out.println("filled up toner to " + tonerLevel);
                }
            }
            else {
                this.tonerLevel = 100;
                System.out.println("filled up toner to " + 100);
            }
        }
    }

        public void printingAPage(int pageprinting){
            if (this.tonerLevel > 0 && this.tonerLevel <= 100) {
                if (pageprinting <= this.tonerLevel) {
                    System.out.println("I am happy to say that I can help you.. I am in stock..");
                    if (isADuplexPrinter) {
                        this.noOfPagesPrinted = (pageprinting / 2) + (pageprinting%2);
                    } else {
                        this.noOfPagesPrinted = pageprinting;
                    }
                    System.out.println("pages printed = " + noOfPagesPrinted);
                } else {
                    System.out.println("I am sorry but I am out of stock. Please refill me.");
                }
            }
        }
    }

