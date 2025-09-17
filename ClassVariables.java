public class ClassVariables {
    void showInterest() {
        double amount;
        double interest; // percentage

        amount = 1200.00;
        System.out.println("Amount: " + amount);

        interest = 3.0;
        amount = amount * (100 + interest) / 100;
        System.out.println("After a Year: " + amount);

        amount = amount * (100 + interest) / 100;
        System.out.println("After two Years: " + amount);
    }

    public static void main(String[] args) {
        new ClassVariables().showInterest();
    }
}
