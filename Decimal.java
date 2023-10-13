import java.util.Scanner;

public class DecimalDivisionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the numerator: ");
        double numerator = scanner.nextDouble();

        System.out.print("Enter the denominator: ");
        double denominator = scanner.nextDouble();

         try {
            if (denominator == 0) {
                System.out.println("Division by zero is not allowed.");
            } else {
                double result = numerator / denominator;
                System.out.println("Result: " + result);
            }
        } catch (ArithmeticException e) {
            System.out.println("An error occurred during division.");
        }

        scanner.close();
    }
}
