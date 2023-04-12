package com.bl.empwage;

public class EmpMainClass {
    public static void main(String[] args) {
        System.out.println("Welcome to employee wage project");
        final int employeWage_per_hour = 20;
        final int employeWage_full_day = 8;
        final int employeWage_part_time_hours = 4;
        final int working_days_per_month = 20;
        final int max_working_hour_in_month = 100;
        int total_working_hours = 0;
        int total_working_days = 0;
        int total_wage = 0;
        int attendance = (int) (Math.random() * 10) % 2;
        switch (attendance) {
            case 0:
                System.out.println("Employee is Absent");
                break;
            case 1:
                System.out.println("Employee is Present");
                while (total_working_hours < max_working_hour_in_month && total_working_days < working_days_per_month) {
                    int empType = (int) (Math.random() * 10) % 2;
                    int empHours = 0;

                    switch (empType) {
                        case 0:
                            empHours = employeWage_full_day;
                            break;
                        case 1:
                            empHours = employeWage_part_time_hours;
                            break;
                        default:
                            break;
                    }
                    int dailyWage = empHours * employeWage_per_hour;
                    total_wage += dailyWage;
                    total_working_hours += empHours;
                    total_working_days++;
                    System.out.println("Day " + total_working_days + " wage: " + dailyWage);
                }
                System.out.println("Total wage for " + total_working_days + " days of work: " + total_wage);
                break;
            default:
                break;
        }
    }
}
