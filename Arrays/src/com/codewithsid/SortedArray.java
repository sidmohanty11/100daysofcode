package com.codewithsid;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {

    public static void printArray(int[] array){
        for(int i =0; i<array.length; i++){
            System.out.println("Element "+i+" contents "+array[i]);
        }
    }

    public static int[] getIntegers(int number) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number of values you want to enter : "+number);
        int[] value = new int[number];

        for (int i = 0; i < value.length; i++) {
            value[i] = scanner.nextInt();
        }
        return value;
    }

    public static int[] sortIntegers(int[] array) {
        int[] a = new int[array.length];
        int max;
        int temp = 0;

        for (int i = 0; i<a.length; i++){
            a[i] = array[i];
        }
        //System.arraycopy(array, 0, a, 0, a.length);
        //also works

        for (int i = 0; i < a.length; i++) {
            max = i;
            for (int j = i+1; j<a.length; j++){
                if (a[j]>a[max]){
                    max = j;
                }
            }
            temp = a[i];
            a[i] = a[max];
            a[max]= temp;
        }
        return a;
    }
}
