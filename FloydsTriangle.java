import java.util.Scanner;

public class FloydsTriangle {

    public static void main(String[] args) {
        // Create a scanner to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the number of rows (n)
        System.out.print("Enter the number of rows for Floyd's Triangle: ");
        int n = scanner.nextInt();

        int number = 1; // Start with the first number in the triangle

        // Loop to print each row
        for (int i = 1; i <= n; i++) {
            // Loop to print numbers in the current row
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");  // Print the current number followed by a space
                number++;  // Increment the number for the next print
            }

            // Move to the next line after printing a row
            System.out.println();
        }

        // Close the scanner
        scanner.close();
    }
}
