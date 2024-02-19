package com.company;

//finally keyword is behave like a universal code block which always executed at any cost
public class JAVA_71_finally_keyword {
    public static int greet() {
        try {
            int a = 10;
            int b = 6;
            int c = a / b;
            System.out.println(c);
            return c;
        } catch (Exception e) {
            System.out.println(e);
        }
        //used always with try-catch block
        finally {
            System.out.println("i am inside the finally block ");
        }
        //without "finally block" statement doesn't always executed it depends on condition
        System.out.println("i am outside the finally block ");
        return 0;
    }

    public static void loop_check() {
        for (int i = 10; i <= 10; i--) {
            try {
                System.out.println(100 / i);
            } catch (Exception e) {
                System.out.println(e);
                break;
            } finally {
                System.out.println("the a is :" + i);
            }
            System.out.println("the a is :" + i);

        }
    }

    public static void main(String[] args) {
        greet();
        loop_check();
    }
}