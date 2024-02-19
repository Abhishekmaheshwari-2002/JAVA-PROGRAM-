package com.company;

class MyEmployee {
    //   private int id ;
//   private String name ; // it's a private a member so you can't access out of the class
    int id;
    String name;

    //creating a setter&getter method to set&get the value
    public void setid(int i) {
        id = i;
    }

    public int getid() {
        return id;
    }

    public void setname(String n) {
        name = n;
    }

    public String getname() {
        return name;
    }
}

public class JAVA_38_private_access_modifier {
    public static void main(String[] args) {
        MyEmployee Abhi = new MyEmployee();
        /*Abhi.id =25;
        Abhi.name="Abhishek maheshwari";//it throws the error because of private modifier you can't access it*/
        Abhi.setid(25);//access the private member by using method
        System.out.println("The id is : " + Abhi.getid());
        Abhi.setname("Abhishek mahehswari");
        System.out.println("The name is : " + Abhi.getname());


    }


}
