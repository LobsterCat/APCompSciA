package chapter3;

/**
 * SumOfCubes.java
 *
 * Code Description: Prompts for and read two integer values and, 
 * using the Math class, calculate and print the sum of each value
 * raised to the third power.
 * @author Jacob Robbins
 * @version 11/9/18
 * @contact 1002127@palisadessd.net
 */

import java.util.Scanner; //import the Scanner class

public class SumOfCubes
{
  /**
   * main method - Prompts for and read two integer values and, using the Math
   * class, calculate and print the sum of each value raised to the third power.
   * 
   * @param args
   */
  public static void main(String[] args)
  {
    // initializing scanner
    Scanner kb = new Scanner(System.in);

    // creating 2 ints for user input
    int iIntegerOne, iIntegerTwo;

    // creating doubles for the math.pow
    double dIntOne, dIntTwo;

    // prompts user for 2 integers
    System.out
        .println("Please enter an integer with the numpad then press enter.");
    iIntegerOne = kb.nextInt();
    System.out.println(
        "Now enter another integer with the numpad and press enter after.");
    iIntegerTwo = kb.nextInt();

    // setting the doubles equal to user input
    dIntOne = iIntegerOne;
    dIntTwo = iIntegerTwo;

    // prints and calculates the sum of each cube
    System.out.println("The sum of each value raised to the third power:");
    System.out.println(Math.pow(dIntOne, 3.0) + Math.pow(dIntOne, 3.0));

    // closing the scanner class
    kb.close();
  }
}