package com.codewithsid;

public class BubbleSort {

    public static void main(String[] args) {
	// write your code here
        //*bubble sort*
//        In-place Algorithm
//            ->O(n^2)->quadratic
//            ->degrades quickly
//            ->stable sort
        int[] array = {20,35,-15,7,55,1,-22};
        for(int last = array.length-1;last>0;last--){
            for(int i=0;i<last;i++){
                if(array[i] > array[i+1]){
                    swap(array,i,i+1);
                }
            }
        }
        for (int j : array) {
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
//stable vs unstable sorts!
//unstable sort -> relative position is not preserved
//stable sort -> relative position is preserved