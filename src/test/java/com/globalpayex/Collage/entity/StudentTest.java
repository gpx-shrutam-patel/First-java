package com.globalpayex.Collage.entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
 @Test
    void testObjectCreation(){
    var s1=new Student();
    var s2=new Student();
    assertTrue(s1!=s2);

    assertNull(s1.name);
    assertNull(s2.name);
    assertEquals(0,s1.mark);
    assertEquals(0,s2.roll);

    s1.roll=10;
    s2.roll=13;

    assertEquals(10,s1.roll);
    assertEquals(13,s2.roll);
 }
 @Test
    void testGetDetails(){
     var s1=new Student();
     s1.roll=15;
     s1.mark=88;
     s1.gender='M';
     s1.name="shrutam";
     String expected="Name :shrutam\nGender :M\nRoll :15\nMark :88";
     String actual =s1.getdetalis();
     assertEquals(expected,actual);
 }
    @Test
    void TestGread(){
     var s1=new Student();
     s1.mark=60;
     char expected='B';
     char actual=s1.grade();
     assertEquals(expected,actual);
    }

}