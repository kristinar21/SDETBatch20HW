package org.example.e122;

public class E122Variables {
    // Declare 3 instance variables: name of the countryName, capital, and populationSize
    String countryName;
    String capital;
    long populationSize;

    // Create a method to display values of instance variables

    public static void main(String[] args) {
        // Create 2 instances of the class
        // Assign values to variables for the first instance
        // Execute the method to display values for the first instance
        // Assign values to variables for the second instance
        // Execute the method to display values for the second instance
        E122Variables instance1= new E122Variables();
        instance1.countryName="USA";
        instance1.capital="Washington DC";
        instance1.populationSize=330000000l;
        E122Variables instance2=new E122Variables();
        instance2.countryName="Kazakhstan";
        instance2.capital="Astana";
        instance2.populationSize=18500000l;

        System.out.println("The capital of "+instance1.countryName+" is "+instance1.capital+" and the population is "+instance1.populationSize);
        System.out.println("The capital of "+instance2.countryName+" is "+instance2.capital+" and the population is "+instance2.populationSize);

    }
}
