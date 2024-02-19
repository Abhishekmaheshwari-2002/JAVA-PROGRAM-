package com.company;

import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class JAVA_79_Calender {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();//it is an abstract class we can't create instance/obj. of the class
        System.out.println(c.getTime());
        System.out.println(c.getClass());
        System.out.println(c.getCalendarType());
        System.out.println(c.getFirstDayOfWeek());
        System.out.println(c.getTimeZone());
        System.out.println(c.getTimeInMillis());
        System.out.println(c.getTimeZone().getID());

        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.WEEK_OF_YEAR));
        System.out.println(c.get(Calendar.WEEK_OF_MONTH));
        System.out.println(c.get(Calendar.WEEK_OF_YEAR));
        System.out.println(c.getMaximum(Calendar.WEEK_OF_YEAR));
        System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(c.get(Calendar.HOUR_OF_DAY));
        System.out.println(c.get(Calendar.MONTH));
        System.out.println(c.get(Calendar.MINUTE));
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.MILLISECOND));


        GregorianCalendar gc = new GregorianCalendar();//it is a class we can use as a class
        System.out.println(gc.isLeapYear(2022));
        System.out.println(Arrays.toString(TimeZone.getAvailableIDs()));
        System.out.println(TimeZone.getAvailableIDs()[5]);
//        System.out.println(TimeZone.getTimeZone());
        System.out.println(TimeZone.getDefault());
//        System.out.println(TimeZone.getID());


    }
}
