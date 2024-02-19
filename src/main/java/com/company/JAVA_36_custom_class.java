package com.company;
//creating a custom class
class Employee{
    // created some class member
    int salary;
    int id;
    String name;
    // created some class method
    public int getid()
    {
        return id;

    }
    public void printDetails()
    {
        System.out.println("The salary of employee : " + salary);
        System.out.println("The name of employee : " + name);
    }
}

// Main class of the java class
public class JAVA_36_custom_class {
    public static void main(String[] args) {
        System.out.println("This is a custom class");
        Employee Emp = new Employee();//Instantiating a new object
        Emp.salary = 10000;
        Emp.name = "Abhsihek maheshwari";
        Emp.id=15;
        //printing details without using method
        System.out.println("The salary of Employee :"+Emp.salary);
        System.out.println("The salary of Employee :"+Emp.name);
        //printing details using method
        Emp.printDetails();

        int ID = Emp.getid();
        System.out.println("The id of Employee :"+ID);


        //you can create multiple object
        Employee Emp2 = new Employee();
        Employee Emp3 = new Employee();
        Employee Emp4 = new Employee();
        Employee Emp5 = new Employee();

        Emp2.salary = 250000;
        Emp2.name = "Raghav maheshwari";
        Emp2.id=11;
        //printing details without using method
        System.out.println("The salary of Employee :"+Emp2.salary);
        System.out.println("The salary of Employee :"+Emp2.name);
        //printing details using method
        Emp2.printDetails();
        int ID1 = Emp2.getid();
        System.out.println("The id of Employee :"+ID1 );

    }
}
