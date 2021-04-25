package com.codewithsid;

import javax.xml.crypto.Data;
import java.io.DataInputStream;

public class Main {

    public static void main(String[] args) {
	// write your code here
        DataInputStream in = new DataInputStream(System.in);
        int intNumber = 0;
        float floatNumber = 0.0f;
        try
        {
            System.out.println("enter an integer");
            intNumber = Integer.parseInt(in.readLine());
            System.out.println("enter a float number");
            floatNumber = Float.valueOf(in.readLine()).floatValue());
        }
        catch (Exception e)
        {
            System.out.println("input error =" +e);
        }
        System.out.println("int number =" +intNumber);
        System.out.println("float number " +floatNumber);
    }
}
