class BankAccount {
    private String owner;
    private double balance;

    public BankAccount(String owner, double startingBalance) {
        this.owner = owner;
        this.balance = Math.max(0, startingBalance);
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public boolean withdraw(double amount) {
        if (amount <= 0 || amount > balance) {
            return false;
        }

        balance -= amount;
        return true;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Alex", 100.00);

        account.deposit(50.00);
        boolean withdrawn = account.withdraw(30.00);

        System.out.println("Owner: " + account.getOwner());
        System.out.printf("Withdrawal successful: %b%n", withdrawn);
        System.out.printf("Balance: $%.2f%n", account.getBalance());
    }
}
