package com.codewithsid;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Printer printer = new Printer(0,false);
        printer.fillUpToner(50);
        printer.fillUpToner(3);
        printer.printingAPage(20);
        printer.fillUpToner(545);
        printer.printingAPage(100);
    }
}
