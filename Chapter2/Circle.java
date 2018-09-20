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
    double dAreaTwo, dCircumferenceTwo;
    
    //variable declaration and initialization for the growths of the area and circumference
    double dAreaGrowth, dCircumferenceGrowth;
    
    // variable declaration and initialization for calculating circumference
    double dCircumference = 2 * dPI * iRadius;

    // print the information for the first circle
    System.out.println("The area of a circle with radius " + iRadius +
      " is " + dArea);
    System.out.println("The circumference of a circle with radius " + iRadius + " is " + dCircumference);

    // change the radius, area and circumference and making new variables
    iRadius = 20;
    dAreaTwo = dPI * iRadius * iRadius;
    dCircumferenceTwo = 2 * dPI * iRadius;
    
    // printing the second circle's values
    System.out.println("The area of a circle with radius " + iRadius +
      " is " + dAreaTwo);
    System.out.println("The circumference of a circle with radius " + iRadius + " is " + dCircumferenceTwo);
    
    // setting the variable for the growth of the area and circumference
    dAreaGrowth = dArea / dAreaTwo;
    dCircumferenceGrowth = dCircumference / dCircumferenceTwo;
    
    // printing the growth in area and the growth in circumference
    System.out.println("The growth of the area is " + dAreaGrowth);
    System.out.println("The growth of the circumference is " + dCircumferenceGrowth);
  }
}
