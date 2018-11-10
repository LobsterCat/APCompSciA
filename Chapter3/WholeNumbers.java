package chapter3;

/**
 * WholeNumbers.java
 *
 * Code Description: Reads floating points and prints which numbers it falls
 * between.
 * 
 * @version 11/9/18
 * @contact 1002127@palisadessd.net
 */

public class WholeNumbers
{
  /**
   * main method - Reads floating points and prints which numbers it falls
   * between.
   * 
   * @param args
   */
  public static void main(String[] args)
  {
    // establishing a floating point value
    Double dwFloatingPoint = 48.4893;

    // creating ints for the numbers the floating point falls between
    int iLower, iHigher;

    // setting the lower digit and the higher digit that the # is between
    iLower = (int) Math.floor(dwFloatingPoint);
    iHigher = (int) Math.ceil(dwFloatingPoint);

    // prints to the console the numbers the floating point falls between
    System.out.println(
        "The floating point is between integers " + iLower + " and " + iHigher);

  }

}
