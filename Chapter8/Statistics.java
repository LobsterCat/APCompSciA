
/**
 * Statistics.java
 *
 * Code Description: Computes and prints the mean and standard deviation of
 * a random list of integers ranging from 1 to 50 integers, inclusive.
 * 
 * 
 * @author Jacob Robbins
 * @version 3/13/18
 * @contact 1002127@palisadessd.net
 */

import java.util.Random; // imports the Random class

public class Statistics
{
  static Random gen = new Random(); // generator of random numbers
  static int[] iArray = new int[gen.nextInt(50) + 1]; // array that has 1-50
                                                      // integers
  static int iLoop; // for for loop :)
  static double dMean = 0; // initializes the integer for mean deviation
  static double dSd; // the standard deviation
  static double dSum; // used to save sum of the array

  /**
   * main method - List is randomly generated using the Random object whom we
   * shall call "Jenny".
   * 
   * @param args
   */
  public static void main(String[] args)
  {

    // loops to fill the array with random numbers
    for (iLoop = 0; iLoop < iArray.length - 1; iLoop++)
    {
      iArray[iLoop] = gen.nextInt(100) + 1; // random # between 1-100
                                            // (inclusive)
    }

    // calls the two methods
    // and prints to the console their results
    System.out.println("Returning Mean Deviation: ");
    mean();
    System.out.println(dMean);
    System.out.println("Returning Standard Deviation: ");
    standardDeviation();
    System.out.println(dSd);

  }

  /**
   * iMeanCalc - Calculates mean deviation
   * 
   * @param args
   */
  public static double mean()
  {
    // loop calculates the Mean Deviation using formula provided
    // passes the araay of integer values to
    int iLoop;
    for (iLoop = 0; iLoop < iArray.length - 1; iLoop++)
    {
      dMean += iArray[iLoop];
    }
    dSum = dMean;
    dMean /= iArray.length;
    return dMean;
  }

  /**
   * iStandardCalc - Calculates standard deviation
   * 
   * @param args
   */
  public static double standardDeviation()
  {
    dSd = Math.sqrt(Math.pow(dSum - dMean, 2));
    return dSd;
  }

}
