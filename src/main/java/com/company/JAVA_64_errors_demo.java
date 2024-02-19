package com.company;

import java.util.*;

public class JAVA_64_errors_demo {
    public static void main(String[] args) {
//        Syntax errors
//        int a =4
//        a=6;
//        int a 4;


//        Logical errors
        for (int i = 0; i >= 0; i++)// it will go  up to infinite
        {
            System.out.println(i);
        }

//        Runtime errors
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Divide : " + 100 / a);
    }
}
