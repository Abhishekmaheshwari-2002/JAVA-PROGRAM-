package com.company;
import java.util.*;
public class JAVA_08_String {
    public static void main(String[] args) {
        System.out.println("Welcome to String class or data types ");
//        String name = new String("Hello Abhishek maheshwari ");
//        System.out.println(name);//printing string using println() method
//        System.out.print(name);//printing not string only one word using print() method
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the string");
//        String str = sc.next();// Takes only word
//        System.out.println(str);
        String str1= sc.nextLine();//Takes only whole string
        System.out.println(str1);
    }
}
