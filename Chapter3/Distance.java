
/**
 * Distance.java
 *
 * Code Description: Computes the distance between two points
 *    
 * @author Jacob Robbins
 * @version 10/18/18
 * @contact 1002127@palisadessd.net
 */

import java.util.Scanner; //import Scanner class

public class Distance
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

    // prompts the user for coordinates of point #1
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

    // prints out the answer
    System.out
        .println("The distance between point one and two is " + dDistance);

    kb.close(); // closes Scanner class
  }
}
