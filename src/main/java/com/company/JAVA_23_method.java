package com.company;

public class JAVA_23_method {
    static int mySum(int x ,int y) {
        int z ;
        if (x > y) {
            z = x + y;
        } else {
            z = (x + y) / 2;
        }
        return z;
    }
    public static void main(String [] args){
        int a =5;
        int b=4;
        int c= mySum(a,b);
        System.out.println("the sum of the number is : "+c);










    }



}
