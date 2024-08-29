package org.example.e38;

import java.util.Scanner;

public class E38LogicalOperators {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner=new Scanner(System.in);

        System.out.println("Is it weekend? (true/false)");
        boolean isWeekend= scanner.nextBoolean();

        System.out.println("Are you available? (true/false)");
        boolean isAvailable= scanner.nextBoolean();

        String subject;
        if (isWeekend&&isAvailable){
            subject="Java";
        } else if (!isWeekend&&isAvailable) {subject="manual testing";

        }else {
            subject="no subject";

        }
        System.out.println("Today you will be learning "+subject);

        // Print prompt for user to answer if it is the weekend
        // Capture the weekend input

        // Determine the subject based on the input
        // If it is the weekend
        //    Set subject to "Java"
        // Otherwise
        //    Set subject to "manual testing"

        // Print the subject suggestion
        // Output: Today you will be learning ____


    }
}
