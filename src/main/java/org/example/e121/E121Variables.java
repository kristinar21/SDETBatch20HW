package org.example.e121;

public class E121Variables {
    // Declare 3 instance variables: integer, double, and char
    int integerValue;
    double doubleValue;
    char charValue;

    public static void main(String[] args) {
        // Create 2 instances of the class
        // Assign values to variables for the first instance
        // Print values of the first instance
        // Assign values to variables for the second instance
        // Print values of the second instance
        E121Variables instance1=new E121Variables();
        instance1.integerValue=10;
        instance1.doubleValue=10.23;
        instance1.charValue='a';

        E121Variables instance2= new E121Variables();
        instance2.integerValue=100;
        instance2.doubleValue=100.23;
        instance2.charValue='s';
        System.out.println(instance1.integerValue);
        System.out.println(instance1.doubleValue);
        System.out.println(instance1.charValue);
        System.out.println(instance2.integerValue);
        System.out.println(instance2.doubleValue);
        System.out.println(instance2.charValue);

    }
}
