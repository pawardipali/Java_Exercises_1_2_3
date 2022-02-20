package com.company;

public class Rectangle {
    public double l,b;

    double perimeter(double l,double b ){
        if(l<0 || b<0) {
            System.out.println("Enter valid number");
        }
            double perimeter=2 * (l + b);
            System.out.println("Perimeter of the rectangle: " + perimeter);
            return perimeter;

    }

    double area(double l, double b){
        if(l<0 || b<0) {
            System.out.println("Enter valid number");
        }
           double area=l*b;
            System.out.println("Area of the rectangle: " + area);
            return area;

    }
}
