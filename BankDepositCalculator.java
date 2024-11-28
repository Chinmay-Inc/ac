import java.util.Scanner;

public class BankDepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display menu options
        System.out.println("Menu:\n1. Fixed Deposit\n2. Recurring Deposit\n3. Exit");

        // Prompt user for choice
        System.out.print("Enter your choice (1/2/3): ");
        int choice = scanner.nextInt();

        // Exit the program if the user chooses option
        if (choice == 3) {
            System.out.println("Exiting. Goodbye!");
            return;
        }

        // Prompt user for principal, rate, and time
        System.out.print("Enter Principal, Rate of Interest, and Time: ");
        double principal = scanner.nextDouble(), rate = scanner.nextDouble(), time = scanner.nextDouble();

        // Calculate maturity amount based on the user's choice
        double maturityAmount = (choice == 1)
                ? principal * Math.pow(1 + rate / 100, time)
                : principal * time + (principal * time * (time + 1) / 2) * rate / 1200;

        // Display the calculated maturity amount
        System.out.println("Maturity Amount: " + maturityAmount);

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}