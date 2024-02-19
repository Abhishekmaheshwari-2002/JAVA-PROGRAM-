package com.company;

import java.util.Scanner;

public class JAVA_66_specific_exception {
    public static void main(String[] args) {
        int[] marks = new int[3];// array created of size is 3
        marks[0] = 20;
        marks[1] = 40;
        marks[2] = 60;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the index no.");
        int index = sc.nextInt();//take user input as integer
        System.out.println("enter the number for Divide ");
        int num = sc.nextInt();//take user input as integer
        try {
            System.out.println("The array index of " + index + " value is : " + marks[index]);
            System.out.println("The number is : " + num);
            System.out.println("Divide : " + marks[index] / num);
        }
        //Handling specific exception
        catch (ArithmeticException e) {
            System.out.println("we have a found : ArithmeticException ");
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("we have a found : ArrayIndexOutOfBoundsException ");
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("we have a found ");
            System.out.println(e);
        }


    }
}
