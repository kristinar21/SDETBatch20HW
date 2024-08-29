package org.example.e116;

public class E116JavaMethods {
    public static void main(String[] args) {
        // Call the bothEven method with various arguments to test the method
        bothEven(10,5);
        System.out.println(bothEven(10,5));
    }public static boolean bothEven(int num1, int num2){
        if (num1%2==0&&num2%2==0){
            return true;
        }else {return false;}
    }

    // Create method bothEven with two integer parameters
    // Inside the method, check if both numbers are even
    // Return true if both numbers are even, otherwise return false
}
