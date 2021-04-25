package com.codewithsid;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Anything {
                    //SOME WARMUP PROBLEM'S SOLUTIONS OF HACKERRANK

    public static void lottery(){

    }

//    // Complete the sockMerchant function below.
//    static int sockMerchant(int n, int[] ar) {
//
//        for(int i =0;i<n ;i++){
//            int temp = ar[0];
//            if (temp == ar[i]){
//
//            }
//        }
//
//    }

//    // Complete the migratoryBirds function below.
//    static int migratoryBirds(List<Integer> arr) {
//        int max = 0;
//        int[] count = new int[6];
//        for (int i = 0; i<arr.size();i++){
//            if (arr.get(i) == 1) {
//                count[i]++;
//                max = Math.max(i,count[i]);
//            }
//        }
//        for (int i =0;i<count.length;i++){
//            if (count[i] == max){
//                return i;
//            }
//        }
//    }

    // Complete the divisibleSumPairs function below.
//    static int divisibleSumPairs(int n, int k, int[] ar) {
//        int count = 0;
//        for (int i=0; i<n;i++){
//            for (int j=i+1;j<n;j++) {
//                if ((ar[i] + ar[j]) % k == 0){
//                    count++;
//                }
//            }
//        }
//        return count;
//    }

    // Complete the designerPdfViewer function below.
//    static int designerPdfViewer(int[] h, String word) {
//        int max = 0;
//        int index = 0;
////        String alp = "abcdefghijklmnopqrstuvwxyz";
////        char[] alpha = alp.toCharArray();
//        List<Integer> heights = new ArrayList<>();
//        for (int i = 0;i<26;i++){
//            heights.add(h[i]);
//        }
//        for (int i =0; i<word.length();i++){
//            index = word.charAt(i) - 97;
//            if (heights.get(index)>max){
//                max = heights.get(index);
//            }
//        }
//        return word.length()*max;
//    }

    // Complete the bonAppetit function below.
//    static void bonAppetit(List<Integer> bill, int k, int b) {
//        int total = 0;
//        int more = 0;
//        for (Integer integer : bill) {
//            total += integer;
//        }
//        if ((total- bill.get(k))/2 == b){
//            System.out.println("Bon Appetite");
//        }else {
//            more = bill.get(k)/2;
//            System.out.println(more);
//        }
//
//    }

    // Complete the angryProfessor function below.
//    static String angryProfessor(int k, int[] a) {
//        int arrivedOnTime = 0;
//        for (int j : a) {
//            if (j <= 0) {
//                arrivedOnTime++;
//            }
//        }
//        if (arrivedOnTime >= k){
//            return "YES";
//        }else {
//            return "NO";
//        }
//
//    }
//

    /*
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */

//    public static int countingValleys(int steps, String path) {
//        // Write your code here
//        int alt = 0;
//        int valleys = 0;
//        for (int i = 0; i<steps;i++){
//            if (path.charAt(i) == 'U'){
//                if (alt == -1){
//                    valleys++;
//                }
//                alt++;
//            }
//            if (path.charAt(i) == 'D'){
//                alt--;
//            }
//        }
//        return valleys;
//    }


//    static String catAndMouse(int x, int y, int z) {
//        if (Math.abs(z-y) > Math.abs(z-x)){
//            return "Cat A";
//        }else if (Math.abs(z-y) < Math.abs(z-x)){
//            return "Cat B";
//        }else {
//            return "Mouse C";
//        }
//
//    }


//    static int[] breakingRecords(int[] scores) {
//        int max = scores[0];
//        int min = scores[0];
//        int maxCount = 0;
//        int minCount = 0;
//        for (int i = 0; i< scores.length;i++){
////            for(int j = i+1;j< scores.length;j++){
//                if (scores[i]<min){
//                    min = scores[i];
//                    minCount++;
//                }
//                if (scores[i]>max){
//                    max = scores[i];
//                    maxCount++;
//                }
////            }
//        }
//        return new int[]{minCount,maxCount};
//    }

//    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
//        int countApples = 0;
//        int countOranges = 0;
//        for (int i : apples){
//            if (apples[i]+a>=s && apples[i]+a<=t){
//                countApples++;
//            }
//        }
//        for (int i: oranges){
//            if (oranges[i]+b>=s && oranges[i]+b<=t){
//                countOranges++;
//            }
//        }
//        System.out.println(countApples);
//        System.out.println(countOranges);
//    }

    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

//    public static List<Integer> gradingStudents(List<Integer> grades) {
//        // Write your code here
//        List<Integer> rounded = new ArrayList<>();
//
//        for (int i = 0; i < grades.size(); i++) {
//            if (grades.get(i) <= 100 && grades.get(i) >= 0) {
//                int x = grades.get(i);
//                if (x >= 38) {
//                    int rem = x % 5;
//                    int count = 5 -rem;
//                    if (count <3){
//                        rounded.add(i, x+count);
//                    } else{
//                        rounded.add(i, x);
//                    }
//                } else {
//                    rounded.add(i, x);
//                }
//            }
//        }
//        return rounded;
//    }



    /*
     * Complete the timeConversion function below.
     */
//    static String timeConversion(String s) {
//        /*
//         * Write your code here.
//         */
//        String[] time = s.split(":");
//        int hr = Integer.parseInt(time[0]);
//        if ()
//    }

    /*
     * Complete the 'birthdayCakeCandles' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY candles as parameter.
     */

//    public static int birthdayCakeCandles(List<Integer> candles) {
//        // Write your code here
//        int max = candles.get(0);
//        for (int i : candles){
//            if (i>max){
//                max = i ;
//            }
//        }
//        int count = 0;
//        for (int n : candles){
//            if (n == max){
//                count++;
//            }
//        }
//        return count;
//    }
//


//    static void miniMaxSum(int[] arr) {
//        int min = arr[0],max = arr[0],temp =0;//sum will be long
//        for (int i : arr) {
//            temp += i;
//            if (i < min) {
//                min = i;
//            }
//            if (i > max) {
//                max = i;
//            }
//        }
//        System.out.println((temp-max)+" "+(temp-min));
//    }

    // Complete the compareTriplets function below.
//    static void staircase(int n) {
//        for (int i = 1;i<=n;i++){
//            for (int j = 1; j<=n-i;j++){
//                System.out.print(" ");
//            }
//            for (int k = 1; k<=i;k++){
//                System.out.print("#");
//            }
//            System.out.println();
//        }
//    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("================================");
//        for(int i=0;i<3;i++)
//        {
//            String s1=sc.next();
//            int x=sc.nextInt();
//            //Complete this line
//            System.out.printf("'%15s' %n", s1);
//
//        }
//        System.out.println("================================");
//    }
    }
}