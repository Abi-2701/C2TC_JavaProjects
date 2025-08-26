package com.abi.userdefinedexception_assignment;

public class BankingSystemDemo 
{
    public static void main(String[] args) 
    {
        BankAccount account = new BankAccount(101, 5000);

        try 
        {
            account.displayBalance();
            
            // Deposit operation
            account.deposit(2000);
            account.displayBalance();
            
            // Invalid deposit
            account.deposit(-100);

        } 
        catch (InvalidAmountException e) 
        {
            System.out.println("Error: " + e.getMessage());
        } 
        catch (Exception e) {
            System.out.println("Unexpected Error: " + e.getMessage());
        } 
        finally
        {
            System.out.println("Deposit operation completed.\n");
        }

        try 
        {
            // Withdraw operation
            account.withdraw(3000);
            account.displayBalance();

            // Invalid withdrawal
            account.withdraw(-500);

        } 
        catch (InvalidAmountException | InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally
        {
            System.out.println("Withdrawal operation completed.");
        }
    }
}