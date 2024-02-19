package com.company;

public class JAVA_31_side_pyramid {
    //program for side pyramid triangle
    public static void main(String[] args) {
        int n =4;
//        outer loop
        for (int i=1;i<=n;i++){
//                 inner loop-> for space
            for (int j=1;j<=n-i;j++){//try to remember the for loop condition of star pattern
                System.out.print(" ");
            }
//                 inner loop-> for star
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
/*NOTE:you can use same var. in for loop ex->int j







































         /*   int n = 4;
             int m = 4;
//        printing side pyramid rectangle pattern
//        outer loop
             for (int i = 1; i <= n; i++) {
//        inner loop
                 for (int j = 1; j <= m; j++) {
                     //condition for printing side pyramid triangle pattern
                     if ( i == 1 && j==1  || i == 1 && j==2 || i == 1 && j==3 || i==2 && j==1 || i==2 && j==2 || i==3 && j==1 ) {
                         System.out.print(" ");//*      * for getting space between the two star
                     }
                     else
                     {
                         System.out.print("*");
                     }

                 }
                 System.out.println();
             }*/












    }
}

