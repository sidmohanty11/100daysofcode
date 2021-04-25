package com.codewithsid;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        int number = 1;
        int sum = 0;
        while (number<=10){
            System.out.println("Enter number #"+number+":");
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt){   //number has to be an int to proceed
                int numbers = scanner.nextInt();
                sum += numbers;
                number++;
            }
            else {
                System.out.println("Invalid Number");
            }
            scanner.nextLine(); //handle invalid numbers when I press enter key
        }
        System.out.println("The total sum of your given numbers = "+sum);
        scanner.close();
    }
}
