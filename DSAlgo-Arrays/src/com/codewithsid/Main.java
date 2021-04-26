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
        //for retrieval when you don't know the index = O(n)
        //for retrieval when you know the index = O(1)
        //add an element to a full array = O(n)
        //add an element (if space) = O(1)
        //inserting = O(1)
        //deleting an element by setting it to null = O(1)
        //searching and updating = O(n)
        //delete an element by shifting elements = O(n)
    }
}
