package com.company;

public class JAVA_05_precedence_associativity {
    public static void main(String [] args){
        // precedence of operator * / + - and associativity operator L-R(*,/,+,-),R-L(++,==)
        /*
        int a = 65*7-25/5;
        System.out.println("The precedence and associativity of this expression : "+a);
        //65*7-25/5
        //455-25/5
        //455-5
        //=450

        int b = 25/5+78*6;
        //25/5+78*6
        // 5+78*6
        //5+468
        //=473

        */

        //Quick Quiz :
        byte x  =6;
        byte y  =4;
        int k = x-y/2;
        System.out.println(" after use bracket");
        System.out.println(k);
        // 6-4/2
        //6-2
        //=4 it is  a wrong way to use parenthesis(bracket)

        System.out.println(" after use bracket");
        int m = (x-y)/2;
        System.out.println(m);
        // (6-4)/2
        //2/2
        //=1 it's a correct way to use parenthesis(bracket)


    }
}
