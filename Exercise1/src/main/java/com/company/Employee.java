package com.company;

public class Employee {
    public String name;
    public double hourlySalary,hours,baseSalary;

    public void getInfo(String name, double hourlySalary, double hours) {
        this.name = name;
        this.hourlySalary = hourlySalary;
        this.hours = hours;
    }


   public double computeBaseSalary(){
        baseSalary= hourlySalary*hours*20;
      return  baseSalary;
    }

    public double addSal(){

        if(baseSalary<500){
            baseSalary=baseSalary+10;
        }
        return  baseSalary;
    }

    public double addWork(){

        if(hours>6){
            baseSalary=baseSalary+5;
        }
        return baseSalary;
    }

    public void printSalary(){
        System.out.println("Final salary of the Employee is "+baseSalary + " $ ");

    }

}
