package chapter5;

/**
 * Salary.java
 *  
 * Code Description: Takes user input to determine an employee's raise.
 * 
 * @author Jacob Robbins
 * @version 12/03/18
 * @contact 1002127@palisadessd.net
 */

import java.util.Scanner; // import Scanner class
import java.text.NumberFormat; // import NumberFormat class

public class Salary
{
  /**
   * main method - Takes user input to determine an employee's raise.
   * 
   * @param args
   */
  public static void main(String[] args)
  {
    // declaring doubles to calculate the employee's raise
    double dCurrentSalary;
    double dRaise;
    double dNewSalary;

    // initializing String for user input
    String sRating = ("no");

    // initializing a currency format
    NumberFormat fmtCurrency = NumberFormat.getCurrencyInstance();

    // initializing the Scanner to read user input
    Scanner kb = new Scanner(System.in);

    // prompting the user for the employee's salary
    System.out.println(
        "Hello User. You can use this program to determine how much to increase an employees salary.");
    System.out.println(
        "First, how would you rate this employee? Excellent, good, or poor? Do not spell it incorrectly"
        + " or you will have to restart the whole program.");
    sRating = kb.nextLine();
    System.out.print(
        "Enter the current salary of the employee then press enter (round to the nearest integer salary): ");
    // assigns dCurrentSalary
    dCurrentSalary = kb.nextInt();

    // computes how much of a raise the employee deserves for each case of
    // rating
    // computes the total salary increase the employee should receive
    // prints to the console
    if (sRating.equalsIgnoreCase("excellent"))
    {
      // calculates the raise amount and the employee's new salary
      dRaise = dCurrentSalary * 0.035;
      dNewSalary = dCurrentSalary + dRaise;

      // prints to the console all the information required for the user
      System.out.println();
      System.out.println("The employee rated \"Excellent\" with a salary of "
          + dCurrentSalary + " should receive: ");
      System.out.println("A salary increase of " + fmtCurrency.format(dRaise));
      System.out.println("A total pay of " + fmtCurrency.format(dNewSalary));
    }
    else if (sRating.equalsIgnoreCase("good"))
    {
      dRaise = dCurrentSalary * 0.02;
      dNewSalary = dCurrentSalary + dRaise;
      System.out.println();
      System.out.println("The employee rated \"Good\" with a salary of "
          + dCurrentSalary + " should receive: ");
      System.out.println("A salary increase of " + fmtCurrency.format(dRaise));
      System.out.println("A total pay of " + fmtCurrency.format(dNewSalary));
    }
    else if (sRating.equalsIgnoreCase("poor"))
    {
      dRaise = dCurrentSalary * 0.005;
      dNewSalary = dCurrentSalary + dRaise;
      System.out.println();
      System.out.println("The employee rated \"Good\" with a salary of "
          + dCurrentSalary + " should receive: ");
      System.out.println("A salary increase of " + fmtCurrency.format(dRaise));
      System.out.println("A total pay of " + fmtCurrency.format(dNewSalary));
    }
    else
    {
      System.out.println();
      System.out.println(
          "That is not one of the correct ratings. Please restart the program.");
    }

    kb.close(); // closing scanner
  }
}
