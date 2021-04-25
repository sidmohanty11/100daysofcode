package com.codewithsid;

public class Main {

    public static void main(String[] args) {

        calculator(true, 200, 5, 100);

        calculator(true, 2000, 10, 200);

        calculator(false, 100, 2, 20);


    }

    public static int calculator(boolean gameOver, int score, int level, int bonus) {
        int finalScore = score + (level * bonus);
        if (gameOver) {
            if (finalScore < 1000) {
                System.out.println("You are a loser!");
                System.out.println("Your finalscore is = "+ finalScore);
            } else {
                System.out.println("You are a winner!");
                System.out.println("Your finalscore is = "+ finalScore);
            }
        }

        return -1;


    }
}
