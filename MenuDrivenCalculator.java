import java.util.Scanner;

public class MenuDrivenCalculator {

    public static void main(String[] args) {
        // Create a scanner to read user input
        Scanner scanner = new Scanner(System.in);

        // Variable to store the user's choice for the operation
        int choice;

        do {
            // Display the menu options
            System.out.println("\nMenu-driven Calculator");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            // Perform the operation based on user choice
            if (choice == 1) {
                // Addition
                System.out.print("Enter two numbers: ");
                double num1 = scanner.nextDouble();
                double num2 = scanner.nextDouble();
                double result = num1 + num2;
                System.out.println("Result: " + result);
            } else if (choice == 2) {
                // Subtraction
                System.out.print("Enter two numbers: ");
                double num1 = scanner.nextDouble();
                double num2 = scanner.nextDouble();
                double result = num1 - num2;
                System.out.println("Result: " + result);
            } else if (choice == 3) {
                // Multiplication
                System.out.print("Enter two numbers: ");
                double num1 = scanner.nextDouble();
                double num2 = scanner.nextDouble();
                double result = num1 * num2;
                System.out.println("Result: " + result);
            } else if (choice == 4) {
                // Division
                System.out.print("Enter two numbers: ");
                double num1 = scanner.nextDouble();
                double num2 = scanner.nextDouble();
                if (num2 != 0) {
                    double result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
            } else if (choice == 5) {
                // Exit the program
                System.out.println("Exiting the program...");
            } else {
                // Invalid choice
                System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 5);  // Continue until the user chooses to exit

        // Close the scanner
        scanner.close();
    }
}
