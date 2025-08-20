package com.abi.assignment3;

//2. Abstract Example
abstract class Account {
 protected String accountNumber;
 protected double balance;

 public Account(String accountNumber, double initialBalance) {
     this.accountNumber = accountNumber;
     this.balance = initialBalance;
 }

 // abstract methods
 public abstract void deposit(double amount);
 public abstract void withdraw(double amount);
 public abstract double getBalance();

 // concrete method
 public void displayAccountInfo() {
     System.out.println("Account Number: " + accountNumber);
     System.out.println("Balance: " + balance);
 }
}