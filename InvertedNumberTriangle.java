import java.util.Scanner;

public class InvertedNumberTriangle {

    public static void main(String[] args) {
        // Create a scanner to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the number of rows (n)
        System.out.print("Enter the number of rows for the inverted triangle: ");
        int n = scanner.nextInt();

        // Loop to print each row
        for (int i = n; i >= 1; i--) {
            // Print numbers in reverse order for each row
            for (int j = i; j >= 1; j--) {
                System.out.print(j);  // Print numbers from i down to 1
            }

            // Move to the next line after each row
            System.out.println();
        }

        // Close the scanner
        scanner.close();
    }
}
