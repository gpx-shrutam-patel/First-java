package com.globalpayex.Collage.entity;

import javax.xml.namespace.QName;

public class Student {
    // Object attribute
    //instance of class
    String name;
    char gender;
    int roll;
    int mark;

    public  String getdetalis() {
        //inplicite parameter-this- adderess of curent object
        return "Name :"+this.name+"\nGender :"+this.gender+"\nRoll :"+this.roll+"\nMark :"+this.mark;

    }
    public  char grade() {
        if(this.mark>100 || this.mark<0){
            return 'I';
        }
        else if (this.mark >= 70) {
            return 'A';
        }
        else if (this.mark >= 60) {
            return 'B';
        } else if (this.mark >= 50) {
            return 'C';
        } else if (this.mark >= 40) {
            return 'D';
        }
        return 'F';

    }
}
