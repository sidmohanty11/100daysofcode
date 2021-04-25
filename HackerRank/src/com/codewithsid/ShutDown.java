package com.codewithsid;

import java.io.IOException;
import java.util.Scanner;

public class ShutDown {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int timeInSeconds = scanner.nextInt();
        System.out.println("Remaining time--->  "+timeInSeconds);
        Runtime runtime = Runtime.getRuntime();
        runtime.exec("shutdown -s -t " + timeInSeconds);
    }
}
