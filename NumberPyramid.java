import java.util.Scanner;

public class NumberPyramid {

    public static void main(String[] args) {
        // Create a scanner to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the number of rows (n)
        System.out.print("Enter the number of rows for the pyramid: ");
        int n = scanner.nextInt();

        // Loop to print each row
        for (int i = 1; i <= n; i++) {
            // Print numbers for the current row
            for (int j = 1; j <= i; j++) {
                System.out.print(j);  // Print numbers starting from 1 up to i
            }

            // Move to the next line after each row
            System.out.println();
        }

        // Close the scanner
        scanner.close();
    }
}
