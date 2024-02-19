package com.company;

public class JAVA_21_Multi_Dimention_Array {
    public static void main (String [] args){
        int [] arr1 = new int[4];//1D array created
        arr1[0]=10;
        arr1[1]=20;
        arr1[2]=30;
        arr1[3]=40;
        //Display 1D array using for loop or for each loop
        for (int element :arr1){
            System.out.println(element);
        }
        int [][] arr = new int [2][3];//2D array created
        arr[0][0]=101;
        arr[0][1]=102;
        arr[0][2]=103;
        arr[1][0]=201;
        arr[1][1]=202;
        arr[1][2]=203;
        //Display 2D array using for loop
        System.out.println("Display 2D array using for loop ");
        for (int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}
