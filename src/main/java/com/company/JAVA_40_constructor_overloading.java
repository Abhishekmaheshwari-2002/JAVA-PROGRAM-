package com.company;

class Main1Employee {
    int id;
    String name;

    public Main1Employee(String n) {

        id = 24;
        name = n;
    }

    public Main1Employee(int i) {
        id = i;
        name = "My name is khan";
    }

    public Main1Employee() {
        id = 24;
        name = "My name is khan";
    }

    public Main1Employee(int i, String n) {
        id = i;
        name = n;
    }

    //using constructor overloading
    public void cons() {
        System.out.println("constructor overloading calling ");
    }

    //creating a setter&getter method to set&get the value
    public int getid() {
        return id;
    }

    public String getname() {
        return name;
    }
}

public class JAVA_40_constructor_overloading {
    public static void main(String[] args) {
        Main1Employee Emp1 = new Main1Employee(25);//Instantiating a new object

        System.out.println("ID = " + Emp1.getid());
        System.out.println("name = " + Emp1.getname());

    }

}


