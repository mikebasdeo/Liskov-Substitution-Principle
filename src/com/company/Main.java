package com.company;

public class Main {

    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(2, 4);

        Square s1 = new Square(5);


        System.out.println(r1.toString());

        System.out.println(s1.toString());


        //Rectangle breaks when an instance of square is passed to it.
        Rectangle s2 = new Square(7);
        s2.setHeight(6);
        s2.setWidth(7);
        System.out.println(s2.toString());
    }
}
