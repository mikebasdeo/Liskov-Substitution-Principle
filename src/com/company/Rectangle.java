package com.company;


public class Rectangle {

    //attributes
    private int width;
    private int height;


    //constructors
    public Rectangle(Integer height, Integer width)
    {
        this.height = height;
        this.width = width;
    }


    //methods


    @Override
    public String toString() {
        return "Width = " + width + "\nHeight = " + height;
    }
}
