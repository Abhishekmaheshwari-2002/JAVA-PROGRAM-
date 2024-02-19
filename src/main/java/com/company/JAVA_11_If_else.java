package com.company;
import java.util.*;
public class JAVA_11_If_else {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age ");
        int age = sc.nextInt();
//      if (age != 18)//using operator is called relational op.ex <=,>=,<,>,!=
//      if(age==18)//'=' is assignment op. and "==" is relational op. is used for equality check
        if(age>=18)//using if-else
        {
            System.out.println(" yes you can  drive");
        }
        else
        {
            System.out.println("No you can't drive ");
        }
    }
}
