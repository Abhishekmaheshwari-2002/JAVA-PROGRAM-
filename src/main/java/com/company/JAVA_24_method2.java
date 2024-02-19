package com.company;

public class JAVA_24_method2 {
    static void setval(int a1, int b1) {
        int a;
        a = a1;
        int b;
        b = b1;
        a = 256;
        b = 630;//so it make no sense if you change the value of passing parameter its doesn't affect
    }

    static void setval1(int[] ar) {
        ar[0] = 153;
    }

    public static void main(String[] args) {
        //program for checking what happened when we pass the parameter we try to change the value

        //In the condition of normal integer
        int x = 25;
        int y = 50;
        System.out.println("The value of a and b is : " + x + " " + y);// without using setval metjod
        setval(x, y);//when we pass the normal integer so only copy goes
        System.out.println("The value of a and b is using setval : " + x + " " + y);//using setval method

        //In the condition of array
        int[] arr = {10, 20, 30, 40, 50, 60};
        setval1(arr);//when we pass the array  so array will not copy except whole array is send to the method
        System.out.println("The value of arr of a[0] is :" + arr[0]);
    }
}
