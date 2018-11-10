package chapter3;

/**
 * CylinderCalculations.java
 *
 * Code Description: Calculates and prints the volume 
 * and surface area of a cylinder.
 * @author Jacob Robbins
 * @version 11/9/18
 * @contact 1002127@palisadessd.net
 */

import java.util.Random; //imports random class

public class CylinderCalculations
{

  /**
   * main method - Calculates and prints the volume and surface area of a
   * cylinder.
   * 
   * @param args
   */

  public static void main(String[] args)
  {

    // initializes a random object
    Random gen = new Random();

    // declares doubles for the volume and surface area of the cylinder
    double dVolume, dSurfaceArea;

    // initializes doubles for the radius and height (random integers)
    double dRadius = gen.nextInt(19) + 1;
    double dHeight = gen.nextInt(19) + 1;

    // calculates the volume and surface area of the randomly generated cylinder
    dVolume = Math.PI * Math.pow(dRadius, 2) * dHeight;
    dSurfaceArea = 2 * Math.PI * dRadius * dHeight;

    // prints to the user the radius and height of the randomly generated
    // cylinder
    System.out.println("Generating random cylinder dimensions...");
    System.out.println();
    System.out.println("A cylider with radius " + dRadius + " and height "
        + dHeight + " has these dimensions: ");
    System.out.println();

    // prints to the console the results of the calculations
    System.out.println("Volume of the cylinder: " + dVolume);
    System.out.println("Surface area of the cylinder: " + dSurfaceArea);

  }
}