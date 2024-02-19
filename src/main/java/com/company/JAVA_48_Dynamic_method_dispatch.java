//Dynamic method dispatch
package com.company;

class Phone {
    public void phone_name() {
        System.out.println("nokia1100");
    }

    //creating override method
    public void call_my_name() {
        System.out.println("your phone name is : nokia1100 \n ");
    }
}

//extending class phone to smartphone
class Smartphone extends Phone {
    public void smartphone_name() {
        System.out.println("Samsung s8");
    }

    @Override
    public void call_my_name() {
        System.out.println("your Smartphone name is : Samsung s8 ");
    }
}

public class JAVA_48_Dynamic_method_dispatch {
    public static void main(String[] args) {
//        calling method by object separately
        Phone p = new Phone();//Instantiating an object
        p.phone_name();
        p.call_my_name();

        Smartphone sm = new Smartphone();//Instantiating an object
        sm.smartphone_name();
        sm.call_my_name();

//      Dynamic method dispatch
        Phone ps = new Smartphone();//Instantiating an object of reference  is super class and object is creating by
//      sub. class
        ps.phone_name();//it is allowed
        ps.call_my_name();//it is allowed
//      Ṣps.smartphone_name();//it is not allowed

    }
}
