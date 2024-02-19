package com.company;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class JAVA_80_Date_Time {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();//it returns the local date
        System.out.println(ld);
        LocalTime T = LocalTime.now();//it returns the local time
        System.out.println(T);
        LocalDateTime dt = LocalDateTime.now();//it returns the local date-time
        System.out.println(dt);

        //we can get a date and time in customize format
        DateTimeFormatter dft = DateTimeFormatter.ofPattern("dd/MM/yyyy--y a w W");
        DateTimeFormatter dft1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");//created a date format using "ofpattern()"
        DateTimeFormatter dft2 = DateTimeFormatter.ISO_DATE;
        DateTimeFormatter dft3 = DateTimeFormatter.ISO_TIME;
        String str = dt.format(dft);//linked a LocalDateTime obj to DateTimeFormatter obj using format() in string
        String str1 = dt.format(dft1);
        String str2 = dt.format(dft2);
        String str3 = dt.format(dft3);
        System.out.println(str);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);


    }
}
