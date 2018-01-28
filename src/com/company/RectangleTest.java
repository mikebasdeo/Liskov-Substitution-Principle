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

}