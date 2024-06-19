package com.globalpayex;

public class StudentDetails {

    public static String student(String name, int roll, int age, int mark) {
        return "name:"+name+"\n"+"roll:"+roll+"\n"+"age:"+age+"\n"+"mark:"+mark;
    }
    public static char grade1(int n) {
        if (n >= 70) {
            return 'A';
        }
        else if (n >= 60) {
            return 'B';
        } else if (n >= 50) {
            return 'C';
        } else if (n >= 40) {
            return 'D';
        }
        return 'F';

    }
}
