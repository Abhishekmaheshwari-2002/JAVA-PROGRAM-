package com.company;

import java.util.*;// it imports all the class of the package
import java.util.Scanner;// it imports only that class of package which class you need
public class JAVA_55_initializing_package {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//Instantiating of an object of Scanner class
        java.util.Scanner sc1 = new java.util.Scanner(System.in);//Instantiating of an object of Scanner class without
//      importing java.util package
//      int a = new java.util.Scanner.nextInt();//this is not valid with util package
        String s = new java.lang.String("abhishek");// this is valid for lang package
        int a = sc.nextInt();//you can use the obj. like this
        System.out.println(a);
        System.out.println(s);


    }
}
