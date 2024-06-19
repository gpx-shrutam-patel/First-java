package com.globalpayex;

class GreadeDistribuption {

    public static char grade(int n) {
        if(n>100 || n<0){
            return 'I';
        }
        else if (n >= 70) {
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


    public static void checkStudentGrade(int marks) {
    }
}

