package com.company;

//extended the thread class
class Mythread extends Thread {
    //thread class constructor created
    public Mythread(String name) {

        super(name);//passing the String name to the thread class constructor
    }

    public void run() {

        System.out.println("i am a thread class hello");
    }
}

public class JAVA_60_constructor_in_thread_class {
    public static void main(String[] args) {
        Mythread t1 = new Mythread("Abhishek ");
        Mythread t2 = new Mythread("Rahul");
        t1.start();
        t2.start();
        System.out.println("The id of thread 1 " + t1.getId());
        System.out.println("The id of thread 2 " + t2.getId());
        System.out.println("The name of thread 1 " + t1.getName());
        System.out.println("The name of thread 2 " + t2.getName());
    }
}
