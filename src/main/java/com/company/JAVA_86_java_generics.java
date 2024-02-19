package com.company;

import java.util.ArrayList;
class MyGeneric<T1, T2>{
    int val;
    private T1 t1;
    private T2 t2;

    public MyGeneric(int val, T1 t1, T2 t2) {
        this.val = val;
        this.t1 = t1;
        this.t2= t2;
    }

    public T2 getT2() {
        return t2;
    }

    public void setT2(T2 t2) {
        this.t2 = t2;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }
}
public class JAVA_86_java_generics {
    public static void main(String[] args) {
//       without java generic
        ArrayList al = new ArrayList();
//       with java generic
//        ArrayList<int> AL = new ArrayList(); -- this will produce an error
        ArrayList<Integer> al1 = new ArrayList();
        al.add(55);
        al.add("Abhishek maheshwari ");
        al.add(52);
        System.out.println(al);
        System.out.println(al1);//java.lang.String cannot be converted to java.lang.Integer
//        int a = al.get(2);//without typecast //java.lang.Object cannot be converted to int
        int b = (int )al.get(2);//with typecast

//        Generic class
        MyGeneric<String, Integer> g1 = new MyGeneric(23, "MyString is my string ", 45);
        String str = g1.getT1();
        Integer int1 = g1.getT2();
        System.out.println(str + int1);
    }
}
