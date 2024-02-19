package com.company;

//using extending thread class
class Mythread1 extends Thread {
    int i = 0;

    @Override
    public void run() {
        while (i < 500) {
            System.out.println("i am a abhishek maheshwari");
            System.out.println("i am a Mythread1 ");
            i++;
        }
    }

}

class Mythread2 extends Thread {
    int i = 0;

    @Override
    public void run() {
        while (i < 500) {
            System.out.println("i am a maheshwari");
            System.out.println("i am a Mythread2 ");
            i++;
        }
    }
}

public class JAVA_58_thread_by_extends_class {
    public static void main(String[] args) {
        Mythread1 t1 = new Mythread1();
        Mythread2 t2 = new Mythread2();
        t1.start();//it is use for executing a method in concurrency style
        t2.start();//its give importance to both method equal time etc.
    }
}
