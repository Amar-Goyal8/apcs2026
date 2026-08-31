
/**
 * Write a description of class TextTransformer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class TextTransformer
{
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
    
        System.out.println("Welcome to Text Transformer!");
        System.out.println("================================");
        
        System.out.println("Enter a motivational quote:" );
        String phrase = scan.nextLine();
        
        int phraseLength = phrase.length();
        System.out.println("Total Characters (including spaces) is: "+ phraseLength);
        
        
        /*
         * replae method returns new version of old String
         * and replaces first char with second char
         * the og String isnt modified
         */
        String securePhrase = phrase.replace('e', '3');
        securePhrase = securePhrase.replace('a', '@');
        
        System.out.println("Modified phrase: " + securePhrase);
        System.out.println("Original phrase: " + phrase);
        
        /*
         * get first 5 chars of our String
         * ex: You miss 100% shots u dont take
         * index #: 0123456789...
         * substring returns String via first index number (inclusive)
         * to the second index num (exclusive)
         * prefix = You m
         */ 
        String prefix = phrase.substring(0,5);
        System.out.println("first 5 chars: " + prefix);
        
        //returns string from given index
        //to end of og string
        String remainder = phrase.substring(5);
        System.out.println("remaining chars: " + remainder);
    }

    
}
