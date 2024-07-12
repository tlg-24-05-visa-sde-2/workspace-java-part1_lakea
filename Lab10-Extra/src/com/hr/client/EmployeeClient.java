package com.hr.client;

import com.hr.Employee;
import com.hr.WorkException;
import com.transportation.DestinationUnreachableException;

public class EmployeeClient {

    public static void main(String[] args) {
        // TODO: create an instance of Employee
        Employee e = new Employee("Lakea");

        // TODO: call goToWork() on the Employee object
        try {
            e.goToWork();
        } catch (WorkException err) {
//            System.out.println(err); // toString() automatically called
//            System.out.println(err.getMessage()); // extract the "reason string"
//            System.out.println(err.getCause()); // extract the nested "cause"
            err.printStackTrace();
        }

    }
}