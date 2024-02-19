package com.company;

//create abstract class pen with method write() & refill() as an abstract and create concrete class Fountain pen and
//method changeNib()
abstract class pen {
    abstract void write();//create two abstract method

    abstract void refill();
}

//create class fountain pen and override the method of abstract class
class FountainPen extends pen {
    public void write() {
        System.out.println("i am writing with pen ");
    }

    public void refill() {
        System.out.println("i am refilling a pen");
    }

    public void changeNib() {
        System.out.println("changeNib");
    }
}

public class JAVA_54_practice_set_abstract_interfaceQ1 {
    public static void main(String[] args) {
        FountainPen fp = new FountainPen();
        fp.write();
        fp.refill();
        fp.changeNib();
    }
}
