package com.company;

public class JAVA_29_starpattren_Half_pyramid_rectangle {
    public static void main(String [] args){
//        printing half pyramid stat pattern
        int n=5;
//  outer loop
        for(int i =1;i<=n;i++){
//  inner loop
            for(int j=1;j<=i;j++)//i=n and j=i because of column number is as same as row ,according to half pyramid
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
