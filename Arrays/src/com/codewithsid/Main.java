package com.codewithsid;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    int[] array = new int[5];
        reverse(array);
    }


    public static void reverse(int[] array){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i<array.length; i++){
            System.out.println("Enter number:");
            int number = scanner.nextInt();
            array[i] = number;
        }

        System.out.println("Entered array - "+Arrays.toString(array));

        int temp = 0;
        int halfLength = array.length/2;
        for (int i = 0; i<halfLength;i++){
            temp = array[i];
            array[i] = array[array.length-i-1];
            array[array.length-1-i]=temp;
        }
        System.out.println("Reversed array - "+Arrays.toString(array));
    }
}




