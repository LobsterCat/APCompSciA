
/**
 * SumEvens.java
 *
 * Code Description: Prints the sum of all even numbers between 2
 * and the number a user input.
 * 
 * @author Jacob Robbins
 * @version 2/1/19
 * @contact 1002127@palisadessd.net
 */
import java.util.Scanner; // imports Scanner class

/**
 * main method - Users the Scanner class and a while loop to continually prompt
 * the user for integers, using those integers for 
 * 
 * 
 * @param args
 */
public class SumEvens
{

  public static void main(String[] args)
  {
    // initializing Scanner
    Scanner kb = new Scanner(System.in);
    int iInput = 1; // declaring variable for user input
    int iL; // declaring integer for for loop
    int iSum; // declaring integer for sum of even #'s

    // prompts the user to enter a positive integer
    System.out.println("Enter a positive integer to get the sum of all"
        + "of the even integers from 0 to that integer. Enter 0 to quit.");

    while (iInput != 0)
    {
      iSum = 0;
      System.out.println(
          "Please enter a positive integer greater than 2 (0 to quit): ");
      iInput = kb.nextInt();

      // checks first to see if the user inputs a value of 2 or higher
      if (iInput >= 2)
      {
        // then loops until the sum of all even numbers between the 
        // user input has been calculated
        for (iL = 2; iL <= iInput; iL += 2)
        {
          iSum += 2 * iL / 2;
        }
        System.out.println("All even numbers from 2 to " + iInput + " yields a sum of: " + iSum);
      }
      else
      {
        System.out.println(
            "That number cannot be processed. Remember to enter a number 2 or higher.");
      }
    }

    kb.close(); // closes Scanner

  }
}
