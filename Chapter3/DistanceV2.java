
/**
 * DistanceV2.java
 *
 * Code Description: Computes the distance between two points 
 *    
 * @author Jacob Robbins
 * @version 10/26/18
 * @contact 1002127@palisadessd.net
 */

import java.util.Scanner; //import Scanner class
import java.text.DecimalFormat; //import DecimalFormat class

public class DistanceV2
{

  /**
   * main method - Computes the distance between two points
   * 
   * @param args
   */

  public static void main(String[] args)
  {
    // declaring doubles for the coordinates and total distance
    double dXOne, dYOne, dXTwo, dYTwo;
    double dDistance;

    // declaring variables to help with computations
    double dXDistance, dYDistance;

    // initializing a scanner
    Scanner kb = new Scanner(System.in);

    // initializing formatting guidelines for the
    // numbers to be output
    DecimalFormat fmtDecimal = new DecimalFormat("0.00###");

    // prompts the user for coordinates of point #1
    // stores the user's input as a double
    System.out.print("Enter the coordinates of the first point "
        + "(put a space between them): ");
    dXOne = kb.nextDouble();
    dYOne = kb.nextDouble();

    // prompts the user for coordinates of point #2
    System.out.print("Enter the coordinates of the second point: ");
    dXTwo = kb.nextDouble();
    dYTwo = kb.nextDouble();

    // Computes the distance
    // calculates difference for the x values first
    dXDistance = dXOne - dXTwo;

    // calculates the difference for the y values
    dYDistance = dYOne - dYTwo;

    // calculates the total distance
    dDistance = Math.sqrt(dXDistance * dXDistance + dYDistance * dYDistance);

    // prints out the answer with no more than 5 decimal values
    System.out.println("The distance between point one and two is: "
        + fmtDecimal.format(dDistance));
    
    //tells the user how many decimal places there are
    System.out.println();
    System.out.println("Rounds to the nearest 5 decimals");

    kb.close(); // closes Scanner class
  }
}
