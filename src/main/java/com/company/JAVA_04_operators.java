//program for operators there are few types of operators
package com.company;

public class JAVA_04_operators {
    public static void main(String [] args) {
        //1.Arithmetic operators
        int a = 8;
        int b = 66 + 8;

        System.out.println(a + b);
        //modulo operators
        System.out.println(a % 3);
        System.out.println(4.5 % 3);//modulo operators work on the decimal values



//      2.Assignment operators
        int a1=5;
        a1 += 2;// it add first and assign after ......
        System.out.println(a1);

//      3.comparison operators
        int p =65;
        int q=4;
        System.out.println(p<q);
        System.out.println(p>=q);
        System.out.println(p==q);
        System.out.println(p<=q);

//        4.logical operators
        boolean b3 = true;
        boolean b2 = false;
        System.out.println(b3 &&b2);
        System.out.println(b3 ||b2);

//        5.bitwise operators
          System.out.println(2&3);
          System.out.println(2&2);
    }
}
