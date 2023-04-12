package com.bl.empwage;

public class EmpMainClass {
    public static final int employeWage_per_hour = 20;
    public static final int employeWage_full_day = 8;
    public static final int employeWage_PART_TIME_HOURS=8;
    public static void main(String[] args) {
        System.out.println("Welcome to employee wage project");

        int attendance = (int) (Math.random() * 10) % 2;
        if (attendance == 1) {
            System.out.println("Employee is present");
            int wage;
            wage = employeWage_per_hour * employeWage_full_day;
            System.out.println(wage);
        }
        else
            System.out.println("Employee is absent");
    }
}
