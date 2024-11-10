import java.util.Scanner;

public class CharacterCount {

    // Method to count occurrences of a character in a string
    public static int countCharacterOccurrences(String str, char ch) {
        int count = 0;

        // Loop through each character of the string
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;  // Increment count if character matches
            }
        }

        return count;
    }

    public static void main(String[] args) {
        // Create a scanner to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Prompt the user to enter the character to search for
        System.out.print("Enter the character to search for: ");
        char searchChar = scanner.next().charAt(0);

        // Call the method to count occurrences of the character
        int count = countCharacterOccurrences(inputString, searchChar);

        // Display the count to the user
        System.out.println("The character '" + searchChar + "' appears " + count + " times in the string.");

        // Close the scanner
        scanner.close();
    }
}
