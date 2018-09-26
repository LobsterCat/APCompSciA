/**
 * FloatCalculations.java
 *
 * Code Description: Calculates and prints the sum, difference and product of two floating point numbers.
 *    
 * @author Jacob Robbins
 * @version 9/26/18
 * @contact 1002127@palisadessd.net
 */

public class FloatCalculations
{
  /**
   * main method - 
   * @param args
   */
  public static void main (String[] args)
  {
	//initializing the two doubles
	final double dNumberOne = 2.72, dNumberTwo = 3.1415926;
	
    //prints and calculates the sum, difference, and product of the two doubles
    System.out.println("Sum of two doubles: " + (dNumberOne + dNumberTwo));
    System.out.println("Difference of two doubles: " + (dNumberTwo - dNumberOne));
    System.out.println("Product of two doubles: " + dNumberOne * dNumberTwo);
  }
}
