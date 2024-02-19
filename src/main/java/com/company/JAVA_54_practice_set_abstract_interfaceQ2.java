package com.company;
//create class monkey with method jump() & bite() method. create class human which inherit this monkey class and
//implements basic monkey interface with eat() and sleep() method
interface BasicMonkey {
    void eat();

    void sleep();
}

class Monkey {

    public void jump() {
        System.out.println("Monkey jumped to the tree ");
    }

    public void bite() {
        System.out.println("Monkey bite a man ");
    }
}

class Human extends Monkey implements BasicMonkey {
    @Override
    public void eat() {
        System.out.println("Monkey is eating banana ");
    }

    @Override
    public void sleep() {
        System.out.println("Monkey is sleeping");
    }

}

public class JAVA_54_practice_set_abstract_interfaceQ2 {
    public static void main(String[] args) {
        Human hm = new Human();
        hm.eat();
        hm.sleep();
        hm.jump();
        hm.bite();

        //polymorphism using in abstract class or interface
        Monkey mnk = new Human();
        mnk.bite();
        mnk.jump();

        BasicMonkey bm  = new Human();
        bm.eat();
        bm.sleep();


    }
}
