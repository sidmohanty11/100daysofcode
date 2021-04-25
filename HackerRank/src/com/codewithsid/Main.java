package com.codewithsid;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        //write your code here
//        Scanner scanner = new Scanner(System.in);
//        int lengthOfString = scanner.nextInt();
//        scanner.nextLine();
//        String s = scanner.nextLine();
//        int x= 0;
//        int y = 0;
//        for (int i = 0; i<lengthOfString;i++) {
//            for (int j =i+2; j<s.length();j++) {
//                if (s.substring(i, j).equals("20")){
//                    x++;
//                }else if (s.substring(i,j-1).equals("2") && s.substring(i, j + 1).equals("020")){
//                    y++;
//                }
//            }
//        }
//        if (x == 2 || y==1){
//            System.out.println("YES");
//        }else {
//            System.out.println("NO");
//        }
//


        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i<test;i++){
            int y =  scanner.nextInt();
            a.add(y);
        }
        if (test>3) {
            Collections.swap(a,1,a.size()-1);
            for (int i =1;i< a.size()/2;i++){
                Collections.swap(a,i,a.size()-i);
            }
            for (int i =0; i<a.size();i++) {
                System.out.print(i);
            }
        }else {
            for (int i =0; i<a.size();i++) {
                System.out.print(i);
            }
        }
    }
}