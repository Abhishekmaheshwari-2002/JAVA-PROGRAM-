package com.company;

public class JAVA_25_recursion {
    static int fac(int n ){
        if (n==1 || n==0)//1 and 0 are not used in factorial
        {
            return 1;
        }
        else
        {
            return n * fac(n - 1);//condition for recursion
        }

    }
    public static void main(String [] args ){
        int f = 6;
        int fa  = fac(f);//function called
        System.out.println("The Factorial of 6 is : "+fa);//final statement
    }
}
