package com.company;

//parent class -> child class -> grandson class = hierarchy inheritance
class base1 {
    base1() {
        //non parametrised constructor
        System.out.println("I am a base class constructor ");
    }

    base1(int a) {
        // parametrised constructor with one parameter
        System.out.println("i am base constructor with a = " + a);
    }
}

class derived1 extends base1 {
    //non parametsed constructor
    derived1() {
//  super(1);//it is use to pass the argument to the parameter constructor
        System.out.println("I am a derived class constructor ");
    }

    derived1(int a, int b) {
        // parametrised constructor with two parameter
        super(a);//using super keyword for passing the argument
        System.out.println("I am a derived class constructor with b = " + b);
    }
}

class derived2 extends derived1 {
    derived2() {
        //non parametrised constructor
        System.out.println("I am a derived2 class constructor ");
    }

    derived2(int a, int b, int c) {
        // parametrised constructor with three parameter
        super(a, b);
        System.out.println("I am a derived2 class constructor with c = " + c);
    }
}

public class JAVA_45_constructor_overloading_inheritance {
    public static void main(String[] args) {
        //executing a non parametrised constructor by instantiating an object
        base1 b = new base1();
        derived1 d = new derived1();
        derived2 D = new derived2();

        //executing a para metrised constructor by instantiating an object and passing the argument
   //     derived1 d1 = new derived1(12, 54);
        derived2 D1 = new derived2(11, 12, 13);

    }
}
