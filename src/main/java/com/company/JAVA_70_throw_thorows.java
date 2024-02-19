package com.company;

//extends the exception class
class nagativeareaexception extends Exception {
    //override the methods of exception
    @Override
    public String toString() {
        return "area can't be negative ";
    }

    @Override
    public String getMessage() {
        return "area can't  negative ";
    }
}

public class JAVA_70_throw_thorows {
    //created some static method for using throws keyword

    //using throws keyword with built-in Exception
    public static int divide(int a, int b) throws ArithmeticException//throws keyword emphasis the programmer to use
//  try catch block
    {
        int result = a / b;
        return result;
    }

    //using throws keyword with custom Exception
    public static double area(int r) throws nagativeareaexception {
        // using 'if' for using custom Exception and throw keyword
        if (r < 1) {
            throw new nagativeareaexception();
        }
        double ar = Math.PI * r * r;
        return ar;

    }

    public static void main(String[] args) {


        try {
//        int res = divide(25, 0);
//        System.out.println(res);
            double are = area(0);
            System.out.println(are);

        } catch (Exception e) {
            System.out.println("Exception found ");
            System.out.println(e.getMessage());
            System.out.println(e);
            System.out.println(e);

        }

    }
}
