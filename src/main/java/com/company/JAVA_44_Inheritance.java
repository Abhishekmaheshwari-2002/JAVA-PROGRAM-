package com.company;

class base {
    public int a;

    public int getA() {
        return a;
    }

    public void setA(int x) {
        System.out.println("hello this is a setA from base class ");
        this.a = x;
    }
}

class derived extends base {
    public int b;

    public int getB() {
        return b;
    }

    public void setB(int y) {
        System.out.println("hello this is a setB from derived class");
        this.b = y;
    }
}

public class JAVA_44_Inheritance {
    public static void main(String[] args) {
        base b = new base();//Instantiating an object
        b.setA(22);//called from base class and it's object
        System.out.println("base = " + b.getA());

        derived d = new derived();//Instantiating an object
        d.setB(45);//called from derived class and it's object
        System.out.println("Derived = " + d.getB());

        d.setA(11);//called from derived class and it's object
        System.out.println("base derived =" + d.getA());
    /*NOTE: derived class can derive everything which can be derived, and you can call method and properties of base
      class */

    }
}
