import java.util.Scanner;

public class FibonacciSequence {

    // Method to generate the first n terms of the Fibonacci sequence
    public static int[] generateFibonacci(int n) {
        // Initialize an array to hold the Fibonacci sequence
        int[] fibonacci = new int[n];

        // Handle the first two terms
        if (n > 0) fibonacci[0] = 0;  // First term is 0
        if (n > 1) fibonacci[1] = 1;  // Second term is 1

        // Generate the rest of the Fibonacci sequence
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];  // sum of previous two terms
        }

        return fibonacci;
    }

    public static void main(String[] args) {
        // Create a scanner to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of terms
        System.out.print("Enter the number of terms in the Fibonacci sequence: ");
        int n = scanner.nextInt();

        // Validate the input to ensure n is a positive integer
        if (n <= 0) {
            System.out.println("Please enter a positive integer greater than 0.");
        } else {
            // Generate the Fibonacci sequence
            int[] fibonacciSequence = generateFibonacci(n);

            // Print the Fibonacci sequence
            System.out.print("The first " + n + " terms of the Fibonacci sequence are: ");
            for (int i = 0; i < fibonacciSequence.length; i++) {
                System.out.print(fibonacciSequence[i] + " ");
            }
        }

        // Close the scanner
        scanner.close();
    }
}

