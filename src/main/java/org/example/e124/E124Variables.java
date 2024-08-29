package org.example.e124;

public class E124Variables {
    // Declare a static variable at the class level
    static String ss = "Welcome To Syntax Technologies";

    public static void main(String[] args) {
        // Access and print the static variable using three different methods
        // 1. By calling directly
        System.out.println(ss);
        E124Variables obj = new E124Variables();
        System.out.println(obj.ss);
        // 2. By using the class name

        // 3. By creating an object of the class
    }
}