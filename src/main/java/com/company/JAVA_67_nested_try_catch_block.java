package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JAVA_67_nested_try_catch_block {
    public static void main(String[] args) {
        int[] marks1 = new int[3];// array created of size is 3
        marks1[0] = 20;
        marks1[1] = 40;
        marks1[2] = 60;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the index no.");
        int ind = sc.nextInt();//take user input as integer
        //Nested try catch block........
        try {
            System.out.println("welcome to the nested try catch block ");
            System.out.println("you are in Level 1");
            try {
                System.out.println("The array index of " + ind + " value is : " + marks1[ind]);
                System.out.println("you are in Level 2");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("this index does not exist in the world ");
                System.out.println(e);
            }
        } catch (Exception e) {
            System.out.println("Exception is : ");
            System.out.println(e);

        }


    }
}
