package org.example.e93;

public class E93StringManipulations {
    public static void main(String[] args) {
        // Create a String variable named 'str' and assign the value "abracadabra alakazam" to it
        String str = "abracadabra alakazam";

        // Create a String variable named 'target1' and assign the value "dab" to it
        String target1 = "dab";

        // Create a String variable named 'target2' and assign the value "ABRA" to it
        String target2 = "ABRA";

        int indexC=str.indexOf("c");
        int indexSpace=str.indexOf(" ");
        int indexTarget1=str.indexOf(target1);
        int indexTarget2=str.indexOf(target2);
        System.out.println(indexC);
        System.out.println(indexSpace);
        System.out.println(indexTarget1);
        System.out.println(indexTarget2);

        // Use the indexOf() method to find the position of the first occurrence of 'c' and print the result

        // Use the indexOf() method to find the position of the first occurrence of ' ' (space) and print the result

        // Use the indexOf() method to find the position of the first occurrence of the variable 'target1' and print the result

        // Use the indexOf() method to find the position of the first occurrence of the variable 'target2' and print the result
    }
}
