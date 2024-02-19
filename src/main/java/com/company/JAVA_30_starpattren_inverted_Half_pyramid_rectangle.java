package com.company;
public class JAVA_30_starpattren_inverted_Half_pyramid_rectangle {
    public static void main(String [] args){
//        printing inverted half pyramid stat pattern
        int n=5;
        /* outer loop */
        for(int i = n ;i>=1;i--){
            /* inner loop */
            /* i=n and j=i because of column number is as same as row ,according to half pyramid */
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
