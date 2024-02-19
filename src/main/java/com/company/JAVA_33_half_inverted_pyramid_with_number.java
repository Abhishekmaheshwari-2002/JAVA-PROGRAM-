package com.company;

public class JAVA_33_half_inverted_pyramid_with_number {
    public static void main(String[] args) {
//        printing half_inverted_pyramid_with_number star pattern
        int n = 5;
        /* outer loop */
        for (int i = n; i >= 1; i--) {
            /* inner loop */
            /* i=n and j=i because of column number is as same as row ,according to half pyramid */
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
