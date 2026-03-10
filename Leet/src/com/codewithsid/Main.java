package com.codewithsid;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Test Two Sum
        TwoSum twoSum = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        System.out.println("Two Sum [2, 7, 11, 15], target 9: " + Arrays.toString(twoSum.solve(nums, target)));

        // Test Palindrome Number
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        int x = 121;
        System.out.println("Is 121 a palindrome? " + palindromeNumber.isPalindrome(x));
        int y = -121;
        System.out.println("Is -121 a palindrome? " + palindromeNumber.isPalindrome(y));

        // Test Reverse Integer
        ReverseInteger reverseInteger = new ReverseInteger();
        int val = 123;
        System.out.println("Reverse of 123 is: " + reverseInteger.reverse(val));
        int val2 = -123;
        System.out.println("Reverse of -123 is: " + reverseInteger.reverse(val2));

        // Test Roman to Integer
        RomanToInteger romanToInteger = new RomanToInteger();
        String s = "LVIII"; // 58
        System.out.println("Roman 'LVIII' to Integer: " + romanToInteger.romanToInt(s));
        String s2 = "MCMXCIV"; // 1994
        System.out.println("Roman 'MCMXCIV' to Integer: " + romanToInteger.romanToInt(s2));

        // Test Valid Parentheses
        ValidParentheses validParentheses = new ValidParentheses();
        String p1 = "()[]{}";
        System.out.println("Is '()[]{}' valid? " + validParentheses.isValid(p1));
        String p2 = "(]";
        System.out.println("Is '(]' valid? " + validParentheses.isValid(p2));
    }
}
