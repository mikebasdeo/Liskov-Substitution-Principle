package com.company;

public class Square extends Rectangle{

    //attributes

    //constructors
    public Square(Integer height)
    {
        super(height, height);
    }

    //methods
    public void setHeight(Integer height){
        super.setHeight(height);
        super.setWidth(height);
    }

    public void setWidth(Integer width){
        super.setHeight(width);
        super.setWidth(width);
    }


    @Override
    public String toString() {
        return "SQUARE:   Width = " + this.getWidth() + "  Height = " + this.getHeight() + " Area = " + calculateArea(this);
    }
}
