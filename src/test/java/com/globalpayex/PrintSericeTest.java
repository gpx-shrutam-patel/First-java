package com.globalpayex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrintSericeTest {
    @Test
    void testOddEvenSeries() {
        var n = 8;
        var expected = "0,2,4,6,8";

        var actual = PrintSerice.getSeries(n);
        assertEquals(expected,actual);

        n = 15;
        expected = "0,2,4,6,8,10,12,14";
        actual =PrintSerice.getSeries(n);
        assertEquals(expected,actual);
    }

}