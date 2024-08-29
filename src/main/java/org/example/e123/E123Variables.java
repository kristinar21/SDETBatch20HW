package org.example.e123;

public class E123Variables {
    // Declare instance variables to hold integer, String, double, boolean, and float values
    int myInt;
    String myString;
    double myDouble;
    boolean myBoolean;
    float myFloat;
    public static void main(String[] args) {
        // Create an instance of the class
        // Access instance variables and print them without assigning any values
        E123Variables instance = new E123Variables();

        System.out.println("Default int value: " + instance.myInt);
        System.out.println("Default String value: " + instance.myString);
        System.out.println("Default double value: " + instance.myDouble);
        System.out.println("Default boolean value: " + instance.myBoolean);
        System.out.println("Default float value: " + instance.myFloat);
    }
}
