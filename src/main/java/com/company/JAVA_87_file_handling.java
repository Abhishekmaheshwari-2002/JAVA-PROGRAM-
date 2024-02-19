package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class JAVA_87_file_handling {
    public static void main(String[] args) {
        // creating a new file
        File myfile = new File("file_handling");
        try {
            myfile.createNewFile();
        } catch (IOException e) {
            System.out.println("unable to create the file");
            throw new RuntimeException(e);
        }


        //code for writing file
        try {
            FileWriter myfile1 = new FileWriter("file_handling");
            myfile1.write("hello writer and nice to meet you and me  ");
            myfile1.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        // Reading a file
        File myFile3 = new File("file_handling");
        try {
            Scanner sc = new Scanner(myFile3);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


//        //deleting a file
//        File myfile4 = new File("file_handling");
//        if (myfile4.delete()) {
//            System.out.println("File deleted : " + myfile4.getName());
//        } else {
//            System.out.println("here some problem occured during file deletion");
//        }
    }
}


//package com.company;
//
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.Scanner;
//
//public class JAVA_87_file_handling {
//    public static void main(String[] args) {
//
//        // Code to create a new file
//
//        File myFile1 = new File("file_handling");
//        try {
//            myFile1.createNewFile();
//        } catch (IOException e) {
//            System.out.println("Unable to create this file");
//            e.printStackTrace();
//        }
//
//
//        // Code to write to a file
//        try {
//            FileWriter fileWriter2 = new FileWriter("file_handling");
//            fileWriter2.write("This is our first file from this java course\nOkay now bye");
//            fileWriter2.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        // Reading a file
//        File myFile3 = new File("file_handling");
//        try {
//            Scanner sc = new Scanner(myFile3);
//            while (sc.hasNextLine()) {
//                String line = sc.nextLine();
//                System.out.println(line);
//            }
//            sc.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//
//
//        // Deleting a file
//        File myFile4 = new File("file_handling");
//        if (myFile4.delete()) {
//            System.out.println("I have deleted: " + myFile4.getName());
//        } else {
//            System.out.println("Some problem occurred while deleting the file");
//        }
//
//    }
//}

