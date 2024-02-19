package com.company;

public class JAVA_19_Array_intro {
    public static void main(String[] args) {

//       Three-way to create array
        int[] marks1;//declaration
        marks1 = new int[5];//declaration and after memory allocation
        int[] marks2 = {10, 20, 30, 4, 0, 50};//declaration and  memory allocation and initialization are together at a time
//        marks.length -> length of the array
        int[] marks = new int[5];//declaration and  memory allocation both at a time
        for (int i = 0; i <= marks.length; i++) {
            System.out.println(i);
        }
        for (int element : marks2)//display array using foreach loopSdsa11  11q 
        {
            System.out.println(element);
        }
    }
}