package com.codewithsid;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int count = 0;
        for (int i = 1; i < 9999999; i++) {
            if (isPrime(i)) {
                count ++;
                System.out.println(i+" is a prime number");
                if (count == 3) {
                    System.out.println("exit");
                    break;
                }
            }

        }
    }
        public static boolean isPrime(int n){
                if (n == 1){
                    return false;
                }
        for (int i =2 ; i <= (long)Math.sqrt(n) ; i++ ){
              if (n%i==0){
                return false;
                }
            }
            return true;
        }
    }
