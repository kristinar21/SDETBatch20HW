package org.example.e44;

import java.util.Scanner;

public class E44SwitchClass {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter the type of meal (1 for breakfast, 2 for lunch, 3 for dinner)");
        int mealType = scanner.nextInt();


        double mealPrice;
        switch (mealType) {
            case 1:
                mealPrice = 5.00;
                break;
            case 2:
                mealPrice = 10.00;
                break;
            case 3:
                mealPrice = 15.00;
                break;
            default:
                System.out.println("Invalid meal type entered");
                return;

        }


        System.out.println("The price of your meal is $" + mealPrice);


        scanner.close();
    }
}
