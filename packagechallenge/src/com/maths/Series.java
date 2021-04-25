package com.maths;

public class Series {
    public static int nSum(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n == 1 ? 1 : n + nSum(n - 1);
        }
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n == 1 ? 1 : n * factorial(n - 1);
        }
    }

    public static int fibonacii(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n == 1 ? 1 : fibonacii(n - 1) + fibonacii(n - 2);
        }
    }
}
