package com.playwithnumbers;

public class Series {
    public static int nSum(int n){
        if (n == 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        return n + nSum(n-1);
    }
    public static int factorial(int n){
        if (n == 0){
            return 1;
        }
        if (n == 1){
            return 1;
        }
        return n * factorial(n-1);
    }
    public static int fibonacii(int n){
        if (n == 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        return fibonacii(n-1)+fibonacii(n-2);
    }
}
