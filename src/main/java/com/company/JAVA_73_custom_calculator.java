package com.company;
//custom calculator exception for catching the custom exception

import java.util.Scanner;

class Invalidinputexception extends Exception {
    @Override
    public String toString() {
        return "you entered invalid input  ";
    }
}

class Dividebyzeroexception extends Exception {
    @Override
    public String toString() {
        return "Divided by zero can't be explained by us ";
    }
}

class Maxinputlimitexception extends Exception {
    @Override
    public String toString() {
        return "you crossed the Max. input limit which is not more than 10000";
    }
}

class Maxmultiplierreachedexception extends Exception {
    public String toString() {
        return "you reached the Max. limit of multiplier which is only 1000";
    }
}

class custom_calculator {
    public double add(double a, double b) throws Invalidinputexception, Maxinputlimitexception {
        if (a == 0 && b == 0) {
            //invalid input  exception
            throw new Invalidinputexception();
        } else if (a > 10000 && b > 10000) {
            //Max input limit exception
            throw new Maxinputlimitexception();
        }
        System.out.println(a+b);
        return a + b;
    }

    public double sub(double a, double b) throws Invalidinputexception, Maxinputlimitexception {
        if (a == 0 && b == 0) {
            //invalid input  exception
            throw new Invalidinputexception();
        } else if (a > 10000 && b > 10000) {
            //Max input limit exception
            throw new Maxinputlimitexception();
        }
        System.out.println(a-b);
        return a - b;
    }

    public double multi(double a, double b) throws Invalidinputexception, Maxinputlimitexception,
            Maxmultiplierreachedexception {
        if (a == 0 && b == 0) {
            //invalid input  exception
            throw new Invalidinputexception();
        } else if (a > 10000 && b > 10000) {
            //Max input limit exception
            throw new Maxinputlimitexception();
        } else if (a > 2000 && b > 2000) {
            //Max input for multiplier limit exception
            throw new Maxmultiplierreachedexception();
        }
        System.out.println(a*b);
        return a * b;
    }

    public double divide(double a, double b) throws Invalidinputexception, Maxinputlimitexception, Dividebyzeroexception
    {
        if (a == 0 && b == 0) {
            //invalid input  exception
            throw new Invalidinputexception();
        } else if (a > 10000 && b > 10000) {
            //Max input limit exception
            throw new Maxinputlimitexception();
        } else if (a == 0 || b == 0) {
            //Division by zero exception
            throw new Dividebyzeroexception();
        }
        System.out.println(a/b);
        return a / b;
    }
}
public class JAVA_73_custom_calculator {
    public static void main(String[] args) throws Invalidinputexception,Maxinputlimitexception,
            Maxmultiplierreachedexception,Dividebyzeroexception
    {
        custom_calculator cs = new custom_calculator();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the your two input ");
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
//        cs.add(input1,input2);
//        cs.sub(input1,input2);
//        cs.multi(input1,input2);
        cs.divide(input1,input2);


    }
}


//package com.company;
////custom calculator exception for catching the custom exception
//
//import java.util.Scanner;
//
//class Invalidinputexception extends Exception {
//    public String toString() {
//        return "you entered Input is invalid ";
//    }
//}
//
//class Dividebyzeroception extends Exception {
//    public String toString() {
//        return "Divided by zero can't be explained by us ";
//    }
//}
//
//class Maxinputlimitexception extends Exception {
//    public String toString() {
//        return "you crossed the Max. input limit which is not more than 10000";
//    }
//}
//
//class Maxmultiplierreachedexception extends Exception {
//    public String toString() {
//        return "you reached the Max. limit of multiplier which is only 1000";
//    }
//}
//
//class custom_calculator {
//    //    takeing two inputs
//    public int input1;
//    public int input2;
//    Scanner sc = new Scanner(System.in);
//
//    public void calculator() {
//
//        System.out.println("Enter the your two input ");
//        input1 = sc.nextInt();
//        input2 = sc.nextInt();
//
//        //Max input limit exception
//        if (input1 > 10000 && input2 > 10000) {
//            System.out.println("for Max input exception");
//            try {
//                throw new Maxinputlimitexception();
//            } catch (Exception e) {
//                System.out.println(e);
//            }
//        }
//        //Division by zero exception
//        else if (input1 == 0 || input2 == 0) {
//            System.out.println("for division exception ");
//            try {
//                throw new Dividebyzeroception();
//
//            } catch (Exception e) {
//                System.out.println(e);
//            }
//        } else if (input1 != 0 && input2 != 0) {
//            int div = input1 / input2;
//            System.out.println("Division : " + div);
//        }
//        //Max input for multiplier limit exception
//        if (input1 > 1000 && input2 > 1000) {
//            System.out.println("for Max input for multiplier exception");
//            try {
//                throw new Maxmultiplierreachedexception();
//            } catch (Exception e) {
//                System.out.println(e);
//            }
//        } else {
//            int multi = input1 * input2;
//            System.out.println("mulitplie : " + multi);
//        }
//    }
//}
//public class JAVA_73_custom_calculator {
//    public static void main(String[] args) {
//        custom_calculator cs = new custom_calculator();
//        cs.calculator();
//    }
//}
