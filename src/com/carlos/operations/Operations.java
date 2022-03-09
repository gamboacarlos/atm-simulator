package com.carlos.operations;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Operations {
    Scanner input = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
    int customerNumber;
    int pinNumber;
    private double checkingBalance;
    private double savingBalance;

    public Operations(int customerNumber,
                           int pinNumber) {
        this.customerNumber = customerNumber;
        this.pinNumber = pinNumber;
    }

    // Calculate checking account withdraw
    public double calcCheckingWithdrawal(double amount) {
        checkingBalance = (checkingBalance - amount);
        return checkingBalance;
    }

    // Calculate saving account withdraw
    public double calcSavingWithdrawal(double amount) {
        savingBalance = (savingBalance - amount);
        return savingBalance;
    }

    // Calculate checking account deposit
    public double calcCheckingDeposit(double amount) {
        checkingBalance = (checkingBalance + amount);
        return checkingBalance;
    }

    // Calculate saving account deposit
    public double calcSavingDeposit(double amount) {
        savingBalance = (savingBalance + amount);
        return savingBalance;
    }

    // Customer checking account withdrawal input
    public void getCheckingWithdrawalInput() {
        System.out.println("Checking account balance" + moneyFormat.format(checkingBalance));
        System.out.println("Amount you want to withdraw from checking account");
        double amount = input.nextInt();
        if ((checkingBalance - amount) >= 0) {
            calcCheckingWithdrawal(amount);
            System.out.println("New checking account balance" + moneyFormat.format(checkingBalance));
        } else {
            System.out.println("Insufficient balance" + "\n");

        }
    }

    // Customer saving account withdrawal input
    public void getSavingWithdrawalInput() {
        System.out.println("Checking account balance" + moneyFormat.format(savingBalance));
        System.out.println("Amount you want to withdraw from saving account");
        double amount = input.nextInt();
        if ((savingBalance - amount) >= 0) {
            calcSavingWithdrawal(amount);
            System.out.println("New saving account balance" + moneyFormat.format(savingBalance));
        } else {
            System.out.println("Insufficient balance" + "\n");

        }
    }

    // Customer checking account deposit input
    public void getCheckingDepositInput() {
        System.out.println("Checking account balance" + moneyFormat.format(checkingBalance));
        System.out.println("Amount you want to deposit to your checking account");
        double amount = input.nextInt();
        if ((checkingBalance - amount) >= 0) {
            calcCheckingWithdrawal(amount);
            System.out.println("New checking account balance" + moneyFormat.format(checkingBalance));
        } else {
            System.out.println("Insufficient balance" + "\n");

        }
    }

    // Customer saving account deposit input
    public void getSavingDepositInput() {
        System.out.println("Checking account balance" + moneyFormat.format(savingBalance));
        System.out.println("Amount you want to deposit to your saving account");
        double amount = input.nextInt();
        if ((savingBalance - amount) >= 0) {
            calcSavingWithdrawal(amount);
            System.out.println("New saving account balance" + moneyFormat.format(savingBalance));
        } else {
            System.out.println("Insufficient balance" + "\n");
        }
    }

}
