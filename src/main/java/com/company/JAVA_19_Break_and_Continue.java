package com.company;

public class JAVA_19_Break_and_Continue {
    public static void main(String[] args) {
        //Break and continue statement
        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                continue;
            }
            System.out.println("Break statement is used " + i);

//             if(i==3){
//                System.out.println("break statement work");
//                break;
//            }
//            System.out.println("break statement work");
        }
    }
}
