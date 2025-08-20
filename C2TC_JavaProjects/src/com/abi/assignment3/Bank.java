package com.abi.assignment3;

class Bank {
    private static int totalAccounts = 0;  // static variable

    public Bank() {
        totalAccounts++;   // increase whenever a new bank account is created
    }

    public static int getTotalAccounts() { // static method
        return totalAccounts;
    }
}