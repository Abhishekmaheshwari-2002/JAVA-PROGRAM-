package com.company;

import java.util.HashSet;

public class JAVA_82_using_set_practice_set_Q2 {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        //you can not print duplicate element in Set collection
        hs.add(25);
        hs.add(250);
        hs.add(251);
        hs.add(25);
        hs.add(36);
        hs.add(364);
        hs.add(36);
        System.out.println(hs);//no need to any kind of loop to print element
    }
}
