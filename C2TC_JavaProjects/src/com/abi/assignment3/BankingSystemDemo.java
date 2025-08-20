package com.abi.assignment3;

//Main class
public class BankingSystemDemo {
 public static void main(String[] args) {
     // Create accounts
     Bank bank1 = new Bank();
     Account savings = new SavingsAccount("S001", 1000);
     Bank bank2 = new Bank();
     Account checking = new CheckingAccount("C001", 500);

     // Display total accounts using static method
     System.out.println("Total Bank Accounts Created: " + Bank.getTotalAccounts());

     // Perform transactions
     Transaction transaction = new Transaction();
     savings.displayAccountInfo();
     transaction.performTransaction(savings, 200, "deposit");

     checking.displayAccountInfo();
     transaction.performTransaction(checking, 300, "withdraw");

     // Final balances
     System.out.println("\nFinal Balances:");
     savings.displayAccountInfo();
     checking.displayAccountInfo();
 }
}