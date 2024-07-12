/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel.client;

import com.hr.personnel.Department;
import com.hr.personnel.Employee;
import com.hr.personnel.HourlyEmployee;
import com.hr.personnel.SalariedEmployee;
import gov.irs.IllegalWageException;
import java.time.LocalDate;

/**
 * Application main-class.
 */
class HRClient {

    public static void main(String[] args) {
        // create Department object
        Department dept = new Department("Sales", "Seattle");
        System.out.println(dept);

        // add Employees to it
        dept.addEmployee(new SalariedEmployee("Julie", LocalDate.of(2000, 2, 2), 2000.0));
        dept.addEmployee(new SalariedEmployee("Miink", LocalDate.of(1997, 2, 17), 3500.0));

        try {
            dept.addEmployee(new HourlyEmployee("Jason", LocalDate.of(1990, 8, 24), 23.0, 30.0));
        }
        catch (IllegalWageException e) {
            System.out.println(e);  // toString() automatically called
        }

        try {
            dept.addEmployee(new HourlyEmployee("Nova", LocalDate.of(1997, 1, 28), 50.0, 40));
        }
        catch (IllegalWageException e) {
            System.out.println(e);
        }

        // list its Employees
        System.out.println("\nList employees:");
        dept.listEmployees();

        // make its Employees work
        System.out.println("\nMake employees work:");
        dept.workEmployees();

        // pay its Employees
        System.out.println("\nPay all employees:");
        dept.payEmployees();
    }
}