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
    public void setHeight(Integer newHeight)
    {
        this.height = newHeight;
    }

    public void setWidth(Integer newWidth)
    {
        this.height = newWidth;
    }

    public int getWidth()
    {
        return width;
    }

    public int getHeight()
    {
        return height;
    }

    public int calculateArea(Rectangle rectangle){
        Integer area = rectangle.getHeight() * rectangle.getWidth();
        return area;
    }


    @Override
    public String toString() {
        return "RECTANGLE:   Width = " + width + "  Height = " + height + " Area = " + calculateArea(this);
    }
}
