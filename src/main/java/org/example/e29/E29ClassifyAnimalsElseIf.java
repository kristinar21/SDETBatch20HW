package org.example.e29;

public class E29ClassifyAnimalsElseIf {
    public static void main(String[] args) {
        // Declare a string variable and assign a value
        String animal="dog";


        // Use if-else-if conditions to classify the animal
        if(animal=="dog"){
            System.out.println("The animal is a mammal.");
        }else if(animal=="eagle"){
            System.out.println("The animal is a bird.");
        }else if(animal=="shark"){
            System.out.println("The animal is a fish.");
        }else if(animal=="frog"){
            System.out.println("The animal is an amphibian.");
        }else if(animal=="snake"){
            System.out.println("The animal is a reptile");}
        else{
            System.out.println("Unknow animal type.");}


    }
}