package org.example.e139;

public class E139AccessModifiers {
    public String replaceSpaces(String str) {
        return str.replace(" ", "_");
    }
    public static void main(String[] args) {
        E139AccessModifiers manipulator = new E139AccessModifiers();

        System.out.println(manipulator.replaceSpaces("hello world"));
        System.out.println(manipulator.replaceSpaces("java is fun"));
        System.out.println(manipulator.replaceSpaces("i love coding"));
    }
}

