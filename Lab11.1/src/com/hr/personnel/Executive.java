package com.hr.personnel;

import java.time.LocalDate;

public class Executive extends SalariedEmployee {

    // constructors

    public Executive() {
        super();
    }

    public Executive(String name, LocalDate hireDate) {
        super(name, hireDate);
    }

    public Executive(String name, LocalDate hireDate, double salary) {
        super(name, hireDate, salary);
    }


    // opt-in to provide my own way of filing instead of doing it the default way by US Mail
    @Override // interface TaxPayer (default method)
    public void fileReturn() {
        System.out.println("Return filed electronically");
    }

    // I opt in to provide my own way to file taxes instead of using the default method
    @Override // interface TaxPayer (default method)
    public double getStandardDeduction () {
        return 0.2 * getSalary();
    }

    //business methods
    @Override
    public void work() {
        System.out.println(getName() + " is enjoying a nice weekend in Italy at Milan Fashion Week");
    }
}