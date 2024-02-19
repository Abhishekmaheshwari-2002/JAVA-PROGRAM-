package com.company;

import java.util.*;

public class JAVA_74_java_collection_arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        l1.add(2);
        l1.add(5);
        l1.add(9);
        l1.add(2);
        l1.add(3);
        l1.add(2);
        l2.add(11);
        l2.add(15);
        l2.add(18);
        l2.add(19);
        l2.add(17);
//        l1.add(14,5);//it will throw the exception indexoutofbound exception
        l1.add(6, 5);//add the element at specified position
        l1.remove(5);//remove the element at specified position
//        l2.clear();//delete all the element of l2
        l1.addAll(1, l2);//l2 arraylist add all element into l1
        System.out.println(l1.contains(45));//print the true or false if the specified element is in the arraylist
        System.out.println(l2.contains(15));
        System.out.println(l1.indexOf(2));//return the index no. of the element in the starting
        System.out.println(l1.lastIndexOf(2));//return the index no. of the element in the last
        l1.set(1, 6);//set the element at specified position of specified element
        for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i));//print the element of position by position
            System.out.print(",");
        }
    }
}
