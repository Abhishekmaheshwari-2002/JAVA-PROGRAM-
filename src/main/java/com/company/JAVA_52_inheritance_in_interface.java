package com.company;

interface senior {
    void method1();

    void method2();
}
//In class or interface can be use inheritance
interface junior extends senior {
    void method3();

    void method4();
}

class college implements junior {
    public void method1() {
        System.out.println("method1");
    }

    public void method2() {
        System.out.println("method2");
    }

    public void method3() {
        System.out.println("method3");
    }

    public void method4() {
        System.out.println("method4");
    }

}

public class JAVA_52_inheritance_in_interface {
    public static void main(String[] args) {
        college clg = new college();
        clg.method1();
        clg.method2();
        clg.method3();
        clg.method4();
    }
}
