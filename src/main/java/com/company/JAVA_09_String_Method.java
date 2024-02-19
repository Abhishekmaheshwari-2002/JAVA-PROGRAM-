package com.company;

public class JAVA_09_String_Method {

  public static void main(String[] args) {
    String str = "Abhishek";
    System.out.println("welcome to String method class ");
    System.out.println(str.length()); // Method of finding String length
    System.out.println(str.toLowerCase()); //Method of finding String in Lower case
    System.out.println(str.toUpperCase()); //Method of finding String in Upper case

    String str1 = "        Abhishek         ";
    System.out.println(str1.trim()); //Method of removing unnecessary space of the string
    System.out.println(str.substring(2)); //Method of finding substring using index no.
    System.out.println(str.substring(2, 5)); //Method of finding substring between range in index no.
    System.out.println(str.replace('h', 'm')); //Method of replace the char/string
    System.out.println(str.replace("h", "abhi")); //Method of replace the char/string
    System.out.println(str.startsWith("Abh")); //Method of checking the string is start with given string or not
    System.out.println(str.endsWith("Abhi")); //Method of checking the string is start with given string or not
    System.out.println(str.charAt(3)); //Method of finding the char. of given index no.
    System.out.println(str.indexOf('s')); //Method of finding index no. of given string
    System.out.println(str.indexOf('b', 3)); //Method of finding index no. of given string
    System.out.println(str.lastIndexOf('s')); //Method of finding index no. of given string starting of the last
    System.out.println(str.lastIndexOf('b', 4)); //Method of finding index no. of given string  and given
    //index no.
    System.out.println(str.equals("Abhishek")); // Method of checking string is equals or not and case are sensitive
    System.out.println(str.equalsIgnoreCase("aBhIsheK")); // Method of checking string is equals or not and case are
    //not sensitive

  }
}
