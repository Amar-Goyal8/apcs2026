
/**
 * Write a description of class PrizeGenerator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Random;
public class PrizeGenerator
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        NumberFormat money = NumberFormat.getCurrencyInstance();
        
        System.out.println("Welcome to the APCSA Prize Simulator!");
        System.out.println("-------------------------------------");
        System.out.print("Please enter your name: ");
        String name = scan.nextLine();
        
        System.out.print("How much do you have? $:");
        double startBalance = scan.nextDouble();
        
        // generata random num
        // Math.random gens a num 0 (inclusive) and 1 (exclusive)
        int prizeAmount = 10+ (int) (Math.random() * 91);
        System.out.println(prizeAmount);
        
        //gen rand fee 1-5 bucks
        int fee = 1+ (int)(Math.random()*5);
        
        // int vals auto promoted to double 
        // alowed cuz no info lost
        double finalBalance = startBalance + prizeAmount - fee;
        
        System.out.println("\n Congratulations " + name + "! Here is your statement:");
        System.out.println("===============================================");
        
        System.out.printf("%-25s %s%n", "Starting Balance", money.format(startBalance));
        System.out.printf("%-25s %s%n", "Prize Money", money.format(prizeAmount));
        System.out.printf("%-25s %s%n", "Processing Fee", money.format(fee));
        System.out.println("---------------------------------------");
        System.out.printf("%-25s %s%n", "Final Balance", money.format(finalBalance));
        System.out.println("===============================================");
    }
}
