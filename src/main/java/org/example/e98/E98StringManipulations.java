package org.example.e98;

public class E98StringManipulations {
    public static void main(String[] args) {
        // Create a String variable named 'given' and assign the value "Hello Syntax friends" to it
        String given = "Hello Syntax friends";
        String newString = given.substring(0, 12).replace("Hello",
                "Welcome").concat(" family");
        System.out.println(newString);



        // Manipulate the string to create a new string "Welcome Syntax family"

        // Print the new string


    }
}
