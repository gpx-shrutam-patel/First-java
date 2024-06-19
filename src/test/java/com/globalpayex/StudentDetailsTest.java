package com.globalpayex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentDetailsTest {
    @Test
    void testStudentFormet(){
        var name="Shrutam";
        var roll=12;
        var age=22;
        var mark=75;

        var expected= "name:Shrutam\nroll:12\nage:22\nmark:75";
        var actual=StudentDetails.student(name,roll,age,mark);
        assertEquals(expected,actual);

    }
}