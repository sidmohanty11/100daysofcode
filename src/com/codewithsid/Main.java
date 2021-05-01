package com.codewithsid;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(isPalindrome(-121));
        System.out.println(reverse(1534236469));
    }
    //leetcode
    public static boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        int y = x;
        int rev = 0,rem;
        while(x!=0){
            rem = x%10;
            rev = rev*10 + rem;
            x /= 10;
        }
        return rev == y;
    }
    //leetcode
    public static int reverse(int x) {
        if(x>Math.pow(-2,31) && x<(Math.pow(2,31)-1)){
            int rev = 0,rem;
            while(x!=0){
                rem = x%10;
                rev = rev*10 + rem;
                x /= 10;
            }
            return rev;
        }
        return 0;
    }
}
