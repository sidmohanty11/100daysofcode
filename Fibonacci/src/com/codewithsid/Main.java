package com.codewithsid;

public class Main {

    public static void main(String[] args) {
        // Fibonacci problem: print the first n Fibonacci numbers
        int n = 10;
        System.out.println("First " + n + " Fibonacci numbers (Iterative):");
        fibonacciIterative(n);

        System.out.println("\nFirst " + n + " Fibonacci numbers (Recursive):");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciRecursive(i) + " ");
        }
    }

    /**
     * Prints the first n Fibonacci numbers iteratively.
     * @param n number of Fibonacci numbers to print
     */
    public static void fibonacciIterative(int n) {
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }

    /**
     * Calculates the nth Fibonacci number recursively.
     * @param n the index of the Fibonacci number to calculate
     * @return the nth Fibonacci number
     */
    public static int fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }
}
