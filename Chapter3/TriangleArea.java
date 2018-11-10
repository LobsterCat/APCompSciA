package chapter3;

/**
 * TriangleArea.java
 *
 * Code Description: Computes area of a triangle.
 * @author Jacob Robbins
 * @version 11/9/18
 * @contact 1002127@palisadessd.net
 */

import java.util.Scanner; //import the Scanner class

public class TriangleArea
{
  /**
   * main method - Prompts the user for sides of a triangle to calculate its
   * area
   * 
   * @param args
   */
  public static void main(String[] args)
  {
    // initializing scanner
    Scanner kb = new Scanner(System.in);

    // declares doubles to store the user's input (triangle side lengths)
    double dSideOne, dSideTwo, dSideThree;

    // declares doubles to store components of the equation
    double dArea, dHalfPerimeter, dAlmostDone;

    // prompting the user for the lengths of each side of the triangle
    System.out.println(
        "I can calculate the area of a triangle if you give me the three side lengths!");
    System.out.println("Enter the legnth of side one then press enter: ");
    dSideOne = kb.nextDouble();
    System.out.println("Enter the legnth of side two then press enter: ");
    dSideTwo = kb.nextDouble();
    System.out.println("Enter the legnth of side three then press enter: ");
    dSideThree = kb.nextDouble();

    // calculates half of the perimeter of the triangle
    dHalfPerimeter = (dSideOne + dSideTwo + dSideThree) / 2;

    // does most of the equation for finding triangle's area
    dAlmostDone = dHalfPerimeter * (dHalfPerimeter - dSideOne)
        * (dHalfPerimeter - dSideTwo) * (dHalfPerimeter - dSideThree);

    // calculates the area of the triangle using above variable
    dArea = Math.sqrt(dAlmostDone);

    // closing the scanner class
    kb.close();
  }
}