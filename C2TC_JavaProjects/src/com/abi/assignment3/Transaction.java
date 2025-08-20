package com.abi.assignment3;

final class Transaction {
    private final double transactionFee = 10.0; // final variable

    public final void performTransaction(Account account, double amount, String type) {
        System.out.println("\nTransaction started...");
        if (type.equalsIgnoreCase("deposit")) {
            account.deposit(amount);
            account.withdraw(transactionFee); // Deduct fee
        } else if (type.equalsIgnoreCase("withdraw")) {
            account.withdraw(amount + transactionFee); // Withdraw + fee
        } else {
            System.out.println("Invalid transaction type!");
        }
        System.out.println("Transaction completed with fee: " + transactionFee);
    }
}