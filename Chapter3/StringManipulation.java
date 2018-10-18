
/**
 * StringManipulation.java
 *
 * Code Description: Test several methods for manipulating String objects
 *    
 * @author Jacob Robbins
 * @version 10/16/18 10/18/18
 * @contact 1002127@palisadessd.net
 */

import java.util.Scanner; //import Scanner class

public class StringManipulation
{
  /**
   * main method - Test several methods for manipulating String objects
   * 
   * @param args
   */
  public static void main(String[] args)
  {
    // Declare variables to be used for String manipulations
    String sPhrase = new String("This is the String test.");
    int iPhraseLength;
    int iMiddleIndex;
    int iLeftBound;
    int iRightBound;
    String sFirstHalf;
    String sSecondHalf;
    String sSwitchedPhrase;
    String sMiddleThree;

    // declaring sCity and sState for part 3
    String sCity;
    String sState;

    // declaring a scanner for user's
    // city and state
    Scanner kb = new Scanner(System.in);

    // compute the length and middle index of the phrase
    iPhraseLength = sPhrase.length();
    iMiddleIndex = iPhraseLength / 2;

    // variables for finding the middle 3 characters
    iLeftBound = iPhraseLength / 2 - 1;
    iRightBound = iPhraseLength / 2 + 2;

    // get the substring for each half of the phrase
    sFirstHalf = sPhrase.substring(0, iMiddleIndex);
    sSecondHalf = sPhrase.substring(iMiddleIndex, iPhraseLength);

    // get the substring for the middle of sPhase
    sMiddleThree = sPhrase.substring(iLeftBound, iRightBound);

    // concatenate the sFirstHalf at the end of the sSecondHalf
    sSwitchedPhrase = sSecondHalf.concat(sFirstHalf);

    // replacing white space with asterisks for sSwitchedPhrase
    sSwitchedPhrase = sSwitchedPhrase.replace(' ', '*');

    // print information about the phrase
    System.out.println();
    System.out.println("Original phrase: " + sPhrase);
    System.out
        .println("Length of the phrase: " + iPhraseLength + " characters");
    System.out.println("Index of the middle: " + iMiddleIndex);
    System.out.println(
        "Character at the middle index: " + sPhrase.charAt(iMiddleIndex));
    System.out.println("The middle three characters are: " + sMiddleThree);
    System.out.println("Switched phrase: " + sSwitchedPhrase);
    System.out.println();

    // prompting and recording user imput
    System.out.print("Now enter the state you live in: ");
    sState = kb.nextLine();
    System.out.println("Now enter the city you live in: ");
    sCity = kb.nextLine();

    // prints user's state in all caps twice
    // prints user's city in lowercase in between
    System.out.println(
        sState.toUpperCase() + sCity.toLowerCase() + sState.toUpperCase());

  }
}
