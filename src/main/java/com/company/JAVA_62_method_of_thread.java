package com.company;
//extended the thread class

class Myth1 extends Thread {

    public void run() {
        int i = 0;
        while (i < 1000) {
            System.out.println("i am a thread class : 1");
            try {
                /* it stops the thread file on a specified time,but it can be give an exception */
                Thread.sleep(45);
                /* so we use try catch block to handle the exception */
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            i++;

        }
    }
}

class Myth2 extends Thread {

    public void run() {
        int i = 0;
        while (i < 1000) {
            System.out.println("i am not a thread class : 2");
            i++;
        }
    }
}

public class JAVA_62_method_of_thread {
    public static void main(String[] args) {
        Myth1 t1 = new Myth1();
        Myth2 t2 = new Myth2();
        t1.start();
/*
        try {
            t1.join();//stops the current thread until the called thread gets terminated
        } catch (Exception e) {
            System.out.println(e);
        }
*/
        t2.start();

        /* NOTE : any method of thread class can give an exception so must use try catch block */

    }
}
