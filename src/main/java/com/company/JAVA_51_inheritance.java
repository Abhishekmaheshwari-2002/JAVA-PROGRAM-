package com.company;

//interface is a fully 100% abstract class every method is abstract & no need to use abstract keyword
interface language {
    int a = 15;//it is not abstract but ......it is a final
    void hindi();
    //  void hello();//you can't update interface like this you can update using default keyword with method implementation
    void english();
}
//more than one interface can be created and multiple inheritance interface will be possible in interface
interface food {
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



class drink {
    public void cold_drink() {
        System.out.println("i love cold drink");
    }

    public void hot_drink() {
        System.out.println("i love hot drink");
    }
}

//you can implement and extends the class at a time
class language_food extends drink implements language, food {
    public int a = 25;//but it can be modified here

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

public interface JAVA_51_inheritance {
    static void main(String[] args) {
        language_food lf = new language_food();
        // class method
        lf.japanese();
        /*using default keyword you can implement the method in interface.because of updation is not allowed in
        interface.but you can update interface using it*/
        lf.royal_food();

        //overrided method from interface
        lf.hindi();
        lf.english();
        lf.indian_food();
        lf.thai_food();

        //class method
        lf.cold_drink();
        lf.hot_drink();

        drink drn = new drink();
        drn.cold_drink();
        drn.hot_drink();

//      lf.a=5;//it can't be modified the variable here
        System.out.println("a = " + lf.a);

    }
}