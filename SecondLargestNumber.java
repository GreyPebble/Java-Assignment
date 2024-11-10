import java.util.Scanner;

public class SecondLargestNumber {

    // Method to find the second largest number in the array
    public static int findSecondLargest(int[] numbers) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Iterate through the array to find the largest and second largest numbers
        for (int num : numbers) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        // Create a scanner to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the number of integers
        System.out.print("Enter the number of integers: ");
        int n = scanner.nextInt();

        // Validate input to ensure n is greater than 1, as we need at least two numbers to find the second largest
        if (n <= 1) {
            System.out.println("Please enter a number greater than 1.");
            return;
        }

        // Create an array to store the n integers
        int[] numbers = new int[n];

        // Accept the integers from the user
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Find the second largest number in the array
        int secondLargest = findSecondLargest(numbers);

        // Check if we have a valid second largest number
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest number (all numbers might be the same).");
        } else {
            System.out.println("The second largest number is: " + secondLargest);
        }

        // Close the scanner
        scanner.close();
    }
}

