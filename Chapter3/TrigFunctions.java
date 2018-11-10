package chapter3;

/**
 * TrigFunctions.java
 *
 * Code Description: Calculates sine cosine and tangent of a random number.
 * @author Jacob Robbins
 * @version 11/9/18
 * @contact 1002127@palisadessd.net
 */

import java.util.Random; //imports random class

public class TrigFunctions
{

  /**
   * main method - Calculates the sine, cosine and tangent of a random integer.
   * 
   * @param args
   */

  public static void main(String[] args)
  {

    // initializes random object
    Random gen = new Random();

    // initializes an integer with random value between 20 and 40
    int iRand = gen.nextInt(20) + 20;

    // prints to the console the sine, cosine and tangent of the random integer
    System.out.println("Sine: " + Math.sin(iRand));
    System.out.println("Cosine: " + Math.sin(iRand));
    System.out.println("Tangent: " + Math.cos(iRand));

  }
}