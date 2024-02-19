package com.company;
public class JAVA_26_method_practice_set{
    //    printing multiplication table
    static void table(int n)
//    static void multiplication_table(int n)
    {
        System.out.println("The table of " + 5 + " is : \n ");
        for (int i = 1; i <= 10; i++)//method for printing table
        {
            int table = 5 *i;
            System.out.println(5 + "*" + i + "=" +table);

        }
    }
    //star pattern of half pyramid triangle
    static void star_pattern1(int n ){
        for(int i =1;i<=n;i++){
            for(int j =1;j<=i;j++){
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    static int sum_natural(int n){
//      int sum =0;
//      if ( n==0) {
//          System.out.println("0 is not a natural number ");
//      }else {
//          for (int i = 1; i <= n; i++) {
//              sum = sum+i;
//
//          }
//      }
//      System.out.println(" The sum of "+n+" natural number : "+sum);
//      return sum;
        if (n==0){
            return 1;
        }else {
            return n + sum_natural(n - 1);

        }

    }
    static void star_pattern2(int n){

        for (int i =n;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    static int fibonacci_series(int n){
//      if (n==0){
//          return 0;
//      }else if (n==1){
//          return 1;
//      }
        if(n==1 || n==2){
            return n-1;
        }
        else
        {

            return fibonacci_series(n - 1) + (n - 2);
        }
    }

    public static void main(String [] args){

//      problem no 1
        table(5);
//      problem no 2
        star_pattern1(5);
//      problem no 3
        System.out.println("The sum of 6 natural number : "+sum_natural(6));
//      problem no 4
        star_pattern2(5);
//        problem no 5
        System.out.println(fibonacci_series(3));

    }




}


