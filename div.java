import java.util.Scanner;

public class DivideTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter dividend (first number): ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter divisor (second number): ");
        double num2 = scanner.nextDouble();

        if (num2 == 0) {
            System.out.println("Error: Division by zero is not allowed.");
        } else {
            double quotient = num1 / num2;
            System.out.println("Quotient: " + quotient);
        }

        scanner.close();
    }
}
