package com.company;
import java.util.*;
public class JAVA_13_else_if_cause {
    public static void main(String [] args ){
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter the number ");
        int marks = sc.nextInt();
        //if-else-if-else ladder conditional statement
        if(marks>90)
        {
            System.out.println("you got a A++ grade ");
        }
        else if (marks>80){
            System.out.println("you got a A grade ");
        }
        else if (marks>60){
            System.out.println("you got a B grade ");
        }
        else if (marks>50){
            System.out.println("you got a C grade ");
        }
    }
}
