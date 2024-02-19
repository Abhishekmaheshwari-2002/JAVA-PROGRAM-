package com.company;

public class JAVA_18_practice_set_loops {
    public static void main(String[] args) {
//        //Q1:program for printing star pattern
        System.out.println(" welcome to star printing problem");
        int n =5;
        for(int i=n;i>0;i--)
        {
            for(int j=0;j<i;j++)
            {
                System.out.println("*");
            }
            System.out.println("\n");
        }

//        Q2:program for sum n even number
        int n1 =2;
        int sum =0;
        for (int i=1;i<=n1;i++){
            sum= (2 * i) + sum;
        }
        System.out.println("sum="+(sum));
//        Q3: program for multiplication of n number
        int n2=4;
        int i=1;
        System.out.println("table of 4 :");
        while (i<=10){
            int table=n2*i;
            System.out.println(table);
            i++;
        }

//        Q4:program for multiplication of n number
        int n3=4;
        int i1=10;
        System.out.println("table of 4 :");
        while (i1>=1){
            int table1=n1*i1;
            System.out.println(table1);
            i1--;
        }

//         Q5:program for  finding factorial of n number
//         using for loop
        int n4=3;
        int fac=1;
        for(int j=n4;j>1;j--){
            fac=fac*j;
        }
        System.out.println("factorial : "+n4+" of "+fac);
//         using while loop
        n4=6;
        int fac1=1;
        int i2=n2;
        while(i2>1){
            fac*=i2;
            i2--;
        }
        System.out.println("factorial : "+n2+" of "+fac);









    }
}
