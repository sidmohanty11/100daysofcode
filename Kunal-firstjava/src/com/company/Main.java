package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    // Write a program to print factorial of a number, also take input.
    public static int factorial(int x) {
        if (x == 1 || x == 0) {
            return 1;
        }
        return x * factorial(x - 1);
    }

    // Write a program to print whether a number is even or odd, also take input.
    public static void evenOrOdd(int x) {
        if (x % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }

    // Take name as input and print a greeting message for that name.
    public static void greet(String x) {
        System.out.println("Hello, " + x);
    }

    // Write a program to input principle, time and rate (P, T, R) from user and find Simple Interest.
    public static void SI(int p, int t, int r) {
        System.out.println((p*t*r)/100);
    }

    // Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
    public static void calc(int x, int y, String operator) {
        switch (operator) {
            case "+" -> System.out.println(x + y);
            case "-" -> System.out.println(x - y);
            case "*" -> System.out.println(x * y);
            case "/" -> System.out.println(x / y);
        }
    }

    // Take 2 numbers as input and print the largest number.
    public static int largest(int x, int y, String operator) {
        return Math.max(x, y); // x > y ? x : y;
    }

    // Input a number and print all the factors of that number (use loops).
    public static void factors(int x) {
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                System.out.println(i);
            }
        }
    }

    // Input currency in rupee and output in dollar.
    public static String rupeeToDollar(int x) {
        return "$" + x * 71;
    }

    // Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
    public static void sum() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while(true) {
            if(scanner.nextInt() == 0) {
                System.out.println(sum);
                System.exit(0);
            }
            int temp = scanner.nextInt();
            sum+=temp;
        }
    }

    // Take integer inputs till the user enters 0 and print the largest number from all.
    public static void largestOfAll() {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        while(true) {
            if(scanner.nextInt() == 0) {
                System.out.println(max);
                System.exit(0);
            }
            int temp = scanner.nextInt();
            if (temp > max) {
                max = temp;
            }
        }
    }
}
