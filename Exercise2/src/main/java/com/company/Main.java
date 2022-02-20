package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       Square square=new Square();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter length of the Square :");
        double length= scanner.nextDouble();
        square.area(length);
        square.perimeter(length);
        Circle circle=new Circle();
        System.out.println("Enter radius of the Circle :");
        double radius= scanner.nextDouble();
        circle.area(radius);
        circle.perimeter(radius);
        Rectangle rectangle=new Rectangle();
        System.out.println("Enter length of the Rectangle :");
        double rectLength= scanner.nextDouble();
        System.out.println("Enter breadth of the Rectangle :");
        double rectBreadth= scanner.nextDouble();
        rectangle.area(rectLength,rectBreadth);
        rectangle.perimeter(rectLength,rectBreadth);
    }
}
