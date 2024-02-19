package com.company;

import java.util.ArrayList;

public class JAVA_81_print_student_name_arraylist_practice_set_Q1 {
    public static void main(String[] args) {
        ArrayList<String> st = new ArrayList<>();
        //adding 10 student name
        st.add("rohan0");
        st.add("rohan1");
        st.add("rohan2");
        st.add("rohan3");
        st.add("rohan4");
        st.add("rohan5");
        st.add("rohan6");
        st.add("rohan7");
        st.add("rohan8");
        st.add("rohan9");
        st.add("rohan10");
        //printing all student name  using for-each loop
        for (String sn : st) {
            System.out.println(sn);
        }
    }
}

