/**
 * Write a description of class printing here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

record mathResults(int add, double div, int multi, int sub) {}

public class printing
{

    public static void main(String[] args)
    {

        System.out.print("This is on line 1"); //same line print
        System.out.println("This is on line 1, but next one will be on a new line");
        /*
         * The next print
         * will be on a new line
         */
        String userInput = getUserInput();
        
        displayUserName(userInput);
        
        mathResults results = getVars();
        
        System.out.println("added: " + results.add());
        System.out.println("divided: " + results.div());
        System.out.println("subracted: " + results.sub());
        System.out.println("multiplied: " + results.multi());
    }
    
    public static String getUserInput()
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name ");
        String userName = scanner.nextLine();
        return userName;
    }


    public static void displayUserName(String userName)
    {
        System.out.println("Your name is: " + userName);
    }
    
    public static mathResults getVars()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        int x = input.nextInt();
        
        System.out.println("Enter second number: ");
        int y = input.nextInt();
        
        int a = x+y;
        double d = (double) x/y;
        int m = x*y;
        int s = x-y;
        
        return new mathResults(a, d, m, s);
    }
}