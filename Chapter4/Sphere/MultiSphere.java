
/**
 * MultiSphere.java
 *
 * Code Description: 
 * 
 * @author Jacob Robbins
 * @version 11/21/18
 * @contact 1002127@palisadessd.net
 */

import java.util.Scanner; // imports Scanner class

public class MultiSphere
{
  /**
   * main method - Creates two instances of the Sphere.java class and tests all
   * functions.
   * 
   * @param args
   */

  // declaring variables for user input
  private static int iDiameterTwo;
  private static String sInput;

  public static void main(String[] args)
  {

    // declaring two object reference variables
    Sphere sphereOne, sphereTwo;
    
    // initializing a scanner for user input
    Scanner kb = new Scanner(System.in);

    // instantiate the two object reference variables
    sphereOne = new Sphere();
    sphereTwo = new Sphere();

    // printing to console, prompts for user input
    // uses the scanner to prompt the user
    // calculates and uses methods from both object reference variables
    System.out.println("Enter a sphere's diameter then press enter.");
    iDiameterTwo = kb.nextInt();
    sphereOne.setDiameter(iDiameterTwo);
    System.out.println(
        "Setting the sphere's diameter to: " + sphereOne.getDiameter());
    System.out.println();
    System.out.println(
        "The sphere's volume with that diameter is: " + sphereOne.volume());
    System.out.println("The sphere's surface area with that diameter is: "
        + sphereOne.surfaceArea());
    System.out.println();
    System.out.println(
        "Now I will create dimensions for a sphere. Type \"String\" into the"
        + " console then press enter to read about my sphere.");
    sphereTwo.setDiameter(115);
    sInput = kb.next();
    if (sInput.equalsIgnoreCase("string"))
    {
      sphereTwo.volume();
      sphereTwo.surfaceArea();
      System.out.println(sphereTwo.toString());
    }

    kb.close(); // closing scanner object
  }
}
