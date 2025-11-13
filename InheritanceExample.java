class BankAccount {
    double balance;

    void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited. New balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    void addInterest() {
        double interest = balance * 0.05;
        balance += interest;
        System.out.println("Interest added: " + interest);
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount();
        account.deposit(1000);
        account.addInterest();
    }
}
