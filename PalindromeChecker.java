import java.util.Scanner;

public class PalindromeChecker {

    // Method to reverse the given string
    public static String reverseString(String str) {
        String reversed = "";
        // Iterate over the string from end to start and build the reversed string
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }

    // Method to check if the given string is a palindrome
    public static boolean isPalindrome(String str) {
        // Reverse the string
        String reversedStr = reverseString(str);
        // Compare the original string with the reversed string
        return str.equals(reversedStr);
    }

    public static void main(String[] args) {
        // Create a scanner to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Accept a string input from the user
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        // Check if the string is a palindrome
        if (isPalindrome(userInput)) {
            System.out.println(userInput + " is a palindrome.");
        } else {
            System.out.println(userInput + " is not a palindrome.");
        }

        // Close the scanner
        scanner.close();
    }
}
