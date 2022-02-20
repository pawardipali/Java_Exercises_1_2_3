package com.company;

public class Square {
    public double l;

    double perimeter(double l){
        if(l<0){
            System.out.println("Enter valid number");
        }
            double perimeter=4*l;
            System.out.println("Perimeter of the Square : "+ perimeter);

          return  perimeter;
    }

    double area(double l){
        if(l<0){
            System.out.println("Enter valid number");
        }
            double area=l*l;
            System.out.println("Area of the Square : "+ area);
            return area;

    }

}
