package com.bl.empwage;

import java.util.Scanner;

public class EmpMainClass {
    public static final int employeWage_per_hour = 20;
    public static final int employeWage_full_day = 8;
    public static final int employeWage_PART_TIME_HOURS = 4;
    public static final int working_days_per_month = 20;

    public static void main(String[] args) {
        System.out.println("Welcome to employee wage project");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter part time hours employee works: ");
        int part_time = sc.nextInt();
        int attendance = (int) (Math.random() * 10) % 2;
        if (attendance == 1) {
            System.out.println("Employee is present");
            int wage;
            wage = employeWage_per_hour * employeWage_full_day;
            System.out.println(wage);
            wage = working_days_per_month * employeWage_full_day;
            System.out.println(wage);
            int total_hours_in_month = employeWage_per_hour * employeWage_full_day;
            System.out.println(total_hours_in_month);
            int total_wage = employeWage_per_hour * total_hours_in_month;
            System.out.println(total_wage);
            switch (part_time) {
                case employeWage_full_day:
                    wage = employeWage_per_hour * employeWage_full_day;
                    System.out.println(wage);
                    break;
                case employeWage_PART_TIME_HOURS:
                    wage = employeWage_per_hour * employeWage_PART_TIME_HOURS;
                    System.out.println(wage);
                    break;
                default:
                    System.out.println("Error: Invalid number of hours worked");
            }
        } else
            System.out.println("Employee is absent");
    }
}
