package com.company;

import java.util.*;

public class JAVA_14_switch_statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the name ");
        String str = sc.nextLine();
        switch (str) {
            case "rahul":
                System.out.println("hello, rahul");
                break;
            case "raj":
                System.out.println("hello,raj");
                break;
            case "Abhishek":
                System.out.println("Hello, Abhishek");
                break;

            default:
                System.out.println("you Entered wrong name ");

        }

    }
}
