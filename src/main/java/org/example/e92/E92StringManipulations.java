package org.example.e92;

public class E92StringManipulations {
    public static void main(String[] args) {
        // Create a String variable named 's1' and assign the value "hello how are you" to it
        String s1 = "hello how are you";
        boolean endsWithU=s1.endsWith("u");
        boolean endsWithWorld=s1.endsWith("world");
        boolean endsWithAre=s1.endsWith("are");
        boolean endsWithYou=s1.endsWith("you");

        System.out.println(endsWithU);
        System.out.println(endsWithWorld);
        System.out.println(endsWithAre);
        System.out.println(endsWithYou);

        // Use the endsWith() method to check if 's1' ends with "u" and print the result

        // Use the endsWith() method to check if 's1' ends with "world" and print the result

        // Use the endsWith() method to check if 's1' ends with "are" and print the result

        // Use the endsWith() method to check if 's1' ends with "you" and print the result
    }
}
