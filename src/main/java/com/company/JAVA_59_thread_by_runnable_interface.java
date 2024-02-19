package com.company;
//using implements Thread Runnable interface
class Theradinterface1 implements Runnable {
    int i = 0;
    public void run() {
        while (i < 50000) {
            System.out.println("i am a Therad interface 1");
            i++;
        }
    }
}
class Theradinterface2 implements Runnable {
    int i = 0;
    public void run() {
        while (i < 50000) {
            System.out.println("i am a Therad interface 2");
            i++;
        }
    }
}
public class JAVA_59_thread_by_runnable_interface {
    public static void main(String[] args) {
        Theradinterface1 T1 = new Theradinterface1();
        Thread th1 = new Thread(T1);
        Theradinterface2 T2 = new Theradinterface2();
        Thread th2 = new Thread(T2);
        th1.start();//it is use for executing a method in concurrency style by using Runnable interface
        th2.start();//its give importance to both method equal time etc.
    }
}


