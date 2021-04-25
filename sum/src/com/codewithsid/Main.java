package com.codewithsid;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int number = 4;
        int finishNumber = 20;
        int count = 0;
        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)){
                continue;
            }
            System.out.println("even number "+number);
            count++;
            if (count >= 5){
                System.out.println("total even numbers = "+count);
                break;
            }
        }
    }

    public static boolean isOdd(int number) {
        if (number > 0) {
            if ((number + 1) % 2 == 0) {
                return true;
            }
            return false;
        }
        return false;
    }


    public static int sumOdd(int start, int end) {
        int sum = 0;
        if (start > 0 && start <= end) {
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sum += i;
                }
            }
            return sum;
        }
        return -1;
    }
    public static boolean isEvenNumber (int number){
        if (number%2 == 0){
            return true;
        }
        return false;
    }
}