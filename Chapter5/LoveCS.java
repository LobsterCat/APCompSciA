
/**
 * LoveCS.java
 *
 * Code Description: 
 * 
 * @author Jacob Robbins
 * @version 12/05/18
 * @contact 1002127@palisadessd.net
 */

import java.util.Scanner; // import Scanner class

public class LoveCS
{
  public static void main(String[] args)
  {
    // initializing integers to keep track of how many times to print
    // and has been printed
    int iLimit;
    int iCount = 1;
    int iCountTwo = 1;
    int iSum = 0;

    // initializing Scanner to see how many times to print the statement
    Scanner kb = new Scanner(System.in);

    // prompting user for the # of loops
    System.out.println(
        "How many times should the message be printed? (Enter an integer)");

    // setting how many times to print statement to input
    iLimit = kb.nextInt();

    // loops until the count is less than the # input by the user
    while (iCount <= iLimit)
    {
      System.out.println(iCount + " I love Computer Science!!");
      iCount++;

    }
    // prints how many times the statement in the loop was printed, zero by
    // default
    System.out.println();
    System.out.println("This statement was printed " + iLimit + " times.");

    // loops until the second counter is equal to the limit
    // increments and adds the line numbers to get the sum
    while (iCountTwo < iLimit)
    {
      iCountTwo++;
      iSum += iCountTwo;
    }
    // prints to the console the sum of all the line numbers
    System.out.println(
        "The sum of the numbers from 1 to " + iLimit + " equals " + (iSum + 1));

    kb.close(); // closing Scanner object
  }
}
