package org.example.e41;

import java.util.Scanner;

public class E41SwitchClass {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the time of day (morning, afternoon, evening, night)");
        String timeOfDay= scanner.nextLine();
        switch (timeOfDay){
            case "morning":
                System.out.println("Recommended meal: Breakfast");
                break;
            case "afternoon":
                System.out.println("Recommended meal: Lunch");
                break;
            case "evening":
                System.out.println("Recommended meal: Dinner");
                break;
            case"night":
                System.out.println("Recommended meal: Snack");
                break;
            default:
                System.out.println("Invalid time of day entered");
        }
        scanner.close();


        // Print prompt for user to enter the time of day
        // Capture the time of day input

        // Recommend meal using switch statement

        //    Print "Invalid time of day entered"




    }
}