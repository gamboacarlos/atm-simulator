package com.carlos.account;


public class Account {
    private int customerNumber;
    private int pinNumber;
    private double checkingBalance = 55.87;
    private double savingBalance = 22.54;

    // Set the customer number
    public int setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
        return customerNumber;
    }

    // Set the customer number
    public int setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
        return pinNumber;
    }

    // Get customer number
    public int getCustomerNumber() {
        return customerNumber;
    }

    // Get pin number
    public int getPinNumber() {
        return pinNumber;
    }


    public double getSavingBalance() {
        return savingBalance;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }
}
