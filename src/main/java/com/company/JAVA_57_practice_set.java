package com.company;

import java.util.*;

class message {
    public void message1() {
        System.out.println("hello bro this is my id no.");
    }

    public void userinput(int a) {

        System.out.println("num= " + a);
    }

}


public class JAVA_57_practice_set {
    public static void main(String[] args) {
        message msg = new message();
        Scanner sc = new Scanner(System.in);
        msg.message1();
        int x = sc.nextInt();
        msg.userinput(x);


    }
}
