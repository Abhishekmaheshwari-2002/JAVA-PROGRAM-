package com.company;

public class JAVA_28_starpattren_Hollow_rectangle {
    //program for hollow rectangle
    public static void main(String[] args){
        int n=4;
        int m=5;
//        printing hollow rectangle pattern
//        outer loop
        for(int i=1;i<=n;i++){
//        inner loop
            for (int j =1;j<=m;j++){
                //condition for printing hollow pattern
                if(i==1 || i==n || j==1 || j==m ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");//*      * for getting space between the two star
                }

            }
            System.out.println();
        }












    }
}
