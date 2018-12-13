
/**
 * CountDigits.java
 *
 * Code Description: A program that reads an integer value from the user representing a year.
 * 
 * @author Jacob Robbins
 * @version 12/11/18
 * @contact 1002127@palisadessd.net
 */

import java.util.Scanner; // import Scanner class

public class CountDigits
{
  /**
   * main method - Uses remainders to determine what the year entered is
   * divisible by, then prints to the console whether it is a leap year or not.
   * 
   * @param args
   */
  public static void main(String[] args)
  {
    // initializing Scanner for user input
    Scanner kb = new Scanner(System.in);

    // declares string for user input
    String sInput = "";

    // initializes integers to count how many of each digit is within the String
    // entered
    int iOdds = 0, iEvens = 0, iZeros = 0;

    // tells user that their integer will be parsed for specific integers
    System.out.println(
        "Input an integer to determine how many odd, even, and zero numbers are within it.");

    // loops until the user inputs actual numbers
    while (sInput.isEmpty())
    {
      // setting user input to String
      System.out.println("Enter a whole or decimal number, then press enter.");
      sInput = kb.nextLine();
    }

    // initializes StringBuilder for use in parsing
    StringBuilder sb = new StringBuilder(sInput);

    // for loop starts at zero, gets incremented after the if statements
    // loops until all the characters in the String of numbers is evaluated to being
    // odd, even, or zero
    for (int iCount = 0; iCount < sInput.length(); iCount++)
    {
      if (sb.charAt(iCount) == '1' || sb.charAt(iCount) == '3'
          || sb.charAt(iCount) == '5' || sb.charAt(iCount) == '7'
          || sb.charAt(iCount) == '9')
      {
        System.out.println("Odd Digit");
        // adds to counter of odd digits
        iOdds++;
      }
      else if (sb.charAt(iCount) == '2' || sb.charAt(iCount) == '4'
          || sb.charAt(iCount) == '6' || sb.charAt(iCount) == '8')
      { 
        System.out.println("Even Digit");
        // adds to counter of even digits
        iEvens++;
      }
      else if (sb.charAt(iCount) == '0')
      {
        System.out.println("Zero Digit");
        // adds to the counter of zero digits
        iZeros++;
      }
    }

    // prints results to in a format easy for the user to read
    System.out.println();
    System.out.println("Grand Total of Odd, Even, and Zero Numbers:");
    System.out.println("Odds: " + iOdds);
    System.out.println("Evens: " + iEvens);
    System.out.println("Zeros: " + iZeros);
    
    kb.close(); // closing Scanner object
  }
}
