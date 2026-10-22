package exercise;
/**
 * 
 * BankAccount
 */
public class BankAccount {
    private double balance;
    private boolean imfrozen;

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

    public BankAccount() {
        this.balance = 0.0;
        this.imfrozen = false;
    }

    public void deposit(double amount) {
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

    public void withdraw(double amount) {
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
            System.out.printf("Current Balance: $%.2f%n",this.balance);
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
}
