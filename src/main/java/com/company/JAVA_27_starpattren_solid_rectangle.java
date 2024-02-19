package com.company;
import java.util.*;
public class JAVA_27_starpattren_solid_rectangle {
    //program for printing solid rectangle star pattern
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n and m");
        int n=sc.nextInt();
        int m=sc.nextInt();
//  outer loop
        for (int i =1;i<=n;i++){
//  inner loop
            for (int j=1;j<=m;j++){
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
