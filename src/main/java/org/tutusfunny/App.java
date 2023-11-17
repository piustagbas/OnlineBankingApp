package org.tutusfunny;

import java.util.Scanner;


public class App 
{
    public static void main(String[] args) {
        OnlineBank bank = new OnlineBank();
        Scanner scanner = new Scanner(System.in);

        // Create accounts
        bank.createAccount("123456");
        bank.createAccount("789012");

        BankAccount account1 = bank.getAccount("123456");
        BankAccount account2 = bank.getAccount("789012");


        System.out.print("Enter deposit amount for Account 1: $");
        double depositAmount1 = scanner.nextDouble();
        account1.deposit(depositAmount1);


        System.out.print("Enter withdrawal amount for Account 1: $");
        double withdrawalAmount = scanner.nextDouble();
        account1.withdraw(withdrawalAmount);

        System.out.print("Enter transfer amount from Account 1 to Account 2: $");
        double transferAmount = scanner.nextDouble();
        account1.transfer(account2, transferAmount);

        System.out.println("Account 1 Transactions: " + account1.getTransactionHistory());
        System.out.println("Account 1 Balance: $" + account1.getBalance());


        System.out.print("Enter deposit amount for Account 2: $");
        double depositAmount2 = scanner.nextDouble();
        account2.deposit(depositAmount2);



        System.out.println("Account 2 Transactions: " + account2.getTransactionHistory());

        System.out.println("Account 2 Balance: $" + account2.getBalance());

        scanner.close();
    }
}
