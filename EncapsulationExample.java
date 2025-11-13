class BankAccount {
    public  double balance; // private = hidden from outside

    // Public method to deposit money
    public void deposit(double amount) {
        balance += amount;
    }
    void calculateInterest() {
        System.out.println("General account interest");
    }

    // Public method to check balance safely
    public double getBalance() {
        return balance;
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(1000);
        System.out.println("Account Balance: " + account.getBalance());
    }
}
