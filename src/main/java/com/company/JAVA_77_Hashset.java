package com.company;

import java.util.HashSet;

public class JAVA_77_Hashset {
    public static void main(String[] args) {
        HashSet<Integer> Hs = new HashSet<>(4);
        HashSet<Integer> Hs1 = new HashSet<>(10);
        Hs.add(53);
        Hs.add(39);
        Hs.add(26);
        Hs.add(17);
        Hs1.add(13);
        Hs1.add(21);
        Hs1.add(34);
        Hs.addAll(Hs1);//l2 arraylist add all element into l1
        Hs.remove(26);//remove the element at specified position
        System.out.println(Hs.contains(53));//print the true or false if the specified element is in the arraylist
        System.out.println(Hs1.contains(15));
        System.out.println(Hs);
        System.out.println(Hs1);

    }
}
