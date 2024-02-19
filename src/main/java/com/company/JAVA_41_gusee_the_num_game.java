//create a class game which allow user to play "guess the number the at once
package com.company;
import java.util.*;

class Guess_num {

    //class member created (don't initialize same class member again-again )
    public int num;
    public int rnd;
    public int guessscore=0;//initial value is 0

    //constructor for generating random number
    Guess_num() {
        System.out.println("Welcome the guss number game");
        Random rd = new Random();//random class for generating a random number
        this.rnd = rd.nextInt(100);//this is a keyword which connect with that object which object is called
    }
    void takeuserdata() {
        System.out.println("Entered your guess  ");
        Scanner sc = new Scanner(System.in);
        this.num = sc.nextInt();
    }
    boolean guess_number() {
        guessscore++;
        if (num==rnd){
            System.out.println("you guess the correct number\nyou are a winner ");
            System.out.println("your guess score : "+guessscore);
            System.out.println("the number is : "+rnd);
            return true;
        }
        else if (num > rnd)
        {
            System.out.println("you entered bigger number try again ");
        }
        else if (num<rnd)
        {
            System.out.println("you entered smaller number try again ");
        }
        return false;
    }

    public int  guess_number1() {
        guessscore++;
        if (num==rnd){
            System.out.println("you guess the correct number and you are a winner ");
            System.out.println("your guess score : "+guessscore);
            System.out.println("the number is : "+rnd);
            return 1;
        }
        else if (num > rnd)
        {
            System.out.println("you entered bigger number try again ");
        }
        else if (num<rnd)
        {
            System.out.println("you entered smaller number try again ");
        }
        return 0;
    }

}

public class JAVA_41_gusee_the_num_game {
    public static void main(String[] args) {
        Guess_num guess = new Guess_num();
//            boolean b=false;//default value is false
//            while (b!=true)//if b is not equal to true so condition is true it will work and if b is equal to true
//                // so condition is false and so loop will end & you will get your output
//            {
//                guess.takeuserdata();
//                b = guess.guess_number();
//
//
//            }
        int j=0;
        while(j==0){
            guess.takeuserdata();
            j = guess.guess_number1();

        }
    }
}
