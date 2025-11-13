class BankAccount {
    void calculateInterest() {
        System.out.println("General account interest");
    }
}

class SavingsAccount extends BankAccount {
    void calculateInterest() {
        System.out.println("Savings Account Interest: 5%");
    }
}

class FixedDepositAccount extends BankAccount {
    void calculateInterest() {
        System.out.println("Fixed Deposit Account Interest: 8%");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        BankAccount acc1 = new SavingsAccount();
        BankAccount acc2 = new FixedDepositAccount();

        acc1.calculateInterest(); // Works
        acc2.calculateInterest(); // Works
    }
}
