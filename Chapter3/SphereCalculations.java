package chapter3;

/**
 * SphereCalculations.java
 *
 * Code Description: Calculates and prints the volume 
 * and surface area of a sphere
 * @author Jacob Robbins
 * @version 11/9/18
 * @contact 1002127@palisadessd.net
 */

import java.util.Scanner; //import the Scanner class
import java.text.DecimalFormat; //import the DecimalFormat class

public class SphereCalculations
{
  /**
   * main method - Calculates and prints the volume and surface area of a sphere
   * 
   * @param args
   */
  public static void main(String[] args)
  {
    // initializing scanner
    Scanner kb = new Scanner(System.in);

    // declares doubles for the volume and surface area of the sphere
    double dVolume, dSurfaceArea;

    // declares doubles for the radius (user input)
    double dRadius;

    // initializes a decimal format for rounding to the first 4 decimal places
    DecimalFormat fmtDecimal = new DecimalFormat("0.0###");

    // prompts user for radius of a sphere
    System.out.println(
        "Enter the radius of a sphere to calculate its volume and surface area.");
    dRadius = kb.nextDouble();

    // calculates the volume of the sphere using its radius
    dVolume = 4 / 3 * Math.PI * (Math.pow(dRadius, 3));

    // calculates the surface area of the sphere
    dSurfaceArea = 4 * Math.PI * (Math.pow(dRadius, 3));

    // prints to the console the volume and surface area of a sphere
    // with radius r (user input)
    System.out.println("Volume of the sphere: " + fmtDecimal.format(dVolume));
    System.out.println(
        "Surface area of the sphere: " + fmtDecimal.format(dSurfaceArea));

    // closing the scanner class
    kb.close();
  }
}