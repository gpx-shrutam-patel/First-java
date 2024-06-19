package com.globalpayex;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class GreadeDistributionTest {
    @ParameterizedTest
    @CsvSource({
            "71,A",
            "70,A",
            "62,B",
            "39,F"
    })
    void testGrade(int marks, char expected) {
        // Test steps
        var actual = GreadeDistribuption.grade(marks);
        assertEquals(expected, actual);
    }

//@Test
//    void TestgreadDistribution(){
//        var n=70;
//        var expected ='A';
//        var actual = GreadeDistribuption.grade(n);
//        assertEquals(expected,actual);
//
//        n=60;
//        expected ='B';
//         actual = GreadeDistribuption.grade(n);
//        assertEquals(expected,actual);
//
//         n=50;
//        expected ='C';
//        actual = GreadeDistribuption.grade(n);
//        assertEquals(expected,actual);
//
//         n=40;
//        expected ='D';
//         actual = GreadeDistribuption.grade(n);
//        assertEquals(expected,actual);


        // for new easy method
//        @ParameterizedTest({
//                        "71,A";
//                        "70,"";
//                        "62,B";
//                        "39,F";
//
//                })






    }

