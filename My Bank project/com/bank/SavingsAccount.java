package com.bank;

public class SavingsAccount extends BankAccount {
    
    public SavingsAccount(String pin, double startingBalance) {
        super(pin, startingBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            history.add("Withdrew: $" + amount);
        } else {
            System.out.println("❌ Error: Not enough money!");
        }
    }
}