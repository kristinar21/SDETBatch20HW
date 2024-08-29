package org.example.e114;

public class E114JavaMethods {
    public static void main(String[] args) {
        // Call the add method with arguments that add up to 30
        add(20,10);
        multiply(5,6);
        subtract(40,20);

        // Call the multiply method with arguments that multiply to 30


        // Call the subtract method with arguments that subtract to 20

    }public static void add(int a, int b){
        int result=a+b;
        System.out.println("Addition "+result);
    }public static void multiply(int a, int b){
        int result=a*b;
        System.out.println("Multiplication "+result);
    }public static void subtract(int a, int b){
        int result=a-b;
        System.out.println("Subtraction "+result);
    }



}
