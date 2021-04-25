package com.codewithsid;

import java.util.Scanner;

public class Scope {
    public Scanner scanner = new Scanner(System.in);
    public int x = 1;

    public void x(){
        int x = 3;
        for (int i = 1; i<=12 ;i++){
            System.out.println(x +" * "+i+" = "+(x*i));
        }
    }
    public class X{
        public int x = 4;
        public int x(int x){
            System.out.println("InnerX");
            return this.x;
        }
    }
}
