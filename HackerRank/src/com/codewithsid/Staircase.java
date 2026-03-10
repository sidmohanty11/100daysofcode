package com.codewithsid;

import java.util.Scanner;

public class Staircase {

    /**
     * Staircase detail
     *
     * This is a staircase of size n = 4:
     *    #
     *   ##
     *  ###
     * ####
     * Its base and height are both equal to n. It is drawn using # symbols and spaces. The last line is not preceded by any spaces.
     * Write a program that prints a staircase of size n.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter staircase size: ");
        int n = scanner.nextInt();
        staircase(n);
        scanner.close();
    }

    public static void staircase(int n) {
        for (int i = 1; i <= n; i++) {
            // print spaces
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            // print hashes
            for (int j = 0; j < i; j++) {
                System.out.print("#");
            }
            // new line
            System.out.println();
        }
    }
}
