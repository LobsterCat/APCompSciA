
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

    // initializing Scanner to see how many times to print the statement
    Scanner kb = new Scanner(System.in);

    // prompting the user for a number to get its factorial
    System.out.println(
        "Enter an integer between 0 and 31 to get the product of it as a factorial.");

    // reading user input
    iFactorial = kb.nextInt();

    // loops until the counter is less than the factorial entered
    while (iCount < iFactorial)
    {
      iResult = iResult * (iCount + 1);
      iCount++;
    }

    System.out.println(iResult);

    kb.close(); // closing Scanner object
  }
}
