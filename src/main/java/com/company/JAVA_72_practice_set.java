package com.company;

import java.util.Scanner;

//program for syntax,logical,run time errors
class errors {
    public void greet() {
//        int a b = 45 //syntax error
        int a = 0;
        while (a < 10) {
            System.out.println(a);//
            a++;//logical errors and it will go infinite
        }
    }

    public void run_time() {
        Scanner sc = new Scanner(System.in);
        int a = 50;
        System.out.println("enter the input");
        int b = sc.nextInt();
        int div = a / b;//it wil throw the exception

    }

}

class exceptionn extends Exception {
    @Override
    public String toString() {
        return "you crossed the limit of the chances to enter the index no. ";
    }

    @Override
    public String getMessage() {
        return "you crossed the limit of the chances to enter the index no. ";
    }

    public void max_retries() {
        int[] marks = new int[3];
        marks[0] = 101;
        marks[1] = 121;
        marks[2] = 109;
        int i = 0;
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag && i < 5) {
            try {
                int index = sc.nextInt();
                System.out.println("the value of " + index + " is :" + marks[index]);
                break;
            } catch (Exception e) {
                System.out.println("invalid index number ");
            }
            i++;
        }
        if (i == 5) {
            try {
                throw new ArrayIndexOutOfBoundsException();
            } catch (Exception e) {
                System.out.println(e.toString());
//                System.out.println(e.getMessage());
            }
        }
    }

    public void excep() {
        try {
            int a = 585;
            int b = 0;
            int c = a / b;
        } catch (ArithmeticException e) {
            System.out.println("haha");
        } catch (IllegalArgumentException e) {
            System.out.println("hehe");
        }
    }
}


public class JAVA_72_practice_set {


    public static void main(String[] args) {
        errors er = new errors();//problem 1
//      er.greet();
//      er.run_time();
        exceptionn ex = new exceptionn();//problem 2
//        ex.excep();
//        ex.max_retries();//problem 3
        ex.max_retries();//problem 4

    }
}
