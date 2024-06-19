package com.globalpayex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvenOddTest {
    @Test
    void testEven() {
        var n = 9;
        var expected = false;
        var actul = EvenOdd.isEven(n);
        assertEquals(expected, actul);

         n = 10;
         expected = true;
         actul = EvenOdd.isEven(n);
        assertEquals(expected, actul);
    }

    @Test
    void testOdd() {
        var n = 9;
        var expected = "Odd";
        var actul = EvenOdd.isOdd(9);
        assertEquals(expected, actul);

         n = 10;
         expected = "Even";
         actul = EvenOdd.isOdd(10);
        assertEquals(expected, actul);



    }
}