
/**
 * CountIntegers.java
 *
 * Code Description: Reads input from a user and counts how many times a number
 * between -25 and 25 occurs.
 * 
 * @author Jacob Robbins
 * @version 3/13/18
 * @contact 1002127@palisadessd.net
 */

import java.util.Scanner; // import Scanner class

public class CountIntegers
{
  /**
   * main method - Uses for loop and array and integers to create an array of
   * how many times each number between -25 and 25 was typed. Prints this to the
   * console and closes the Scanner object.
   * 
   * @param args
   */
  public static void main(String[] args)
  {
    // initializing Scanner for user input
    Scanner kb = new Scanner(System.in);
    int iAmWorthless; // for the for loop :)
    int iInput; // stores user input
    int[] iArray = new int[9999]; // declares the array for -25 to 25
    // above array is very big 2d array so user cannot play me
    int iCount = 0; // initializing variable for setting array values
    int iOhBoyLoop; // declaring variable for second for loop

    // prompts user and tells them what the program does
    System.out.println("Welcome to the Arbitrary Number Counter!"
        + " Enter a number between -25 and 25, enter any other number to quit.");
    System.out.println(
        "Upon quitting, the total number of each number sent will be tallied.");

    // loops to keep asking the user for a number
    for (iAmWorthless = 0; iAmWorthless < 10; iAmWorthless++)
    {
      System.out.print("Enter a number here: ");
      iInput = kb.nextInt();
      if (iInput >= -25 && iInput <= 25)
      {
        iArray[iInput + 25]++;
        iCount++;
        iAmWorthless = 0;
      }
      else
      {
        iAmWorthless = 12; // ends the for loop
      }

    }

    // loops to create an array of integers that have been typed (if more than
    // once)
    for (iOhBoyLoop = 0; iOhBoyLoop < 51; iOhBoyLoop++)
    {
      if (iArray[iOhBoyLoop] > 1)
      {
        System.out.println();
        // subtracts 25 since index starts at zero
        System.out.println(
            "Times Entered " + (iOhBoyLoop - 25) + ": " + iArray[iOhBoyLoop]);
      }

    }

    // prints total # of numbers
    System.out.println("You entered " + iCount + " numbers.");
    kb.close(); // closing Scanner object
  }
}
