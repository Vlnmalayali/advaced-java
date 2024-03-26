import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter rate of interest (in percentage): ");
        double rate = scanner.nextDouble();

        System.out.print("Enter time period (in years): ");
        double time = scanner.nextDouble();

        System.out.println("\nChoose calculation method:");
        System.out.println("1. Simple Interest");
        System.out.println("2. Compound Interest");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                double simpleInterest = calculateSimpleInterest(principal, rate, time);
                System.out.println("Simple Interest: " + simpleInterest);
                break;
            case 2:
                double compoundInterest = calculateCompoundInterest(principal, rate, time);
                System.out.println("Compound Interest: " + compoundInterest);
                break;
            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }

    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static double calculateCompoundInterest(double principal, double rate, double time) {
        double amount = principal * Math.pow(1 + (rate / 100), time);
        return amount - principal;
    }
}
