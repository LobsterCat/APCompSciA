/**
 * TravelTimeV1.java
 *
 * Code Description:  Initializes for speed and distance traveled,
 *  then prints the time required for the trip as a floating point (decimal) result.
 *    
 * @author Jacob Robbins
 * @version 9/26/18
 * @contact 1002127@palisadessd.net
 */

public class TravelTimeV1
{
  /**
   * main method - Initializes for speed and distance traveled,
   * then prints the time required for the trip as a floating point (decimal) result.
   * @param args
   */
  public static void main (String[] args)
  {
	//declares a variable for time
	double dTime;
	  
    // initializing variables for speed and distance
    final double dSpeed = 30, dDistance = 480;
    
    //calculates how much time it took using speed and distance (d/v = t)
    dTime = dDistance/dSpeed;    
    
    //prints to the console the values of the three variables
    System.out.println("When going " + dSpeed + " meters per second for " + dDistance + " meters it takes " +
    		dTime + " seconds.");
  }
}
