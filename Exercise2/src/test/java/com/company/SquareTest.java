package com.company;

import static org.junit.Assert.*;

public class SquareTest {

    @org.junit.Test
    public void perimeter() {
        Square square=new Square();
        double perimeter=square.perimeter(5);
        assertEquals(20,perimeter,0);
    }

    @org.junit.Test
    public void area() {
        Square square=new Square();
        double area=square.area(5);
        assertEquals(25,area,0);
    }
}