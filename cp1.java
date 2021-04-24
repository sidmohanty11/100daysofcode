package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CodeChef
{
	public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(len(n));
    }
    public static int len(int x){
        if(x==0){
           return 0;
        }
        String num = Integer.toString(x);
        return +num.length();
    }
}
