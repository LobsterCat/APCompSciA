package chapter3;

/**
 * UsernameGenerator.java
 *
 * Code Description: Prompts user's for their first and last names.
 * Prints out an edited version with various characters attached.
 * @author Jacob Robbins
 * @version 11/7/18
 * @contact 1002127@palisadessd.net
 */

import java.util.Scanner; //import the Scanner class
import java.util.Random; //import Random class

public class UsernameGenerator
{
  /**
   * main method - Prompts user's for their first and last names. Prints out an
   * edited version with various characters attached.
   * 
   * @param args
   */
  public static void main(String[] args)
  {
    // initializing scanner
    Scanner kb = new Scanner(System.in);

    // creating strings for user input
    String sFirstName, sLastName;

    // creating an integer to hold the random value;
    int iRand;

    // creating a random object
    Random gen = new Random();

    // setting the integer to a random value between 10 and 99
    iRand = gen.nextInt(89) + 10;

    // prompting the user for their name
    // and recording their response
    System.out.println("Type your first name then press enter.");
    sFirstName = kb.nextLine();
    System.out.println("Type your last name then press enter.");
    sLastName = kb.nextLine();

    // printing out the manipulated string of their names with a random integer
    System.out
        .println(sFirstName.charAt(0) + sLastName.substring(0, 4) + iRand);

    // closing the scanner class
    kb.close();
  }
}