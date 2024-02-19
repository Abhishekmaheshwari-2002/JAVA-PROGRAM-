package com.company;

import java.util.Objects;

class Library {
    public String[] book;
    public int no_of_book = 0;

    Library()
    {
        this.book = new String[100];
    }

    public void book_import(String b) {
        this.book[no_of_book] = b;
        this.no_of_book++;
        System.out.println("The book has been added : " + b);
    }

    public void book_issue(String b) {
        for (int i = 0; i < this.book.length; i++) {
            if (Objects.equals(this.book[i], b)) {

                System.out.println("\nThis book issued : " + b);
                this.book[i] = null;
                return;
            }
        }
    }

    public void show_book() {
        System.out.println("\nbook available in the library : ");
        for (String s : this.book) {
            if (s == null) {
                continue;
            }
            System.out.println(s);
        }
    }

}

public class JAVA_49_online_library {
    public static void main(String[] args) {
        Library lib = new Library();
        lib.book_import("c++");
        lib.book_import("The rich and poor");
        lib.book_import("NDA defence");
        lib.book_import("programing with java");
        lib.show_book();
        lib.book_issue("NDA defence");
        lib.show_book();


    }

}
