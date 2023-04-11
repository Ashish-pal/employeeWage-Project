package com.bl.empwage;

public class EmpMainClass {
    public static void main(String[] args) {
        System.out.println("Welcome to employee wage project");

        int attendance = (int) (Math.random() * 10) % 2;
        if (attendance == 1)
            System.out.println("Employee is present");
        else
            System.out.println("Employee is absent");
    }
}
