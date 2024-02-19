package com.company;

public class JAVA_12_Logical_operator {
    public static void main(String [] args)
    {
        boolean a = true;
        boolean b = false;
        System.out.println("Logical AND operator");
        if(a && b)//using AND op.(&&)
        {
            System.out.println("Number are same ");
        }
        else
        {
            System.out.println(" Number are not same");
        }

        System.out.println("Logical OR operator");
        if(a || b)//using OR op.(||)
        {
            System.out.println("Number are same ");
        }
        else
        {
            System.out.println(" Number are not same");
        }

        System.out.println("Logical NOT operator");
        if(a != b)//using NOT op.(!)
        {
            System.out.println("Number are same ");
        }
        else
        {
            System.out.println(" Number are not same");
        }
    }
}
