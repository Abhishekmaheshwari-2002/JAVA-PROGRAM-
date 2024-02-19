package com.company;

class c1 {
    // of package
    private final int d = 40;//it is a private member only access this class
    public int a = 10;
    protected int b = 20;// public and protected approximately similar
    int c = 30;//it can be access in same package or same class to subclass  not others package from class to subclass

    public void meth1() {
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        System.out.println("c=" + c);
        System.out.println("d=" + d);// you can access it by using method
    }

}

class c2 extends c1 {
// you can't  access it by using method in other subclass also
//    void meth2(){
//        System.out.println(d);
//    }

    void meth3() {
        a = 1000;
        b = 2000;
        c = 3000;
//      d=4000;//you can't modify it
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
//      System.out.println("d="+d); you can access it by using method

    }

}


public class JAVA_56_access_modifier {
    public static void main(String[] args) {
        c1 a1 = new c1();
        c2 a2 = new c2();
        a1.meth1();
        a1.a = 100;
        a1.b = 200;
        a1.c = 300;//it can access in same package & same class to subclass not others package from class to subclass
//      a1.d=400;//you cann't modify it
        System.out.println("a=" + a1.a);
        System.out.println("b=" + a1.b);
        System.out.println("c=" + a1.c);
//      System.out.println(a1.d);// you can access it



    }
}
