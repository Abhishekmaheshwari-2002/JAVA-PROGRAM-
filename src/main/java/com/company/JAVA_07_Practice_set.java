package com.company;

import java.util.*;

public class JAVA_07_Practice_set {
    public static void main(String[] args) {
        //Q1:find the result of the following expression
//        float a = 7.0f/4.0f*9.0f/2.0f;  // defined given literals is float use  f or F
//        System.out.println(a);
        //7,4,9,2 are integer it divided and multiple. you will get answer in integer not float
        //7/4*9/2
        //1(1.75)*9/2
        //1*9/2
        //4(4.5)
        //=4 these value is wrong

        //7/4*9/2
        //1.75*9/2
        //1.75*9/2
        //1.75*4.5
        //=7.875 these value is right

        //Q2:write a program for encrypt a grade by adding 8 and decrypt it to show the grade
//        char grade ='a';
//        //before encrypted grade
//        grade=(char)(grade+8);
//        System.out.println(grade);
//        //after encrypted grade
//        grade=(char)(grade-8);
//        System.out.println(grade);

        //Q3:write a program for using a comparison operator
//       Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number");
//        int b=25;
//       int a = sc.nextInt();
//        System.out.println(a==b);

        //Q4:write a following expression
        int v = 3;
        int u = 2;
        int a = 1;
        int s = 2;
        int k = ((v * v) - (u * u)) / (2 * a * s);
        System.out.println(k);
    }
}
