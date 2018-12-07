
/**
 * Factorial.java
 *
 * Code Description: User input tells the program to compute a factorial.
 * 
 * @author Jacob Robbins
 * @version 12/07/18
 * @contact 1002127@palisadessd.net
 */

import java.util.Scanner; // import Scanner class

public class Factorial
{
  /**
   * main method - Gets user input using a scanner and prints to the console a
   * number of times depending on that input.
   * 
   * @param args
   */
  public static void main(String[] args)
  {
    // declaring and initializing integers to use to calculate the factorial
    int iFactorial, iCount, iResult;
    iResult = 1;
    iCount = 1;

    // initializing boolean to check if integer is negative
    boolean bNegative, bAbove;

    // initializing Scanner to see how many times to print the statement
    Scanner kb = new Scanner(System.in);

    // prompting the user for a number to get its factorial
    System.out.println(
        "Enter an integer from 0 and 31 to get the product of it as a factorial.");

    // reading user input
    iFactorial = kb.nextInt();

    // if statement sets negative to true if the nnumber is negative
    // while loop loops the scanner prompt until the number entered is positive
    if (Math.abs(iFactorial) != iFactorial)
    {
      bNegative = true;
      while (bNegative == true)
      {
        System.out.println(
            "This program does not deal with negative factorials. Please enter a positive integer.");
        // loops within the while loop until the number entered is not negative
        // prompting for a new number is in the while loop
        iFactorial = kb.nextInt();
        // rechecks if the number entered is positive or negative
        if (Math.abs(iFactorial) == iFactorial)
        {
          // if above is true, number is no longer negative, program can proceed
          bNegative = false;
        }
      }
    }

    // checks if the number entered is above 31
    // loops and prompts the user until they enter a number lower than 32
    // very similar to the previous loop
    if (iFactorial > 31)
    {
      bAbove = true;

      while (bAbove)
      {
        System.out.println();
        System.out.println("This Java program cannot handle numbers above 31.");
        System.out.println("Please enter a positive below 31.");
        iFactorial = kb.nextInt();
        // detects if the number is less than 32
        if (iFactorial < 32)
        {
          // sets the while loop to false, breaking the cycle
          bAbove = false;
        }
      }
    }

    // loops until the counter is less than the factorial entered
    while (iCount < iFactorial)
    {
      iResult = iResult * (iCount + 1);
      iCount++;
    }

    // prints the final answer of the factorial to the console
    System.out.println(iResult);

    kb.close(); // closing Scanner object
  }
}
