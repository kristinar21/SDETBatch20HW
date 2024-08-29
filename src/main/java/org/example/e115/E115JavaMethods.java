package org.example.e115;

public class E115JavaMethods {
    public static void main(String[] args) {
        // Call the convertToUpper method and print the result
        covertToUpper("test");
        System.out.println(covertToUpper("test"));

    }public static String covertToUpper(String input){
        String upperCaseString=input.toUpperCase();
        return upperCaseString;


    }

    // Create method convertToUpper with a string parameter
    // Inside the method, convert the string to uppercase using toUpperCase method
    // Return the new uppercase string
}
