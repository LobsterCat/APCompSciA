
/**
 * LeapYear.java
 *
 * Code Description: A program that reads an integer value from the user representing a year.
 * 
 * @author Jacob Robbins
 * @version 12/11/18
 * @contact 1002127@palisadessd.net
 */

import java.util.Scanner; // import Scanner class

public class LeapYear
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

    // declaring int to store user input
    int iYear = 1582;

    // prompts user for an integer year
    // tells them 0 escapes the loop
    System.out.println(
        "Welcome, to LeapYear.java. This program is used to determine if a year is a leap year or not.");
    System.out.println(
        "This program is based off of the Gregorian calendar, which was created in 1582.");
    System.out.println();
    System.out.println(
        "Enter an integer greater than 1582 to determine if it is a leap year.");
    System.out.println("To quit the program, type \"0\".");
    System.out.println();

    // loops unless the user inputs 0 (to quit)
    while (iYear != 0)
    {
      // loops the user input (integers)
      iYear = kb.nextInt();
      // checks if the year is after the Gregorian calendar was created
      // checks to make sure the year isn't a century
      if (iYear >= 1582 && iYear % 100 != 0 && iYear % 4 == 0)
      {
        // tells the user that their integer entered is a leap year
        System.out.println(iYear
            + " IS a leap year. Enter another integer to test it or type 0 to quit.");
      }
      else if (iYear == 0)
      {
        System.out.println("Quitting the program.");
      }
      // checks if the year is after the Gregorian calendar was created
      // checks that if it is a century it's divisible by 400
      else if (iYear >= 1582 && iYear % 400 == 0)
      {
        System.out.println(iYear
            + " IS actually a leap year. It is a century divisible by 400. "
            + "Enter another integer to test it or type 0 to quit.");
      }
      else if (iYear >= 1582 && iYear % 400 != 0 && iYear % 100 == 0)
      {
        System.out.println("The year " + iYear
            + " is NOT a leap year. This is because it is a century that is not divisible by four.");
        System.out.println("Try another year or enter 0 to quit the program.");
      }
      // determines if the integer entered is BC
      else if (iYear != Math.abs(iYear))
      {
        // prompts the user for another number
        System.out.println(
            "That year is B.C. and therefore before the Gregorian calendar was created."
                + " Enter another integer to retry or type \"0\" to close the program.");
      }
      // determines if the integer is before the Gregorian calendar
      else if (iYear < 1582 && iYear != 0)
      {
        System.out.println(
            "That year is before the Gregorian calendar was created. Enter another year"
                + " above 1581 or type 0 to quit.");
      }
      else
      {
        System.out.println(
            "That year is NOT a Leap Year. (\"0\" quits the program).");
      }
    }
    kb.close(); // closing Scanner object
  }
}
