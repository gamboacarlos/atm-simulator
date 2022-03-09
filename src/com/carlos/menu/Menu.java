package com.carlos.menu;

import com.carlos.account.Account;
import com.carlos.operations.Operations;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Menu {
    Scanner menuInput = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
    HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();
    Account userAccount = new Account();
    Operations transaction = new Operations(userAccount.getCustomerNumber(), userAccount.getPinNumber());

    // Display menu login
    public void getLogin() throws IOException {
        int x = 1;
        do {
            try {
                data.put(123456, 123);
                System.out.println("Welcome the ATM project");
                System.out.println("Enter your customer number");
                userAccount.setCustomerNumber(menuInput.nextInt());
                System.out.println("Enter your pin number");
                userAccount.setPinNumber(menuInput.nextInt());
            } catch (Exception e) {
                System.out.println("Invalid character, enter only Numbers" + "\n");
                x = 2;
            }
            for (Entry<Integer, Integer> entry : data.entrySet()) {
                if (entry.getKey() == userAccount.getCustomerNumber() && entry.getValue() == userAccount.getPinNumber()) {
                    getAccountType();
                }
            }
            System.out.println("Wrong customer number or id" + "\n");
        } while (x == 1);
    }

    int selection;

    // Display account type menu
    public void getAccountType() {
        System.out.println("Select the account you want to acces");
        System.out.println("Type 1: Checking Account");
        System.out.println("Type 2: Saving Account");
        System.out.println("Type 3: Exit");
        System.out.println("Choice :");
        selection = menuInput.nextInt();
        switch (selection) {
            case 1:
                getChecking();
                break;
            case 2:
                getSaving();
                break;
            case 3:
                System.out.println("Thank you for using this ATM, Bye");
                ;
                break;
            default:
                System.out.println("Invalid choice" + "\n");
                getAccountType();
        }

    }

    // Display checking account menu with selection
    public void getChecking() {
        System.out.println("Checking account");
        System.out.println("Type 1: View balance");
        System.out.println("Type 2: Withdraw funds");
        System.out.println("Type 3: Deposit founds");
        System.out.println("Type 4: Exit");
        System.out.println("Choice :" + "\n");
        selection = menuInput.nextInt();
        switch (selection) {
            case 1:
                System.out.println("Checking account balance" + moneyFormat.format(userAccount.getCheckingBalance()));
                getAccountType();
                break;
            case 2:
                transaction.getCheckingWithdrawalInput();
                getAccountType();
                break;
            case 3:
                transaction.getCheckingDepositInput();
                getAccountType();
                break;
            default:
                System.out.println("\n" + "Invalid choice" + "\n");
                getChecking();
        }
    }

    // Display Saving account menu with selection
    public void getSaving() {
        System.out.println("Saving account");
        System.out.println("Type 1: View balance");
        System.out.println("Type 2: Withdraw funds");
        System.out.println("Type 3: Deposit founds");
        System.out.println("Type 4: Exit");
        System.out.println("Choice :" + "\n");
        selection = menuInput.nextInt();
        switch (selection) {
            case 1:
                System.out.println("Saving account balance" + moneyFormat.format(userAccount.getSavingBalance()));
                getAccountType();
                break;
            case 2:
                transaction.getSavingWithdrawalInput();
                getAccountType();
                break;
            case 3:
                transaction.getSavingDepositInput();
                getAccountType();
                break;
            default:
                System.out.println("\n" + "Invalid choice" + "\n");
                getSaving();
        }
    }
}
