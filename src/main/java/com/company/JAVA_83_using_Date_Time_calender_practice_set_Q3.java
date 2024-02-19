package com.company;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class JAVA_83_using_Date_Time_calender_practice_set_Q3 {
    public static void main(String[] args) {
//        Date d = new Date();
//        System.out.println(d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());//you can use these method it doesn't
        // matter method has been removed
//        Calendar c = Calendar.getInstance();
//        System.out.println(c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));
        LocalDateTime dt = LocalDateTime.now();
        DateTimeFormatter dft = DateTimeFormatter.ofPattern("hh:mm:ss");//created a date format using "ofpattern()"
        String str = dt.format(dft);//linked a LocalDateTime obj to DateTimeFormatter obj using format() in string
        System.out.println(str);


    }
}
