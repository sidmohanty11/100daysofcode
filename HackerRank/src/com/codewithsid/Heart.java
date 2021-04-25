package com.codewithsid;

import java.util.Scanner;

public class Heart {
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_YELLOW = "\u001B[33m";
    public static void main(String[] args) {
        // set output size
        Scanner scanner = new Scanner(System.in);

        final String message = " ";
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= 4 * n; j++) {
                double d1 = Math.sqrt(Math.pow(i - n, 2)
                        + Math.pow(j - n, 2));

                double d2 = Math.sqrt(Math.pow(i - n, 2)
                        + Math.pow(j - 3 * n, 2));

                if (d1 < n + 0.5 || d2 < n + 0.5) {
                    System.out.print(ANSI_RED+'*');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }

        for (int i = 1; i < 2 * n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(' ');
            }

            for (int j = 0; j < 4 * n + 1 - 2 * i; j++) {
                if (i >= 2 && i <= 4) {
                    int idx = j - (4 * n - 2 * i - message.length()) / 2;
                    if (idx < message.length() && idx >= 0) {
                        if (i == 3) {
                            System.out.print(ANSI_YELLOW+message.charAt(idx));
                        } else {
                            System.out.print(' ');
                        }
                    } else {
                        System.out.print(ANSI_RED+'*');
                    }
                } else {
                    System.out.print(ANSI_RED+'*');
                }
            }
            System.out.println();
        }
    }
}
