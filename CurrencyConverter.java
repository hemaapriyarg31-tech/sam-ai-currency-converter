import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Currency Converter ===");
        System.out.println("1. INR to USD");
        System.out.println("2. INR to EUR");
        System.out.print("Choose option: ");

        int choice = sc.nextInt();

        System.out.print("Enter amount in INR: ");
        double inr = sc.nextDouble();

        double usdRate = 0.012;  // example rate
        double eurRate = 0.011;  // example rate

        double result = 0;

        if (choice == 1) {
            result = inr * usdRate;
            System.out.println("USD: " + result);
        }
        else if (choice == 2) {
            result = inr * eurRate;
            System.out.println("EUR: " + result);
        }
        else {
            System.out.println("Invalid option!");
        }

        sc.close();
    }
}