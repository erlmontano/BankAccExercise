package exercise;

/**
 * 
 * SaveBankAcc
 */
public class SaveBankAcc extends BankAccount {

    private String owner;

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override 
    public String toString(){
        return owner;
    }

    public SaveBankAcc(String owner) {
        this.owner = owner;
    }

    public static void main(String[] args) {
        BankAccount account = new SaveBankAcc("Test0");
        System.out.println("Account Owner:" + account.toString());

        account.deposit(1000.125);
        System.out.println("------------------");

        account.deposit(0);
        System.out.println("------------------");

        account.withdraw(-500);
        System.out.println("------------------");

        account.withdraw(500);
        System.out.println("------------------");
    
        account.withdraw(1500);
        System.out.println("------------------");

        account.withdraw(-100);
        System.out.println("------------------");

        account.freezeAccount();
        account.deposit(11500);
        System.out.println("------------------");

        account.deposit(500);
        System.out.println("------------------");

        account.unfreezeAccount();
        account.deposit(100.00);
        System.out.println("------------------");
    }
}
