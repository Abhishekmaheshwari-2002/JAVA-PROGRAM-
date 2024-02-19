package com.company;
import java.util.*;
public class JAVA_10_Stringmethod_practice_set {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

//        Q1:program for converting String into lower and upper case
        System.out.println(" Enter the string ");
        String str = sc.nextLine();
        System.out.println(str.toLowerCase());//converting into lower case
        System.out.println(str.toUpperCase());//converting into Upper case

//        Q2:program for replace spaces with underscores
        String str1= "Hello bro how are you";
        System.out.println(str1.replace("ll","_"));//replace old char with new char
        System.out.println(str1.replace(" ","_"));//replace spaces with underscores

//        Q3:program for fill in letter template using replace()
        String str2="Hello,My name is <|name|> Maheshwari";
        System.out.println(str2.replace("<|name|>","Abhishek"));//replace <|name|> with Abhishek

//        Q4:program for detect double and tripple space
        String str3 ="I  am the best    man of the world" ;
        System.out.println(str3.indexOf("  "));// for  double space
        System.out.println(str3.indexOf("   "));// for  triple space

//        Q5:write a program for using sequence character
//        before using sequence character
        String str4 = "Dear friend, I hope are you well . Thank you ";
        System.out.println(str4);
//        after using sequence character
        String str5 = "Dear friend,\n\t\t\tI hope are you well.\n\t\t\t\t\t\t\t\t Thank you ";
        System.out.println(str5);












    }
}
