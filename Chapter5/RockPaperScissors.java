import java.util.Random; // importing Random class
import java.util.Scanner; // importing Scanner class

/**
 * RockPaperScissors.java
 *
 * Code Description: Human input plays rock paper scissors against a computer
 * generated answer.
 * 
 * @author Jacob Robbins
 * @version 1/1/19
 * @contact 1002127@palisadessd.net
 */

public class RockPaperScissors
{
  /**
   * main method - randomly picks an answer and displays the winner, user
   * chooses input via entering integers through the console
   * 
   * @param args
   */

  public static void main(String[] args)
  {
    // initializing Scanner object
    Scanner kb = new Scanner(System.in);

    // creating random for
    Random gen = new Random();

    // declaring integer for user input and random integers
    int iInput, iRandom;

    // declaring String for use in answer detection
    String sComputer;

    // explains how to play rock paper scissors and which numbers correspond
    // with which answer
    System.out.println(
        "Welcome to Rock, Paper, Scissors! Here you will face a computer generated, random result of either rock, paper, or scissors.");
    System.out.println(
        "Your goal is to beat the computer, enter a number to select which choice you would like.");
    System.out.println(
        "------------------------------------------------------------------");
    System.out.println("1     Rock");
    System.out.println("2     Paper");
    System.out.println("3     Scissors");
    System.out.println("");

    // defaults the integer so it is not 0 (0 terminates program)
    iInput = 3;

    // prompts and reads the user's input
    System.out.println("Enter 1, 2, or 3 below then press enter.");

    while (iInput != 0)
    {
      iInput = kb.nextInt();

      // gets random integer from 1 to 3
      iRandom = gen.nextInt(3) + 1;

      if (iRandom == 1)
      {
        sComputer = "rock";
      }
      else if (iRandom == 2)
      {
        sComputer = "paper";
      }
      else
      {
        sComputer = "scissors";
      }

      // checks to see if user input matches randomly generated number, thus
      // they would tie
      // checks all possible combinations of answers and determines the winner
      // for each one
      if (iRandom == iInput)
      {
        System.out.println(
            "You tied the computer! Enter another number to play again (0 quits the program).");
      }
      else if (iRandom == iInput - 1)
      {
        System.out.println(
            "You beat the computer! The computer picked " + sComputer + ". "
                + "Enter another number to play again (0 quits the program).");
      }
      else if (iRandom == iInput + 1)
      {
        System.out.println("You lost against the computer, the computer picked "
            + sComputer + ". "
            + "Enter another number to play again (0 quits the program).");
      }
      else if (iRandom == 3 && iInput == 1)
      {
        System.out.println(
            "You beat the computer! The computer picked " + sComputer + ". "
                + "Enter another number to play again (0 quits the program).");
      }
      else if (iRandom == 1 && iInput == 3)
      {
        System.out.println(
            "You lost to the computer. The computer picked " + sComputer + ". "
                + "Enter another number to play again (0 quits the program).");
      }
      else
      {
        System.out.println("That number is not between 1 and 3.");
      }
      System.out.println("Computer's integer choice: " + iRandom);

    }
    kb.close(); // closes Scanner
  }
}
