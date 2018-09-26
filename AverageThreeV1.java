/**
 * AverageThreeV1.java
 *
 * Code Description: This code takes three predetermined integers and gets the 
 * whole number average of them. 
 *    
 * @author Jacob Robbins
 * @version 9/26/18
 * @contact 1002127@palisadessd.net
 */

public class AverageThreeV1
{
  /**
   * main method - The main method is used to find an average of three predetermined integers.
   * @param args
   */
  public static void main (String[] args)
  {
	//declaring the three integers that will be averaged
	final int iIntegerOne, iIntegerTwo, iIntegerThree;
	
	//assigning values to each of the three integers
	iIntegerOne = 7; iIntegerTwo = 3; iIntegerThree = 21;
	
    //prints the average the three integers as a whole number
    System.out.println((iIntegerOne + iIntegerTwo + iIntegerThree) / 3);
  }
}
