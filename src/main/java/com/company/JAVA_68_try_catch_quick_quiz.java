package com.company;

import java.util.Scanner;

public class JAVA_68_try_catch_quick_quiz {
    public static void main(String[] args) {
        int[] marks1 = new int[3];// array created of size is 3
        marks1[0] = 45;
        marks1[1] = 50;
        marks1[2] = 60;

        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        //it will run until user entered correct index ...of the array
        while (flag) {
            System.out.println("enter the index no.");
            int ind = sc.nextInt();//take user input as integer

            //Nested try catch block........
            try {
                System.out.println("welcome to the nested try catch block ");
                System.out.println("you are in Level 1");
                try {
                    System.out.println("The array index of " + ind + " value is : " + marks1[ind]);
                    System.out.println("you are in Level 2");
                    flag =false;
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
}
