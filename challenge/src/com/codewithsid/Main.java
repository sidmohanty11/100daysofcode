package com.codewithsid;

public class Main {

    public static void main(String[] args) {
	// write your code here
        numberToWords(20);
    }
    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }
        int newNum = reverse(number);
        int difference = getDigitCount(number) - getDigitCount(newNum);
        if (number==0){
            System.out.println("Zero");
        }
        while (newNum > 0) {
            int lastDigit = newNum % 10;
            switch (lastDigit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
            newNum /= 10;
        }
        if (difference != 0) {
            for (int i = 0;i<difference;i++){
                System.out.println("Zero");
            }
        }
    }
    public static int reverse (int number){
        int reverse = 0;
        while (number!=0){
            int lastDigit = number%10;
            reverse = reverse*10 + lastDigit;
            number/=10;
        }
        return reverse;
    }
    public static int getDigitCount (int number){
        if (number<0){
            return -1;
        }
        if (number==0){
            return 1;
        }
        int count = 0;
        for (int i = number; i>0; i/=10){
            count++;
        }
        return count;
    }
}