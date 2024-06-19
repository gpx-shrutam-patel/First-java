package com.globalpayex;

public class EvenOdd {
    public static boolean isEven(int n) {
        return n % 2==0;
    }

    public static String isOdd(int n) {
        return isEven(n)?"Even":"Odd";
    }
}
