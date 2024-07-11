package Oops;

class BankAccount {
    private final int accountNumber;
    private final String accountHolder;
    private int balance;

    public BankAccount(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0;
    }

    public void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    public void withdraw(int amount) {
        balance -= amount;
        System.out.println("Withdrawn: $" + amount);
    }

    public void getAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
    }
}

public class BankBasic {
    public static void main(String[] args) {

        BankAccount bank = new BankAccount(12345, "John Doe");

        bank.deposit(1000);
        bank.withdraw(500);
        bank.deposit(200);
        bank.getAccountInfo();

    }
}
