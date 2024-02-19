package com.company;

/**
 * This class is used for how to generate java docs in java industry
 *
 * @author abhishek
 * @version 2.2
 * @see <a href="https://docs.oracle.com/en/java/javase/19/docs/api/index.html" target="_blank">Java docs</a>
 * @since 2002
 */

public class JAVA_84_javadoc_tags {
    /**
     * @param args These are argument supplied to the command line
     */
    public static void main(String[] args) {
        System.out.println("hello i am using java method tag");
    }

    /**
     * @param a this is the first number of the method add()
     * @param b this is the first number of the method add()
     * @return it return the sum of these two number of the add() method
     * @throws Exception if i==0
     * @deprecated this method is deprecated please use other operator
     */
    public int add(int a, int b) throws Exception {
        int i = 0;
        if (i == 0) {
            throw new Exception();
        }
        int c = a + b;
        return c;
    }
}










