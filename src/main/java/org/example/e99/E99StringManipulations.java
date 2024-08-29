package org.example.e99;

import java.util.Scanner;

public class E99StringManipulations {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string:");
        String input = scanner.nextLine();
        String cleanedInput = input.replaceAll(" ", "").toLowerCase();
        String reversed = new StringBuilder(cleanedInput).reverse().toString();
        boolean isPalindrome = cleanedInput.equals(reversed);
        System.out.println(isPalindrome);
        scanner.close();
        // Prompt the user to input a string


        // Read the input string


        // Remove all spaces and convert the string to lowercase

        // Check if the string is a palindrome

        // Print "true" if the string is a palindrome, and "false" otherwise


        // Step 2: Create a Scanner object to read input from the console


    }
}
