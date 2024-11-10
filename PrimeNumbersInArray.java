import java.util.Scanner;

public class PrimeNumbersInArray {

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        // Handle edge cases
        if (num <= 1) {
            return false;
        }
        // Check divisibility from 2 to sqrt(num)
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;  // num is divisible by i, so it's not prime
            }
        }
        return true;  // num is prime if no divisors were found
    }

    public static void main(String[] args) {
        // Create an array to store 10 integers
        int[] numbers = new int[10];

        // Scanner to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Accept 10 integers from the user
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Print the prime numbers in the array
        System.out.println("\nPrime numbers in the array are:");
        for (int num : numbers) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }

        // Close the scanner
        scanner.close();
    }
}
