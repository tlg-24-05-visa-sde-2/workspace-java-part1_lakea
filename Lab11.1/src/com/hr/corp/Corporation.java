/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.corp;

import gov.irs.TaxPayer;

/**
 * Corporate entity - also pays taxes.
 */
public class Corporation implements TaxPayer {
    public static final double STANDARD_DEDUCTION = 2_000_000_000.0;

    private String name;

    public Corporation(String name) {
        setName(name);
    }

    @Override  // interface TaxPayer
    public void payTaxes() {
        System.out.println(getName() + " paid no taxes - we lobbied hard and it worked");
    }

    //I opt in to provide custom implementation of this contract method
    @Override       // Interface taxpayer (default method)
    public void fileReturn() {
        System.out.println(getName() + " filed no return, we sent our lawyers instead");
    }

    // I opt in to provide my own implementation the contract method
    @Override  // interface TaxPayer (default method)
    public double getStandardDeduction() {
        return STANDARD_DEDUCTION;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}