
/**
 * DoSum.java
 *
 * Code Description: Adds integers that the user enters, until
 * they enter 0.
 * 
 * @author Jacob Robbins
 * @version 1/11/19
 * @contact 1002127@palisadessd.net
 */

import java.util.Scanner; // import Scanner class
import java.text.DecimalFormat; // imports DecimalFormat class

public class DoSum
{
  /**
   * main method - Loops until the user enters 0, gives the sum
   * of two integers or doubles
   * 
   * 
   * @param args
   */
  public static void main(String[] args)
  {
    // initializing Scanner for user input
    Scanner kb = new Scanner(System.in);

 // insures that the number in the tenthes place is always shown
    DecimalFormat fmtDecimal = new DecimalFormat("0.##");
    
    // initalizes doubles TO USE FOR INPUT
    double dInput =1.0, dInput2 = 1.0;
    
    // prompts user and explains program
    System.out.println("Hello! Welcome to the sum machine. Enter numbers pressing enter after"
        + " every number to get their sum. 0 Quits the program.");
    
    while(!(dInput == 0.0 || dInput == 0.0)) {
      dInput = kb.nextDouble();
      // breaks the loop
      if(dInput == 0)
      {
        System.out.println("Closing the program.");
        return; // closes program
      }
      dInput2 = kb.nextDouble();
      // breaks the loop
      if(dInput2 == 0)
      {
        System.out.println("Closing the program.");
        return; // closes program
      }
      // prints the sum with no more than 2 decimals
      System.out.println(fmtDecimal.format((dInput + dInput2))); 
      // prompts user and reminds them how to quit the program.
      System.out.println("Enter another 2 decimals/integers with spaces in between to"
          + " get their sum. Entering 0 quits the program.");
    }
    
    System.out.println("Closing the program.");

    kb.close(); // closing Scanner object
  }
}
