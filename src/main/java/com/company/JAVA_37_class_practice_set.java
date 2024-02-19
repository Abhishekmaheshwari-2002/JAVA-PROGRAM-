package com.company;

//Q1:basic class of Employee1
class Employeedetails {
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    //creating a get&set function
    public void setName(String n) {
        name = n;//default value of this string is null
    }

}

class Cellphone {
    public void ring() {
        System.out.println("My phone is ring.........!!!!!  ");
    }

    public void vibrate() {
        System.out.println("Your phone is vibrating.....!!! ");
    }
}

class Square {
    int side;

    public int area() {
        return side * side;
    }

    public int perimeter() {
        return 4 * side;
    }
}

class rectangle {
    int l;
    int w;

    public int arearec() {
        return l * w;
    }

    public int perimeterrec() {
        return 2 * (l * w);
    }
}

public class JAVA_37_class_practice_set {
    public static void main(String[] args) {
        /*
        //Q1:basic class of Employee1
        Employeedetails emp = new Employeedetails();//Instantiating a new object
        //created  calling set & get function
        emp.setName("Abhishek maheshwari");
        System.out.println("The Employee name is : " + emp.getName());
        emp.salary=12000;
        System.out.println("The Employee salary is : " + emp.getSalary());

        //Q2:creating a class cellphone
        Cellphone cell =new Cellphone();//Instantiating a new object
        cell.ring();
        cell.vibrate();

        //Q3:creating a class for calculating area and perimeter of squre
        Square sq = new Square();
        sq.side=9;
        System.out.println("The area of square is : "+sq.area());
        System.out.println("The perimeter of square is : "+sq.perimeter());

        //Q4:creating a class for calculating area and perimeter of rectangle
        rectangle rec =new rectangle();
        rec.l=2;
        rec.w=6;
        System.out.println("The area of rectangle is : "+rec.arearec());
        System.out.println("The perimeter of rectangle is : "+rec.perimeterrec());
        */

    }
}
