package org.example.e25;

public class E25DailyExpenseTrackerIfConditions {
    public static void main(String[] args) {
        // Assign values to daily expenses
        double morningExpense=25.0;
        double afternoonExpense=30.0;
        double eveningExpense=21.25;


        // Calculate total expense
        double totalExpense=morningExpense+afternoonExpense+eveningExpense;


        // Define a budget
        double budget=100.0;


        // Check if within budget

        System.out.println("Your total daily expense is: "+totalExpense);
        if(totalExpense<budget){
            System.out.println("You are within the budget.");
        }else{
            System.out.println("You are not within the budget.");
        }


    }
}
