package com.bank;
import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // 1. Create the account (PIN is "1234", Start balance is 500)
        SavingsAccount myAccount = new SavingsAccount("1234", 500.0);

        System.out.println("Welcome to the Bank Simulator!");
        System.out.print("Enter your PIN: ");
        String enteredPin = input.nextLine();

        if (myAccount.checkPin(enteredPin)) {
            System.out.println("✅ Login Successful!");
            System.out.println("Your Balance is: $" + myAccount.balance);
            
            // Let's try to deposit
            myAccount.deposit(200);
            System.out.println("Deposited $200. New balance: $" + myAccount.balance);
            
            // See the history
            myAccount.printHistory();
        } else {
            System.out.println("❌ Wrong PIN. Access Denied.");
        }
        
        input.close();
    }
}