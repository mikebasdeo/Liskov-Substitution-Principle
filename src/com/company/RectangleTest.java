package com.company;

import  org.junit.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectangleTest {



    @Test
    public void testRectangleArea() {
        System.out.println("Testing Rectangle Area");

        Rectangle rTest = new Rectangle(5,10);
        assertEquals(50, rTest.calculateArea(rTest));
    }

    @Test
    public void testSquareArea()
    {
        System.out.println("Testing Square Area");
        Square sTest = new Square(7);
        assertEquals(49, sTest.calculateArea(sTest));
    }

    @Test
    public void testRectangleFromSquare()
    {
        System.out.println("Testing rectangle from instance of square");
        Rectangle s2 = new Square(7);
        s2.setHeight(6);
        s2.setWidth(7);
        assertEquals(42, s2.calculateArea(s2));
    }

}