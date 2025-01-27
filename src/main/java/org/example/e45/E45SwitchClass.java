package org.example.e45;

import java.util.Scanner;

public class E45SwitchClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Capture Coffee Order Input
        System.out.println("Enter the type of coffee (1 for Espresso, 2 for Latte, 3 for Cappuccino, 4 for Mocha)");
        int coffeeType = scanner.nextInt();


        double coffeePrice;
        switch (coffeeType) {
            case 1:
                coffeePrice = 3.00;
                break;
            case 2:
                coffeePrice = 4.00;
                break;
            case 3:
                coffeePrice = 4.50;
                break;
            case 4:
                coffeePrice = 5.00;
                break;
            default:
                System.out.println("Invalid coffee type entered");

                return;
        }


        System.out.println("The price of your coffee is $" + coffeePrice);


    }
}
