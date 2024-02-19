package com.company;
import java.util.*;
public class JAVA_16_RPS{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        Random rnd =new Random();//random is class which contains generate random number  function
        int point = 1;//it is a score point if you win
        int rndinput =rnd.nextInt(1,4);//generate random number between the range
        System.out.println("****Welcome to the Rock Pepper Scissor Game***");
        System.out.println("Enter the name of the player");
        String str = sc.nextLine();
        System.out.println("so player 1 : "+str+"\n player 2 : computer ");
        System.out.println("Rule of the game : ");
        System.out.println("press 1 for Rock\n press 2 for pepper \n press 3 for Scissor \n\n\t Let's Game begin ");

        for (int i = 1; i<4;i++) {
            System.out.println("Round no : "+i+"\n");
            System.out.println("Enter your input ");
            int userinput = sc.nextInt();
            switch (userinput) {
                case 1 -> System.out.println("player 1 : rock ");
                case 2 -> System.out.println("player 1 : pepper ");
                case 3 -> System.out.println("player 1 : scissor ");
                default -> System.out.println("your input is wrong ");
            }
            switch (rndinput) {
                case 1 -> System.out.println("player 2 : rock ");
                case 2 -> System.out.println("player 2 : pepper ");
                case 3 -> System.out.println("player 2 : scissor ");
                default ->System.out.println("your input is wrong \n\n\n");

            }

            if (rndinput == 1 && userinput == 1) {
                System.out.println("sorry its a tie ");
                System.out.println("Mr." + str);
            }
//            else if (userinput == 1 && rndinput==3 || userinput == 2 && rndinput==1 || userinput == 3 && rndinput==2 ) {
//                System.out.println("You win ");
//            }
//            else {
//                System.out.println("computer win");
//            }
            else if (rndinput == 1 && userinput == 2) {
                System.out.println("pepper beat Rock \n YOU WIN!!! ");
                System.out.println("Mr." + str+" you got a point : " + point);

            } else if (rndinput == 1 && userinput == 3) {
                System.out.println("Rock beat scissor \n YOU LOSE!!! ");
                System.out.println("Mr." + str+" you got a point : 0 " );
            } else if (rndinput == 2 && userinput == 1) {
                System.out.println("pepper beat Rock \n YOU LOSE!!! ");
                System.out.println("Mr." + str+" you got a point : 0 " );
            } else if (rndinput == 2 && userinput == 2) {
                System.out.println("sorry its a tie ");
            } else if (rndinput == 2 && userinput == 3) {
                System.out.println("scissor beat pepper \n YOU WIN!!! ");
                System.out.println("Mr." + str+" you got a point : "+point);
            } else if (rndinput == 3 && userinput == 1) {
                System.out.println("Rock beat scissor  \n YOU WIN!!! ");
                System.out.println("Mr." + str+" you got a point : "+point);
            } else if (rndinput == 3 && userinput == 2) {
                System.out.println("scissor beat pepper \n YOU LOSE!!! ");
                System.out.println("Mr." + str+" you got a point : 0 ");
            } else if (rndinput == 3 && userinput == 3) {
                System.out.println("sorry its a tie ");
            }


        }
    }
}
