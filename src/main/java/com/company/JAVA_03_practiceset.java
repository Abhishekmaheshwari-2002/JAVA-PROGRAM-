package com.company;
import java.util.*;
public class JAVA_03_practiceset {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        //Question 1 : program for calculate the cgpa of the number
        System.out.println(" Enter the number of three subject ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c =sc.nextInt();
        int d =(a+b+c)/30;
        System.out.println(d);
        System.out.println("The cgpa of the number is : "+d);
//      //Question 2 : program for asking the users name and give
        System.out.println("Enter the name of your ");
        String str = sc.next();
        System.out.println("How are you dear ,"+str+" nice to meet you ");
        //Question 3 : program for converting kilometer into meter
        System.out.println("Enter the kilometer for converting the into meter ");
        int k = sc.nextInt();
        int conv = k *1000;
        System.out.println("converted into meter : "+conv+"meter");
        //Question 4 : program for checking the input is integer or not
        System.out.println("Enter the integer number ");
        boolean b1 =sc.hasNextInt();
        System.out.println("The number is integer : "+b1);
    }
}
