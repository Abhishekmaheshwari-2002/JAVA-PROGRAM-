package com.company;
import java.util.Scanner;
//custom exception can be created by extends the exception class

//extends the exception class
class MyException extends Exception {
    //override the methods of exception
    @Override
    public String toString() {
//        return super.toString() + " I am a toString method ";//you can write like this
        return " I am a toString method ";//you can write like this also
    }
    //it behaves like  as same as built in exception but these are custom exception  we can modified the exception
    @Override
    public String getMessage() {
//        return super.getMessage() + " I am a getMessage";//you can write like this
        return " I am a getMessage";//you can write like this also
    }
}
public class JAVA_69_custom_exception {
    public static void main(String[] args) {
        System.out.println("enter the no.");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        //for custom exception you should use if condition ctc. with using throw keyword
        if (a < 10) {
            try {
                throw new MyException();
//                throw new Exception("this is an Exception very bad ");

            } catch (Exception e) {
                System.out.println(e.getMessage());//it prints the message
                System.out.println(e.toString());//it prints the message
                System.out.println(e);//you can also called toString method like this
                e.printStackTrace();//it will give some info. about the class
                System.out.println("Thank you for using us ");
            }
            System.out.println("Tata by by good by");
        }

        System.out.println("final position ");
    }
}
