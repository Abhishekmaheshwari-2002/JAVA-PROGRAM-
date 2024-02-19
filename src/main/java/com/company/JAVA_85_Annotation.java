package com.company;

@FunctionalInterface//you can use only one overriden method in interface
interface myFunctionalInterface {
    void add();

//    void add1();
}

class Telephone {
    public void message() {
        System.out.println("I am a telephone ");
    }
}

class Phones extends Telephone {
    @Override//it show this method should be override
    public void message() {
        System.out.println("I am a phone");
    }

    @Deprecated // it means this method has been remove/deleted
    public void callme() {
        System.out.println("I am a calling you");
    }

}

public class JAVA_85_Annotation {
    @SuppressWarnings("deprecation")//it control the every kind of warnings which has to be occured in the  future
    public static void main(String[] args) {
        Phones ph = new Phones();
        ph.message();
        ph.callme();


    }
}
