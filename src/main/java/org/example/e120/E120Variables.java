package org.example.e120;

import org.example.e86.Student;

public class E120Variables {
    // Declare 3 instance variables: year, school name, and batch number

    int year;
    String schoolName;
    int batchNumber;

    public static void main(String[] args) {
        // Access variables from the main method and assign specific values to them
        // Print values of your variables in the specified format


         E120Variables student=new E120Variables();
            student.year=2020;
            student.schoolName="Syntax";
            student.batchNumber=6;
        System.out.println("I am a student of batch "+student.batchNumber+" studying at "+ student.schoolName+" in the year "+student.year
        );

    }
}
