/**
 * MileToKilometersV1.java
 *
 * Code Description: Calculates and prints to the console how many kilometers
 * are in a specified number of miles.
 *    
 * @author Jacob Robbins
 * @version 9/26/18
 * @contact 1002127@palisadessd.net
 */

public class MileToKilometersV1
{
  /**
   * main method - Calculates and prints to the console how many kilometers
   * are in a specified number of miles.
   * @param args
   */
  public static void main (String[] args)
  {
    // declaring variables for kilometers and miles
    final double dKilometers, dMiles;
    
    //sets constant for converting to kilometers
    final double dConversion = 1.60935;
    
    //assigns a value for miles
    dMiles = 50;

    // calculates how many kilometers are in the number of miles
    dKilometers = dMiles * dConversion;
    
    //prints to the console the conversion
    System.out.println("There are " + dKilometers + " kilometers in " + dMiles + " miles.");
  }
}
