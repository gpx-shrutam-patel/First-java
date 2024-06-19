package com.globalpayex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void perimeter() {
        // test data
        var length = 10;
        var breadth = 4;
        var expected = 28.0;

        //test step
        var actual = Rectangle.perimeter(length, breadth);

        // test assertion
        assertEquals(expected, actual);
    }
    @Test
    void area() {
        var length = 10;
        var breadth = 4;
        var expected = 40.0;

        //test step
        var actual = Rectangle.area(length, breadth);

        // test assertion
        assertEquals(expected,actual);

    }
}