package com.company;
class thread_welcome extends Thread {
    int i = 0;
    public void run() {
        while (i < 1000) {
            System.out.println("welcome to you ");
//            try {
//                Thread.sleep(200);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
            i++;
        }
    }
}
class thread_GM extends Thread {
    int i = 0;
    public void run() {
        while (i < 1000) {
            System.out.println("Good morning dear ");
            i++;
        }
    }
}
public class JAVA_63_thread_practice_set_Q1 {
    public static void main(String[] args) {
        thread_welcome thm = new thread_welcome();
        thm.setPriority(7);//user defined priority set
        thread_GM thg = new thread_GM();
        thg.setPriority(10);//user defined priority set
        System.out.println(thm.getPriority());//get priority
        System.out.println(thg.getPriority());//get priority

//        System.out.println(thm.getState());
        System.out.println(thg.getState());//get the current state of the thread ex. here the state =  NEW
        thm.start();
        thg.start();
//        System.out.println(thm.getState());
        System.out.println(thg.getState());//get the current state of the thread ex. here the state =  RUNNABLE
        System.out.println(Thread.currentThread().getState());//get the current state of the thread by reference of the
        // current thread  ex. here the state = RUNNABLE


    }
}