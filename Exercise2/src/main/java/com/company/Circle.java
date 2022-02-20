package com.company;

public class Circle {
    static final double PI=Math.PI;
    public double r;

   double  perimeter(double r){
        if(r<0){
            System.out.println("Enter valid number");
        }
            double perimeter = 2 * PI * r;
            System.out.println("The perimeter of circle is : " + perimeter);
            return perimeter;


    }

    double area(double r) {
        if (r < 0) {
            System.out.println("Enter valid number");
        }
            double area = PI * r * r;
            System.out.println("The area of the circle is : " + area);
         return area;
    }
}
