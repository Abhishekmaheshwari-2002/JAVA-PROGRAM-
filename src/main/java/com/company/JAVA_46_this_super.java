//always must be use "this" keyword and class member public or any other
package com.company;
class parent {
    public int a;
    parent(int a){
        System.out.println("i am a parent class constructor");
        this.a=a;//it linked the connection to the object
    }
    public int getA() {
        return this.a;
    }
}
//NOTE: if you are creating a constructor in a base class, so you must be created a constructor in derived class also
//any type of constructor doesn't matter
class child extends parent {
    child(int x){
        super(x);//it is use to assign the value to the constructor of base class it use to pass the argument
        System.out.println("i am a child class constructor" );
    }
}
public class JAVA_46_this_super {
    public static void main(String[] args) {
        child ch =new child(4);
        System.out.println(ch.getA());
    }
}
