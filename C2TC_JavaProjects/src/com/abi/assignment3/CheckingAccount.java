package com.abi.assignment3;

class CheckingAccount extends Account {
    private double overdraftLimit = 500.0;

    public CheckingAccount(String accountNumber, double initialBalance) {
        super(accountNumber, initialBalance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited in CheckingAccount. New Balance: " + balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
            System.out.println("Withdrawn from CheckingAccount. New Balance: " + balance);
        } else {
            System.out.println("Overdraft limit exceeded in CheckingAccount!");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}