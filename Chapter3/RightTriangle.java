package chapter3;

/**
 * RightTriangle.java
 *
 * Code Description: Prompts users for two sides of a right triangle
 * then calculates the hypotenuse.
 * @author Jacob Robbins
 * @version 11/9/18
 * @contact 1002127@palisadessd.net
 */

import java.util.Scanner; //import the Scanner class

public class RightTriangle
{
  /**
   * main method - Prompts users for two sides of a right triangle then
   * calculates the hypotenuse.
   * 
   * @param args
   */
  public static void main(String[] args)
  {
    // initializing scanner
    Scanner kb = new Scanner(System.in);

    // creating doubles for the user inputted sides of a right tirangle
    double dSideOne, dSideTwo;

    // creates a double for the hypotenuse's length
    double dHypotenuse;

    // prompts the user for triangle side lengths and stores them as doubles
    System.out.println(
        "Welcome to the hypotenuse calculator. Enter one side of a right triangle:");
    dSideOne = kb.nextDouble();
    System.out.println("Enter the other side of the right triangle.");
    dSideTwo = kb.nextDouble();

    // calculating the hypotenuse
    dHypotenuse = Math.sqrt(Math.pow(dSideOne, 2) + Math.pow(dSideTwo, 2));

    // prints to console the length of the hypotenuse
    System.out.println("The hypotenuse is: " + dHypotenuse);

    // closing the scanner class
    kb.close();
  }
}