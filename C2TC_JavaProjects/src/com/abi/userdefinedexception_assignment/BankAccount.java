package com.abi.userdefinedexception_assignment;

//BankAccount class representing a simple banking system
class BankAccount
{
 private int accountNumber;
 private double balance;

 // Parameterized constructor
 public BankAccount(int accountNumber, double balance) 
 {
     this.accountNumber = accountNumber;
     this.balance = balance;
 }

 // Method to deposit money into account
 public void deposit(double amount) throws InvalidAmountException {
     if (amount <= 0) {
         throw new InvalidAmountException("Deposit amount must be greater than zero.");
     }
     balance += amount;
     System.out.println("Successfully deposited: " + amount);
 }

 // Method to withdraw money from account
 public void withdraw(double amount) throws InvalidAmountException, InsufficientFundsException {
     if (amount <= 0) 
     {
         throw new InvalidAmountException("Withdrawal amount must be greater than zero.");
     }
     if (amount > balance) 
     {
         throw new InsufficientFundsException("Insufficient balance. Available: " + balance);
     }
     balance -= amount;
     System.out.println("Successfully withdrawn: " + amount);
 }

 // Method to display current balance
 public void displayBalance() 
 {
     System.out.println("Account Number: " + accountNumber + ", Current Balance: " + balance);
 }
}