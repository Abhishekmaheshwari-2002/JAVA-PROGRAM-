package com.company;

public class JAVA_65_try_catch_block {
    public static void main(String[] args) {
        int a = 100;
        int b = 5;
        int c = 0;
//        no need to use try block
//        int d =a/b;
//        System.out.println(d);

//        without try catch block but we need it
//        int d = a/c;
//        System.out.println(d);

//        with try catch block
        try {
            int d = a / c;

        } catch (Exception e) {
            System.out.println("sorry we found some error ");
            System.out.println(e);
        }

    }
}
