package com.company;

//it is an abstract class
abstract class Parent {
    public void hello_greet() {
        System.out.println("hello i am the parent ");
    }

    abstract public void hello_bro();//it is an abstract method

}

//child class extends abstract parent class  it must be override the abstract method
class Child extends Parent {
    @Override/* override method */
    public void hello_bro() {
        System.out.println("hello i am the bro of child");
    }

    public void hello_girl()    /*it is a normal method*/ {
        System.out.println("hello i am the girl of child ");
    }
}

// This class doesn't override the method of parent class it become abstract class
abstract class Child1 extends Parent {
    public void hello_boy() {
        System.out.println("hello i am the bot of child1");
    }

    public void hello_uncle() {
        System.out.println("hello i am the uncle of child1 ");
    }
}

public class JAVA_50_abstract_class {
    public static void main(String[] args) {
//      Parent pn  = new Parent();// it throw the error
        Child ch = new Child();
//      Child1 ch1 = new Child1();// it throw the error
        ch.hello_bro();
        ch.hello_girl();
        ch.hello_greet();

    }
}
