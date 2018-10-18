
/**
 * RollingDice.java
 *
 * Code Description: Simulates the rolling of a pair of dice and
 * prints their sum and individual values to the user.
 *    
 * @author Jacob Robbins
 * @version 10/18/18
 * @contact 1002127@palisadessd.org
 */

import java.util.Random; //import Random class

public class RollingDice
{
  /**
   * main method - Simulates the rolling of a pair of dice and prints their sum
   * and individual values to the user.
   * 
   * @param args
   */
  public static void main(String[] args)
  {

    // initializing a new random
    Random gen = new Random();

    // initializing new integers
    int iDieOne, iDieTwo;

    // calculating pseudorandom integers between 1 and 6
    iDieOne = gen.nextInt(6) + 1;
    iDieTwo = gen.nextInt(6) + 1;

    // printing to the user the values for each die
    System.out.println("Rolling two dice...");
    System.out.println();
    System.out.println("Results for Die #1: " + iDieOne);
    System.out.println("Results for Die #2: " + iDieTwo);
    System.out.println();
    
    // calculates and prints the sum of the dice
    System.out.println("Total Roll: " + (iDieOne + iDieTwo));

  }
}
