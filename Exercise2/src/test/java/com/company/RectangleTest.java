package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {

    @Test
    public void perimeter() {
        Rectangle rectangle=new Rectangle();
        double perimeter=rectangle.perimeter(5,5);
        assertEquals(20,perimeter,0);
    }

    @Test
    public void area() {
        Rectangle rectangle=new Rectangle();
        double area=rectangle.area(5,5);
        assertEquals(25,area,0);
    }
}