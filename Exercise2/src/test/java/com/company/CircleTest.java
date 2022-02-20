package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {

    @Test
    public void perimeter() {
        Circle circle=new Circle();
        double perimeter=circle.perimeter(5);
        assertEquals(31.41592653589793,perimeter,0);
    }

    @Test
    public void area() {
        Circle circle=new Circle();
        double area=circle.area(5);
        assertEquals(78.53981633974483,area,0);
    }
}