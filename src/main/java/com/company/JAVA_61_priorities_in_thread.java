package com.company;

//extended the thread class
class Mythr extends Thread {
    //thread class constructor created
     public Mythr(String name) {

        super(name);//passing the String name to the thread class constructor

    }

    @Override//implements the run method
    public void run() {
        int i = 0;
        while (i < 500) {
            System.out.println("priorities thread : " + this.getName());//this.getName() "this" connected with the obj
//          of the class
            i++;
        }
    }
}

public class JAVA_61_priorities_in_thread {
    public static void main(String[] args) {
        Mythr t1 = new Mythr("Abhishek 1 ");
        Mythr t2 = new Mythr("Abhishek 2 ");
        Mythr t3 = new Mythr("Abhishek 3 ");
        Mythr t4 = new Mythr("Abhishek 4 ");
        Mythr t5 = new Mythr("Abhishek 5 (vip priority)");
        //priority method Max,Min,Norm.
        t5.setPriority(Thread.MAX_PRIORITY);//it holds the highest priority
        t1.setPriority(Thread.MIN_PRIORITY);//it holds the minimum priority
        t2.setPriority(Thread.NORM_PRIORITY);//it holds the normal priority
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}
