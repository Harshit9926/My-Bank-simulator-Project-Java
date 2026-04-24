package com.bank;

import java.util.ArrayList;
import java.util.List;

public abstract class BankAccount {
    protected double balance;
    private String pin;
    protected List<String> history = new ArrayList<>();

    public BankAccount(String pin, double startingBalance) {
        this.pin = pin;
        this.balance = startingBalance;
        this.history.add("Account opened with $" + startingBalance);
    }

    public boolean checkPin(String inputPin) {
        return this.pin.equals(inputPin);
    }

    public void deposit(double amount) {
        balance += amount;
        history.add("Deposited: $" + amount);
    }

    // Every account handles withdrawals differently
    public abstract void withdraw(double amount);

    public void printHistory() {
        System.out.println("--- Transaction History ---");
        for (String item : history) {
            System.out.println(item);
        }
    }
}