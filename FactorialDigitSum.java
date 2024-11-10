
import java.util.Scanner;

public class FactorialDigitSum {

    // Method to calculate the factorial of a number
    public static long factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Method to calculate the sum of digits of a number
    public static int sumOfDigits(long number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;  // Extract the last digit
            number /= 10;         // Remove the last digit
        }
        return sum;
    }

    public static void main(String[] args) {
        // Scanner to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Take the number input from the user
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Calculate the factorial of the number
        long factorialResult = factorial(num);

        // Calculate the sum of the digits of the factorial
        int digitSum = sumOfDigits(factorialResult);

        // Print the results
        System.out.println("Factorial of " + num + " is: " + factorialResult);
        System.out.println("Sum of digits of the factorial: " + digitSum);

        // Close the scanner
        scanner.close();
    }
}
