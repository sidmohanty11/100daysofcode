package com.codewithsid;

public class Main {

    public static void main(String[] args) {
        // write your code here
        printMegaBytesAndKilobytes(2500);
        printMegaBytesAndKilobytes(9383);
    }
        public static void printMegaBytesAndKilobytes ( int kilobytes){
            if (kilobytes < 0) {
                System.out.println("Invalid Value");
            } else {
                System.out.println(kilobytes + " KB = " + kilobytes / 1024 + " MB and " + kilobytes % 1024 + " KB");
            }
        }
    }
