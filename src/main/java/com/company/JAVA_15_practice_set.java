package com.company;

import java.util.*;

public class JAVA_15_practice_set {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Q1:find the output of this code
        int a = 10;
        if (a == 11) {
            System.out.println("Hello,bro i am 11 is here ");
        } else {
            System.out.println("sorry i am not 11 i am 10");
        }
//        Q2:program for find a result of student is pass or fail calculating percentage
        System.out.println("Welcome to result class");

        System.out.println("Enter the number of three subject ");
        int M = sc.nextInt();
        int E = sc.nextInt();
        int H = sc.nextInt();

        if (M > 33 && E > 33 && H > 33) {
            System.out.println(" Your number is above the minimum criteria for passing in the exam");
            System.out.println("Math = " + M);
            System.out.println("English= " + E);
            System.out.println("Hindi = " + H);
            int sum = (M + E + H) / 3;
            if (sum >= 40) {
                System.out.println("you are pass and you got a percentage " + sum + "%");
            } else {
                System.out.println("you are fail and you got a percentage " + sum + "%");
            }
        } else {
            System.out.println(" Your number is below the minimum criteria for passing in the exam");
        }
//               Q3:program for calculate income tax on salary of employee

//               Q4:program for find a day of a week
        System.out.println("Enter the first letter of the day name ");
        int str = sc.nextInt();
        switch (str) {
            case 1:
                System.out.println(" The day is sunday ");
                break;
            case 2:
                System.out.println(" The day is monday ");
                break;
            case 3:
                System.out.println(" The day is tuesday ");
                break;
            case 4:
                System.out.println(" The day is wednesday ");
                break;
            case 5:
                System.out.println(" The day is friday ");
                break;
            case 6:
                System.out.println(" The day is saturday ");
                break;

            default:
                System.out.println("you entered wrong number");

        }


    }

}

