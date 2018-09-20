package Chapter2;
/**
 * Circle.java
 *
 * Code Description: Print the area of a circle with two different radii
 *    
 * @author Jacob Robbins
 * @version 9/20/18
 * @contact 1002127@palisadessd.net
 */

public class Circle
{
  /**
  * main method - Print the area of a circle with two different radii
  * @param args
  */
  public static void main(String[] args)
  {
    // constant variable for the value of PI
    final double dPI = 3.14159;

    // variable declarations and initializations to calculate area of circle
    int iRadius = 10;
    double dArea = dPI * iRadius * iRadius;

    // print the information for the first circle
    System.out.println("The area of a circle with radius " + iRadius +
      " is " + dArea);

    // change the radius and print the information for the second circle
    iRadius = 20;
    dArea = dPI * iRadius * iRadius;
    System.out.println("The area of a circle with radius " + iRadius +
      " is " + dArea);
  }
}
