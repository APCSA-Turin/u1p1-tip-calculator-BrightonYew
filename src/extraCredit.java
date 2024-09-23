import java.util.Scanner;

package com.example.project;

public class extraCredit {
    //WRITE YOUR PROGRAM IN calculateTip
    public static String calculateTip(int people, int percent, double cost) { //You must use these  variable in your calculations
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter an item name or type '-1' to finish:");
        

        double unroundedCost = cost * (1 + percent/100.0);
        double newCost = Math.round(unroundedCost * 100.0) / 100.0; //https://www.educative.io/answers/how-to-use-the-java-mathround-method
        double totalTip = Math.round((newCost - cost) * 100.0) / 100.0;
        double perPersonBeforTip = Math.round(cost / people * 100.0) / 100.0;
        double tipPerPerson = Math.round(totalTip / people * 100.0) / 100.0;
        double totalCostPerPerson = Math.round(unroundedCost / people * 100.0) / 100.0;

        //DO NOT DELETE ANY OF THE CODE BELOW     
        StringBuilder result = new StringBuilder();

                       
        result.append("-------------------------------\n");
        result.append("Total bill before tip: " ); //concatenate to this string. DO NOT ERASE AND REWRITE
        result.append("$" + cost + "\n" );
        result.append("Total percentage: ");
        result.append(percent + "%\n" );
        result.append("Total tip: ");
        result.append("$" + totalTip+ "\n" );
        result.append("Total Bill with tip: ");
        result.append("$" + newCost + "\n");
        result.append("Per person cost before tip: ");
        result.append("$" + perPersonBeforTip + "\n" );
        result.append("Tip per person: ");
        result.append("$" + tipPerPerson + "\n");
        result.append("Total cost per person: ");
        result.append("$" + totalCostPerPerson + "\n" );
        result.append("-------------------------------\n");


        return result.toString();
        scan.close();
    }
     //TEST YOUR PROGRAM IN main
     public static void main(String[] args) {
        //try different values for people, percent, and cost to test your program before running test cases
        int people = 12; 
        int percent = 15;
        double cost = 566.97;              
        System.out.println(calculateTip(people,percent,cost));
    }
}
        

