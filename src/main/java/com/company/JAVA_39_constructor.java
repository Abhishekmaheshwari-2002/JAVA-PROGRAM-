package com.company;
class MainEmployee{
    int id;
    String name;
    //argument or parameterised constructor
    public MainEmployee(int i,String n)
    {
        System.out.println("argument constructor called");
        id =i;
        name =n;
    }
    //constructor
    public MainEmployee(){
        System.out.println("constructor called");
        id =24;
        name ="My name is khan";
    }
    //creating a setter&getter method to set&get the value
    public void setid(int i) {id = i;}
    public int getid() {return id;}
    public void setname(String n) {name = n;}
    public String getname() {return name;    }
}

public class JAVA_39_constructor {
    public static void main(String[] args) {
        //using argument constructor
        MainEmployee Emp1 = new MainEmployee(21,"raahul khan");//Instantiating a new object
//    Emp1.setid(21);
//    Emp1.setname("Hello bro !!");
        //getting details using constructor
        System.out.println("ID = "+Emp1.getid());
        System.out.println("name = "+Emp1.getname());


    }

}
