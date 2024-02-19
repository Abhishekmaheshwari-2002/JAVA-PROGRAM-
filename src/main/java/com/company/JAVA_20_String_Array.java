package com.company;

public class JAVA_20_String_Array {
    public static void main(String [] args){
        String [] str ={"Hello","my","name","is","Abhishek","maheshwari"};
        System.out.println(str.length);
        System.out.println(str[1]);
        for(int i=0;i<str.length;i++){
            System.out.println(str[i]);
        }
        //printing the string array element in rivers order
        for(int i= (str.length-1);i>=0;i--)
        {
            System.out.println(str[i]);
        }
        //using for_each loop
        for(String str1 : str){
            System.out.println(str1);
        }









    }
}
