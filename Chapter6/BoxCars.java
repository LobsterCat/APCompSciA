/**
 * BoxCars.java
 *
 * Code Description: Rolls 1000 pairs of dice and prints the results,
 * 20 per line.
 * 
 * @author Jacob Robbins
 * @version 2/1/19
 * @contact 1002127@palisadessd.net
 */

/**
 * main method - Uses two separate for loops in order to
 * print 20 rolls of two dice per line. 
 * 
 * @param args
 */
public class BoxCars
{

  public static void main(String[] args)
  {
    // declaring integers to use for the loops as well
    // as rolling the dice
    int iRolls, iCount, iRollOne, iRollTwo;
    int iBoxCars = 0; // initializing the # of double 6 rolls as 0
    PairOfDice pairOne = new PairOfDice();
    Die dieOne = new Die();

    // loops 50 times
    for (iCount = 0; iCount < 50; iCount++)
    {
      System.out.println("");
      // loops to print 20 rolls per line
      for (iRolls = 0; iRolls < 20; iRolls++)
      {
        // stores the rolls as integers, it was easier for my program
        iRollOne = dieOne.roll();
        iRollTwo = dieOne.roll();
        if (iRollOne == 6 && iRollTwo == 6)
        {
          iBoxCars++; //increments the # of double 6's
        }
        // prints and spaces each roll
        System.out.print(iRollOne + "" + iRollTwo + " ");

      }
    }
    // prints the total to the user at the end of both loops
    System.out.println();
    System.out.println("Total number of boxcars: " + iBoxCars);
  }
}
