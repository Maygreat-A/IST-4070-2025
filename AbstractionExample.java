abstract class BankService {
    abstract void openAccount();
    abstract void closeAccount();

    void welcomeMessage() {
        System.out.println("Welcome to ABC Bank!");
    }
}

class SavingsService extends BankService {
    void openAccount() {
        System.out.println("Savings Account opened successfully.");
    }

    void closeAccount() {
        System.out.println("Savings Account closed.");
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        BankService service = new SavingsService();
        service.welcomeMessage();
        service.openAccount();
        service.closeAccount();
    }
}
