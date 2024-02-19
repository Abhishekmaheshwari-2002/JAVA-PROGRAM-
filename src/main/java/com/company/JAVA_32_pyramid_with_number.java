package com.company;

public class JAVA_32_pyramid_with_number {
    public static void main(String [] args){
//        printing pyramid_with_number_stat_pattern
        int n=5;
//  outer loop
        for(int i =1;i<=n;i++){
//  inner loop
            for(int j=1;j<=i;j++)//i=n and j=i because of column number is as same as row ,according to half pyramid with
            // number
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
