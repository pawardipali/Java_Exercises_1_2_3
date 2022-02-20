package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Employee employee=new Employee();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Employee Name :");
        String name=scanner.nextLine();
        System.out.println("Enter Employee Salary :");
        double emp_salary= scanner.nextDouble();
        System.out.println("Enter number of hours to work:");
        double no_of_hours=scanner.nextDouble();

        employee.getInfo(name, emp_salary, no_of_hours);
        employee.computeBaseSalary();
        employee.addSal();
        employee.addWork();
        employee.printSalary();

    }
}
