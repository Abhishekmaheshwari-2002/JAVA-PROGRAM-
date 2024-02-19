package com.company;

public class JAVA_35_0_1_triangle {
    public static void main(String [] args){
//        printing 0_1_triangle_pyramid star pattern
        int k=1;
        int n=5;
        int m=1;
        /* outer loop */
        for(int i = 1 ;i<=n;i++){
            /* inner loop */
            /* i=n and j=i because of column number is as same as row ,according to half pyramid */
            for(int j=1;j<=i;j++)//condition for 0_1_triangle_pyramid triangle
            {

                if(m==k) {

                    System.out.print(k + " ");
                    k--;
                }else {
                    System.out.print(k + " ");
                    k++;
                }

            }
            System.out.println();
        }
    }
}
