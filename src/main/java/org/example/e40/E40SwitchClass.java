package org.example.e40;

import java.util.Scanner;

public class E40SwitchClass {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter name of the instructor");
        String instructorName= scanner.nextLine();
        String responsibility;

        switch (instructorName){
            case "Asghar":
                responsibility="Will take care of Java Assignment";
                break;
            case "Moazzam":
                responsibility="Will take care of SDLC Assignment";
                break;
            case "Weqas":
                responsibility="Will take care of Selenium Assignment";
                break;
            case "Asel":
                responsibility="Will take care of every Assignment";
                break;
            default:
                responsibility="Invalid instructor selected";


        }
        System.out.println(responsibility);



        // Print prompt for user to enter the name of the instructor
        // Capture the instructor name input

        // Determine the responsibility based on the instructor's name using a switch statement


        // Print the responsibility


    }
}
