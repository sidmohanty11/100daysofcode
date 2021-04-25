package com.codewithsid;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        System.out.println("I can know if you're lying, so lets start with your year of birth.");
        int yearOfBirth = scanner.nextInt();
        int age = 2020 - yearOfBirth;
        switch (age){
            case 14:
                System.out.println("I know right?, Your Birthday is coming too. So happy 14 in advance.");
                break;
            case 48:
                System.out.println("I know right?, Your are becoming more beautiful day by day.");
                break;
            case 50:
                System.out.println("I know right?, You are the most handsome guy at this age.");
                break;
            default:
                System.out.println("Why are you lying??");
        }
        scanner.nextLine();

        System.out.println("What's your name?(Please start with capital letter)");
        String name = scanner.nextLine();
        switch (name){
            case "Jinu":
            case "Shrestha":
            case"Mamali":
                if (age==14) {
                    System.out.println("Good, I know you are "+name+".");
                    break;
                }
            case "Nibedita":
            case "Tommy":
                case "Tami":
                if (age==48) {
                    System.out.println("Good, I know you are " + name + ".");
                    break;
                }
            case "Sunil":
            case "Kuna":
                if (age==50) {
                    System.out.println("Good, I know you are " + name + ".");
                    break;
                }
            default:
                System.out.println("I know you are lying.-_-.");
        }


    }

}