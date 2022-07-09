package com.BridgeLabz.EmployeeWage;

public class EmployeeWage {
    static final int IS_FULL_TIME= 1;
    static final int IS_PART_TIME= 2;
    static final int TOTAL_WORKING_HOURS=100;
    static final int TOTAL_WORKING_DAYS=20;


    static int EMPLOYEE_PRESENT=1;
    static final int WAGE_PER_HOUR=20;
    static final int FULL_DAY_HOUR=16;
    static final int PART_TIME_HOUR=8;

    public static void main(String args[]) {
        System.out.println("Welcome to Employee Wge Program");
        int dailyWage = 0;
        int day = 0;
        while (day <= TOTAL_WORKING_DAYS) {
            int empRandom = (int) Math.floor(Math.random() * 10) % 3;
            switch (empRandom) {
                case IS_FULL_TIME:
                    System.out.println("Employee is present Full time");
                    EMPLOYEE_PRESENT = 20;
                    dailyWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
                    break;
                case IS_PART_TIME:
                    System.out.println("Employee is present Part time");
                    EMPLOYEE_PRESENT = 20;
                    dailyWage = WAGE_PER_HOUR * PART_TIME_HOUR;
                    break;
                default:
                    System.out.println("Employee is absent");
            }
            System.out.println("Daily Wage for #"+day + "=>" + dailyWage);
            //System.out.println("UC5 done");
            day++;
        }
    }
}
