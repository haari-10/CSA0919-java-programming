class Account {
    private double balance;

    public Account() {
        balance = 0;
    }

    public Account(double initialBalance) {
        balance = initialBalance;
    }

    public void add(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            balance -= 5;
        } else {
            balance -= amount;
        }
    }

    public double inquire() {
        return balance;
    }

    public void addInterest(double rate) {
        balance += balance * rate / 100;
    }
}

public class Main {
    public static void main(String[] args) {
        Account acc = new Account(1000);
        acc.add(500);
        acc.withdraw(2000);
        acc.addInterest(10);
        System.out.println(acc.inquire());
    }
}