package exercise;

/**
 * 
 * BankAccount
 */
import java.util.List;
import java.util.ArrayList;

public class BankAccount {
    private double balance;
    private boolean imfrozen;
    private List<Transaction> transactionHistory; // list of all transactions

    public BankAccount() { // default bank account
        this.balance = 0.0;
        this.imfrozen = false;
        this.transactionHistory = new ArrayList<>();
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isImfrozen() {
        return imfrozen;
    }

    public void setImfrozen(boolean imfrozen) {
        this.imfrozen = imfrozen;
    }

    public void deposit(double amount) { // to deposit amount to the bank account
        if (imfrozen) {
            System.out.println("Account is Frozen");
            System.out.println("Unable to Transact");
            return;
        }
        if (amount <= 0) {
            System.out.printf("Amount deposited: $%.2f %n", amount);
            System.out.println("Invalid amount. Must be greater than 0");
            return;
        }
        this.balance += amount;
        System.out.printf("Amount deposited: $%.2f %nCurrent Balance: $%.2f%n", amount, this.balance);
    }

    public void withdraw(double amount) { // to withdraw amount from the bank account
        if (imfrozen) {
            System.out.println("Account is FROZEN. Unable to Transact");
            return;
        }
        if (amount <= 0) {
            System.out.printf("Amount withdrawn: $%.2f %n", amount);
            System.out.println("Invalid amount. Must be greater than 0");
            return;
        }
        if (amount > balance) {
            System.out.printf("Amount withdrawn: $%.2f %n", amount);
            System.out.println("Insufficient Balance.");
            System.out.printf("Current Balance: $%.2f%n", this.balance);
            return;
        }
        this.balance -= amount;
        System.out.printf("Amount withdrawn: $%.2f %nCurrent Balance $%.2f%n", amount, this.balance);
    }

    public void freezeAccount() {
        this.imfrozen = true;
        System.out.println("Account has been frozen.");
    }

    public void unfreezeAccount() {
        this.imfrozen = false;
        System.out.println("Account has been unfrozen.");
    }

    public boolean isFrozen() {
        return this.imfrozen;
    }

    public List<Transaction> getTransactionHistory() { //get record of past transactions
        return this.transactionHistory;
    }
}
