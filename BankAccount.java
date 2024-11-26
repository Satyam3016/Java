class BankAccount {
    private String accountHolderName;
    private double balance;

    public BankAccount(String name, double initialBalance) {
        this.accountHolderName = name;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) balance += amount;
        System.out.println("Deposit successful. New balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Alok Kumar Sharma", 1000);
        account.deposit(500);
        account.withdraw(300);
        account.withdraw(1500);
    }
}
