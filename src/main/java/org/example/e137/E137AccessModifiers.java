package org.example.e137;

public class E137AccessModifiers {
    private String name;
    String city;
    protected String schoolName;
    public int batchNumber;

    public void display() {
        System.out.println("My name is " + name + " and I live in " + city + ". I study at " + schoolName + " in batch " + batchNumber);}

    public static void main(String[] args) {

        E137AccessModifiers student=new E137AccessModifiers();
        student.name = "John";
        student.city = "Miami";
        student.schoolName = "Syntax";
        student.batchNumber = 9;

        student.display();
    }
}

