import java.util.Random;

public class SubscriptionReminder {
    public static void main(String[] args) {
        Random random = new Random();

        int daysUntilExpiration = random.nextInt(12); // Random number from 0 to 11
        int discountPercentage = 0;

        System.out.println("Days until expiration: " + daysUntilExpiration);

        if (daysUntilExpiration == 0) {
            // Rule 5
            System.out.println("Your subscription has expired.");
        } 
        else if (daysUntilExpiration == 1) {
            // Rule 4
            discountPercentage = 20;
            System.out.println("Your subscription expires within a day! Renew now and save " 
                               + discountPercentage + "%!");
        } 
        else if (daysUntilExpiration <= 5) {
            // Rule 3
            discountPercentage = 10;
            System.out.println("Your subscription expires in " + daysUntilExpiration 
                               + " days. Renew now and save " + discountPercentage + "%!");
        } 
        else if (daysUntilExpiration <= 10) {
            // Rule 2
            System.out.println("Your subscription will expire soon. Renew now!");
        } 
        else {
            // Rule 6
            // Display nothing
        }
    }
}
