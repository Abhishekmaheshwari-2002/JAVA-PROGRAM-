package com.company;

class Mybase {
    public int a;
    public int b;

    public int getA() {
        return this.a;
    }

    public void setA(int x) {
        this.a = x;
    }

    public void goMh() {
        System.out.println("I am in mumbai");
    }

}

class Myderived extends Mybase {
    @Override//this is the notation for showing these method is override
    public void goMh() {
        System.out.println("I am in goa");
    }

    public int getA() {
        return this.b;
    }

    public void setA(int y) {
        this.b = y;
    }
}

public class JAVA_47_method_overiding {
    public static void main(String[] args) {
        Mybase mb = new Mybase();
        mb.goMh();
        mb.setA(4);
        System.out.println("a= " + mb.getA());

        System.out.println("After using method override");

        Myderived md = new Myderived();
        md.goMh();
        md.setA(15);
        System.out.println("b= " + md.getA());


    }
}
