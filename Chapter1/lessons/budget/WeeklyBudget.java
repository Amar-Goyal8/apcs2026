
/**
 * Weekly Budget
 * Amar
 * Last Updated: 8/21/2026
 */

import java.util.Scanner;
public class WeeklyBudget
{
    // Calculate weekly lunch spending and remaining money
    public static void main(String[] args)
    {
        String name;
        double allowance, lunchPrice, totalCost, remaining;
        int lunchesPerWeek;
        
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
        
        System.out.println(allowance);
        System.out.println(totalCost);
        System.out.println(remaining);

    }
}
