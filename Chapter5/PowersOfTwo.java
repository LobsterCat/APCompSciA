
/**
 * PowersOfTwo.java
 *
 * Code Description: Uses user input to print however many powers of 2.
 * 
 * @author Jacob Robbins
 * @version 12/07/18
 * @contact 1002127@palisadessd.net
 */

import java.util.Scanner; // import Scanner class

public class PowersOfTwo
{
  /**
   * main method - Gets user input using a scanner and prints to the console a
   * number of times depending on that input.
   * 
   * @param args
   */
  public static void main(String[] args)
  {
    // initializing Scanner to see how many times to print the statement
    Scanner kb = new Scanner(System.in);

    // initializing variables for user input
    // initializing variables to calculate exponent and track when to stop the
    // loop
    int iExponent, iLimit, iCount, iPower;
    iCount = 1;
    iExponent = 0;
    iLimit = 3;
    iPower = 1 << iExponent;

    // prompting user for the # of loops
    System.out.println(
        "Enter a number to find that power of two as well as the powers before it.");

    // setting how many times to print statement to input
    iLimit = kb.nextInt();

    System.out.println("Here are the first " + iLimit + " powers of 2" + ":");

    // loops until the count is less than the # input by the user
    while (iCount <= iLimit)
    {
      System.out.println("2^" + iExponent + " = " + (iPower));
      iCount++;
      iExponent++;
      iPower = 1 << iExponent;
    }

    kb.close(); // closing Scanner object
  }
}
