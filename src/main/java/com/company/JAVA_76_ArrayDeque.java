package com.company;

import java.util.ArrayDeque;
import java.util.LinkedList;

public class JAVA_76_ArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> l1 = new ArrayDeque<>();
        ArrayDeque<Integer> l2 = new ArrayDeque<>();
        l1.add(2);
        l1.add(5);//its add() the any element in the last add() == addLast() both are equal
        l1.add(45);
        l1.add(2);
        l1.add(3);
        l1.add(2);
        l2.add(11);
        l2.add(15);
        l2.add(18);
        l1.addAll(l2);//l2 arraylist add all element into l1
        l1.addLast(151);
        l1.addFirst(110);
        l1.remove(5);//remove the element at specified position
        System.out.println(l1.contains(45));//print the true or false if the specified element is in the arraylist
        System.out.println(l2.contains(15));
        System.out.println(l1.getFirst());
        System.out.println(l1.getLast());

    }
}
