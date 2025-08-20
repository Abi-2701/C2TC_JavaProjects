package com.abi.assignment3;

class SavingsAccount extends Account {
    private double interestRate = 0.03; // 3% interest

    public SavingsAccount(String accountNumber, double initialBalance) {
        super(accountNumber, initialBalance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount + (amount * interestRate);
        System.out.println("Deposited with interest in SavingsAccount. New Balance: " + balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn from SavingsAccount. New Balance: " + balance);
        } else {
            System.out.println("Insufficient funds in SavingsAccount!");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}