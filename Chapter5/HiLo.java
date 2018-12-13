
/**
 * HiLo.java
 *
 * Code Description: A program that plays the high low game with the user.
 * 
 * @author Jacob Robbins
 * @version 12/13/18
 * @contact 1002127@palisadessd.net
 */

import java.util.Scanner; // import Scanner class
import java.util.Random; // import Random class

public class HiLo
{
  /**
   * main method - Creates a random number and plays a guessing game with the
   * user.
   * 
   * @param args
   */
  public static void main(String[] args)
  {
    // initializing Scanner for user input
    Scanner kb = new Scanner(System.in);

    // initializing Random for guessing game
    Random gen = new Random();

    // declares integer to store random number
    // declares integer for input, how many times user guessed
    // declares integer for how many games user played
    int iRand, iInput, iGuesses, iGames;

    // starts the user at 1 game
    iGames = 0;

    // initializing String to determine # of games played
    String sFlag = "y";

    while (sFlag.equalsIgnoreCase("y") || sFlag.equalsIgnoreCase("yes"))
    {
      // generates a random integer between 1 and 100 (inclusive)
      iRand = gen.nextInt(100) + 1;
      // prompts the user for a # at the start of a new game
      System.out
          .println("I have generated a number between 1 and 100 (inclusive). "
              + "Take your best guess. Entering 0 quits the program.");
      // takes a guess from the user
      iInput = kb.nextInt();
      iGuesses = 1;
      iGames++;

      // checks to see if the user guessed the integer
      while (iRand != iInput && iInput != 0)
      {

        // checks if the guess is low
        if (iInput < iRand)
        {
          System.out
              .println("That guess is too low, guess again. (Guess 0 to quit)");
        }
        // if the guess isn't low, checks if it is too high
        else if (iInput > iRand)
        {
          // prompts the user for another guess
          System.out.println(
              "That guess is too high, guess again. (Guess 0 to give up)");
        }
        // grabs the user's alternate guess
        iInput = kb.nextInt();
        iGuesses++;
      }

      // gives the user their reward if they earned it
      if (iInput == iRand)
      {
        System.out.println("You guessed the generated number of " + iRand
            + " in " + iGuesses + " guesses"
            + ". Here's your reward: https://tinyurl.com/rewardforyou239");
        System.out.println("Would you like to play again? (y/n)");
        sFlag = "y";
        if (sFlag.equalsIgnoreCase("y"))
        {
          sFlag = kb.next();
        }
        System.out.println();
      }
    }
    System.out.println(
        "                                          PROGRAM TERMINATED");
    System.out.println("Thanks for playing! You played " + iGames
        + " games today in HiLo.java.");

    kb.close(); // closing Scanner object
  }
}
