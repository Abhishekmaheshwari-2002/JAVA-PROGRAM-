package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

interface inter_set {
    void meht1();
}

class anno {
    @Deprecated
    public int add(int a, int b) {
        return a + b;
    }
}

class table {
    public int table(int a) {
        for (int i = 1; i <= 10; i++) {
            String tbl = a + "x" + i + " : " + i * a;
        }
        return 0;
    }
}

public class JAVA_88_Advance_practice_set {
    public static void main(String[] args) {
//        @SuppressWarnings("Deprecation")
//        anno an = new anno();
//        System.out.println(an.add(52, 56));
//        inter_set it = new inter_set() {
//            @Override
//            public void meht1() {
//                System.out.println("hello welcome to goa ");
//            }
//        };

        //creating a file
        File fl = new File("Table1");
        try {
            fl.createNewFile();
            System.out.println("File has been created ");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // multiplication table writing in a file
        String tbl = "";
        int a = 5;
        for (int i = 1; i <= 10; i++) {
            tbl += a + "X" + i + " : " + i * a;
            tbl += "\n";
        }

        //writing in a file
        try {
            FileWriter fl1 = new FileWriter("Table1");
            fl1.write(tbl);
            fl1.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }
}
