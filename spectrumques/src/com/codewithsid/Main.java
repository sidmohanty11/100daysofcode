package com.codewithsid;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        alphaNumera();
    }
//You are given an array of integers, as well as a number n.
// You have to find and print the index of the number n in the given array.
// Note: the number n occurs only once in the whole array.
// Additionally, if the number n doesn't exist in the array, print "Number not found".
    public static int searchNum(int n){
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt(); //input the num to search
        int[] x = {1,2,3,4,5,6,7}; // initialized array, because length is not defined in the q
        //otherwise can use arraylists to store (Java Collection Library) which is mutable
        for(int i=0;i<x.length;i++){
            if(x[i] == n){
                return i;
            }
        }
        System.out.println("Number not found");
        return -1;
    }
//Write a program to check if a given String is Palindrome or not.
    public static boolean palindrome(String s){
        Scanner scanner = new Scanner(System.in);
        s = scanner.nextLine();
        boolean flag = false;
        String rev = "";
        for(int i=0;i<s.length();i++){
            rev += s.charAt(s.length()-i-1);
        }
        if(s.equals(rev)){
            flag=true;
        }
        return flag;
    }
//You are given two numbers, a and b. You have to find the absolute difference of the two numbers.
    public static int absDiff(int a, int b){
        if(a-b < 0){
            return -(a-b);
        }
        return a-b;
    }
//Write a program to sort all the digits of a given number.
    public static int sortDigs(int x){
        String s = String.valueOf(x);
        int[] arr = new int[s.length()];
        //storing digits
        int temp = x;
        for(int z=0; z<arr.length; z++){
            arr[z] = temp%10;
            temp = temp/10;
        }
        //sorting(bubble sort)
        for(int last = arr.length-1;last>0;last--){
            for(int i=0;i<last;i++){
                if(arr[i] > arr[i+1]){
                    swap(arr,i,i+1);
                }
            }
        }
        //concatenating
        int j, k = 0;
        for (j = 0; j < arr.length; j++)
            k = 10 * k + arr[j];

        return k;
    }
    public static void swap(int[] array, int i, int j){
        if(i == j){
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
//Write a code to perform the following operation: Take a 5 digit number as input (for ex : 13623)
// and output the following number which is equal to
// :- 1st number x 1 - 2nd number x 2 + 3rd number x 3 - 4th number x 4 + 5th number x 5. *
    public static int magicValue(int x){
        String s = String.valueOf(x);
        int mul = 5;
        int magic=0;
        int[] arr = new int[s.length()];
        for(int z=0; z<arr.length; z++){
            arr[z] = x%10 * mul;
            x = x/10;
            mul--;
            if((z+1) % 2 == 0){
                magic = magic - arr[z];
            }else {
                magic = magic + arr[z];
            }
        }
        return magic;
    }
//There are n people in a room. You have to find the total number of handshakes .
// Write a code based on the same.
    public static int handshakes(int n){
        return (n*(n-1))/2;
    }
//Using the divisibility rule of 11, find if an input number is divisible by 11 or not.
// You are not allowed to use percentile operator.
    public static boolean the11thDivisibility(int x){
        int temp = x;
        int count = 0;
        while(temp != 0){
            count++;
            System.out.println(count);
            if(count == 11){
                count = 0;
            }
            temp--;
        }
        return count == 0;
    }
//Write a program which should accept inputs till the point user inputs the word "End".
// The program should also give an output based on the following conditions:
// 1 - If the input is an alphabet, print "alpha" 2- If the input is a number, print "numera"
    public static void alphaNumera(){
        Scanner scanner = new Scanner(System.in);
        String x = "";
        while (true) {
            x = scanner.nextLine();
            if(x.equals("End")){
                break;
            }
            char y = x.charAt(0);
            if (x.length() == 1 && (int)y>=48 && (int)y<=57) {
                System.out.println("numera");
            } else {
                System.out.println("alpha");
            }
        }
    }

    //Write a code to perform the following operation: Take a 5 digit number
    // as input (for ex : 13623) and output the following number which is
    // equal to :- 1st number x 1 + 2nd number x 4 + 3rd number x 9 + 4th number
    // x 16 + 5th number x 25.




    //Write a program to find all the prime number in a particular range.




    //Write a code to perform division without using '/' operator.




    //Write a program to accept a list of numbers from the user, and then
    // find which number occurs twice. Note: Only one number will occur twice
    // in the input list of numbers.



    //Given an alphanumeric string as input, you have to find the number of vowels,
    // consonants and numbers present in the string, and print the count of each.




    //Write a code to find the square root of a number without using any inbuilt function.



    //Given a number in decimal format, you have to find the binary representation of that number.
}
