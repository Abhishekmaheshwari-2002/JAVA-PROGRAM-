package com.company;
import java.util.*;
/**
 * @author abhishek
 * @version  2.2
 * @since 2002
 * */
public class JAVA_02_Excersice1 {

    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the student name ");
        String str = sc.next();
        System.out.println("Enter the number of Maths");
        int m = sc.nextInt();
        System.out.println("Enter the number of English");
        int e = sc.nextInt();
        System.out.println("Enter the number of Science");
        int s = sc.nextInt();
        System.out.println("Enter the number of Hindi");
        int h = sc.nextInt();
        System.out.println("Enter the number of History");
        int his = sc.nextInt();
        int total=m+e+s+h+his;
        int percent = total/5;
        System.out.println("Maths="+m);
        System.out.println("English="+e);
        System.out.println("Science="+s);
        System.out.println("Hindi="+h);
        System.out.println("History="+his);
        System.out.println(" The percentage of "+str+" is :"+percent+"%");
    }
}









