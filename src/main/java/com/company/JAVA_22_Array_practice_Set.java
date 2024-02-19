package com.company;

import java.util.*;

public class JAVA_22_Array_practice_Set {
    public static void main(String[] args) {
//        Q1:creates 5 floats and calculate their sum
        float[] flt = {12.5F, 56.6F, 58.6F, 23.5F, 89.02F};
        float sum = 0;
        for (float element : flt) {
            sum = sum + element;
        }
        System.out.println("The sum of 5 floating number " + (sum));
//        Q2:program for checking given number is present in array or not
        int[] arr = {2, 4, 6, 8, 10};
        int check = 3;
        for (int ck : arr) {
            if (ck == check) {
                System.out.println("yes your number is present in the array:" + ck);
                break;
            } else {
                System.out.println("your number is not present in the array");
            }
        }
//            Q3:program for calculating average from an array of physics marks using for each loop
        int[] marks = {25, 56, 85, 45, 45};
        int sum1 = 0;
        for (int num : marks) {
            sum1 = sum1 + num;
        }
        System.out.println("The average number of the physics : " + (sum1 / marks.length));

//                Q4:program for add two matrices 2x3
        Scanner sc = new Scanner(System.in);
        System.out.println("Adding two matrices ");
        int[][] matrix1 = new int[][]{{1, 5, 6}, {5, 96, 4}};
        int[][] matrix2 = new int[][]{{11, 52, 60}, {51, 6, 40}};
        int[][] result = {{0, 0, 0}, {0, 0, 0}};
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.print(result[i][j]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }
//        Q5:write a java program for rivers an array
        int[] riv = {10, 20, 3, 56, 89};
        for (int i = 4; i > 0; i--) {
            System.out.println(riv[i]);
        }
        System.out.println(riv[0]);

//           Q6:write a program for to find maximum and minimum element in the array
        int[] arra = {10, 256, 25, 322, 1, 96};
        int max = 0;
        int mini = arra[0];
        for (int find : arra) {
            if (find > max) {
                max = find;
            } else if (find < mini) {
                mini = find;
            }
        }
        System.out.println("The Maximum value in the array : " + max);
        System.out.println("The Minimum value in the array : " + mini);

//         Q7:write a java program  for to find the array is sorted is not
        boolean sort = true;
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 529, 12};
        for (int i = 0; i < arr1.length - 1; i++) {
            if (arr1[i] > arr1[i + 1]) {
                sort = false;
                break;
            }

        }
        if (sort) {
            System.out.println(" The array is sorted ");
        } else {
            System.out.println("The array  is not sorted ");
        }


    }
}