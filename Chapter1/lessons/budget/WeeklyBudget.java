
/**
 * Weekly Budget
 * Amar
 * Last Updated: 8/25/2026
 */

import java.util.Scanner;
import java.text.NumberFormat;
public class WeeklyBudget
{
    // Calculate weekly lunch spending and remaining money
    public static void main(String[] args)
    {
        String name;
        double allowance, lunchPrice, totalCost, remaining;
        int lunchesPerWeek;
        
        NumberFormat money = NumberFormat.getCurrencyInstance();
        
        // Instantiate the Scanner object to read form the keyboard
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your naeme: ");
        name = scan.nextLine();
        
        // read doubles
        System.out.print("Enter your weekly allowance: $");
        allowance = scan.nextDouble();
        
        System.out.print("Enter the price of one shcool lunch: $");
        lunchPrice = scan.nextDouble();
        
        System.out.print("Enter the number of school lunches you ordered this week: ");
        lunchesPerWeek = scan.nextInt();
        
        //Preform calculations (math)
        totalCost = lunchPrice * lunchesPerWeek;
        remaining = allowance - totalCost;
        
        //printf allows placeholders for strings using %s
        System.out.printf("%n--- Weekly Budget Summary for %s ---%n", name);
        
        System.out.printf("%-25s %s%n", "Weekly Allowance:", money.format(allowance));
        System.out.printf("%-25s %s%n", "Total Spent on Lunches:", money.format(totalCost));
        System.out.printf("%-25s %s%n", "Remaining Balance:", money.format(remaining));

    }
}
