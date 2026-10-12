// Q7. Bank Account: private balance changed only via validated deposit()
class BankAccount {
    private double balance;

    BankAccount(double openingBalance) {
        this.balance = openingBalance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount: " + amount);
        }
    }

    void showBalance() {
        System.out.println("Current balance: " + balance);
    }
}

public class Q07_BankAccount {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount(1000);
        acc.deposit(500);
        acc.deposit(-200);
        acc.showBalance();
    }
}
