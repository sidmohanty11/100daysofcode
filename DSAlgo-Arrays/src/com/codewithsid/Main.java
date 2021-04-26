package com.codewithsid;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] intArray = new int[7];//size must be initialized
        intArray[0] = 20;
        //0 to 6 index
        //7 will give IndexOutOfBound Exception
        for (int j : intArray) {
            System.out.println(j);//to print out an array
        }
    }
}
