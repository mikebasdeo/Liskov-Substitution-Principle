package com.company;

public class Square extends Rectangle{

    //attributes

    //constructors
    public Square(Integer height)
    {
        super(height, height);
    }

    //methods


    @Override
    public String toString() {
        return "SQUARE:   Width = " + this.getWidth() + "  Height = " + this.getHeight();
    }
}
