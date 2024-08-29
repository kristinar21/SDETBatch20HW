package org.example.e101;

import java.util.Scanner;

public class E101StringManipulations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("In: ");
        String input = scanner.nextLine();

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i += 2) {
            result.append(input.charAt(i));
        }

        System.out.println(result.toString());

        scanner.close();

    }
}
