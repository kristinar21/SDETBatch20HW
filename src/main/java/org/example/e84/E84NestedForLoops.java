package org.example.e84;

public class E84NestedForLoops {
    public static void main(String[] args) {
        // Declare and initialize the 2D array to store the multiplication table values
        int[][] table = new int[5][10];
        int a=6;
        int b=10;
        for (int i=0; i< table.length; i++){
            for (int j=0; j<table[i].length;j++){
                table[i][j]=(i+a)*(j+1);
            }
        }for (int i=0; i<table.length;i++){
            for (int j=0; j<table[i].length;j++){
                System.out.print(table[i][j]+" ");
            }
            System.out.println();
        }



        // Use nested loops to fill the 2D array with multiplication table values

        // Use nested loops to iterate through the 2D array and print the pattern

    }
}
