package com.company;

import java.util.Date;

public class JAVA_78_Date_Time /*extends Thread*/{
    public static void main(String[] args) {

        Date d = new Date();
        //only some method are rest is here
        System.out.println(d);
        System.out.println(d.getClass());//it returns the class name which is Date class
        System.out.println(d.getTime());//it returns the time in millisecond since 1.jan.1970
        //these all method are deprecated
        System.out.println(d.getDate());
        System.out.println(d.getDay());
        System.out.println(d.getMonth());
        System.out.println(d.getYear());
        System.out.println(d.getTimezoneOffset());
        System.out.println(d.getHours());


//        System.out.println("welcome to java Date and Time ");
//        System.out.println("Total second have passed since year 1970 "+System.currentTimeMillis()/1000);
//        System.out.println("Total minute have passed since year 1970 "+System.currentTimeMillis()/1000/60);
//        System.out.println("Total hour have passed since year 1970 "+System.currentTimeMillis()/1000/3600);
//        System.out.println("Total year have passed since year 1970 "+System.currentTimeMillis()/1000/3600/24/365);


    }
}
