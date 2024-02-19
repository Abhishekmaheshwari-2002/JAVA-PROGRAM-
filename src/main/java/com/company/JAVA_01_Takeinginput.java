//This is the program of take input from the user
package com.company;

import java.util.*;

public class  JAVA_01_Takeinginput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Two number ");
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        System.out.println("a= " + a);
        System.out.println("b= " + b);
        String str = sc.next();//method of input for only one word not the sentence
        System.out.println(str);
        boolean b1 = sc.hasNextInt();//method of checking the input data is integer or not
        System.out.println(b1);
    }
}
