package com.codewithsid;

public class SelectionSort {
    public static void main(String[] args) {
//        In-place Algorithm
//            ->O(n^2)->quadratic
//            ->degrades quickly
//            ->unstable sort
//            ->doesn't swap much
        int[] array = {20,35,-15,7,55,1,-22};
        for(int last = array.length-1;last>0;last--){
            int largest = 0;
            for(int i=1;i<=last;i++){
                if(array[i] > array[largest]){
                    largest = i;
                }
            }
            swap(array,largest,last);
        }

        for (int j:array){
            System.out.println(j);
        }
    }
    public static void swap(int[] array, int i, int j){
        if(i == j){
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
