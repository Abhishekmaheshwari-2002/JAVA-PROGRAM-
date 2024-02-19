package com.company;
//create class telephone with ring(),lift(),disconnect() method with demonstrate polymorphism
abstract class telephone {
    abstract void ring();

    abstract void lift();

    abstract void disconnect();
}

class Smartphone1 extends telephone {
    public void ring() {
        System.out.println("ring......");
    }

    public void lift() {
        System.out.println("phone....lift......");
    }

    public void disconnect() {
        System.out.println("disconnect......");
    }

}

public class JAVA_54_practice_set_abstract_interfaceQ3 {
    public static void main(String[] args) {
        telephone tp = new Smartphone1();
        tp.disconnect();
        tp.ring();
        tp.lift();
    }
}
