package com.company;
interface food1 {
    void indian_food();
    void thai_food();
    private void royal_king() {
        System.out.println("The king name is : maha raja singh");
    }
    default void royal_food() {
        royal_king();
        System.out.println("\nI love royal food and people");
    }
}
//you can implement and extends the class at a time
class language_food1 implements food1 {

    //  it is a class method
    public void japanese() {
        System.out.println("Hello i can speak japanese");
    }

    //override or implements method from interfaces
    public void hindi() {
        System.out.println("Hello i can speak hindi");
    }

    public void english() {
        System.out.println("Hello i can speak english");
    }

    public void indian_food() {
        System.out.println("i love indian food");
    }

    public void thai_food() {
        System.out.println("i love thai food");
    }

}

public class JAVA_53_polymorphism_using_interface {
    public static void main(String[] args) {

//      we can't create an object of an interface, but we can create a reference of an interface
        food1 fd = new language_food1();
        fd.royal_food();
        fd.indian_food();
        fd.thai_food();
//      fd.hindi();//this is not valid

        language_food1 ld =new language_food1();
        ld.japanese();
        ld.hindi();
        ld.english();
        ld.indian_food();
        ld.thai_food();

        // we can also call interface method
        ld.royal_food();//this is not valid



    }
}
