package com.company;

public class JAVA_34_floyd_triangle_pyramid {
    public static void main(String [] args){
//        printing floyd_triangle_pyramid star pattern
        int k=1;
        int n=5;
        /* outer loop */
        for(int i = 1 ;i<=n;i++){
            /* inner loop */
            /* i=n and j=i because of column number is as same as row ,according to half pyramid */
            for(int j=1;j<=i;j++,k++)//condition for floyd triangle
            {
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}
