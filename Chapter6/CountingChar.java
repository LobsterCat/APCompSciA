
/**
 * CountingChar.java
 *
 * Code Description: Counts the number of blanks spaces
 * from the user's input.
 * 
 * @author Jacob Robbins
 * @version 1/15/19
 * @contact 1002127@palisadessd.net
 */

import java.util.Scanner; // import Scanner class

public class CountingChar
{
  /**
   * main method -Creates variables and loops to check how many spaces are in
   * the String sPhrase
   * 
   * 
   * @param args
   */
  public static void main(String[] args)
  {
    // initializing Scanner for user input
    Scanner kb = new Scanner(System.in);

    boolean bFlag = true; // checks if the user enters quit, starts at true

    while (bFlag)
    {
      String sPhrase; // a string of characters
      int iLength; // the length of the phrase
      char cChar; // an individual character in the string
      int iC; // an integer for the for loop
      int iSpaces; // integer for counting spaces

      // introduces the user
      System.out.println();
      System.out.println("Character Counter");
      System.out.println();

      // tells user that "quit" quits the program
      System.out.print("Enter a sentence or phrase (Enter \"quit\" to quit): ");
      sPhrase = kb.nextLine();
      iLength = sPhrase.length();

      // sets the number of spaces to 0 for a new word
      iSpaces = 0;

      // a for loop to go through the string character by character
      // and count the blank spaces
      for (iC = 0; iC < iLength; iC++)
      {
        if (sPhrase.charAt(iC) == ' ') // checks if there is a space at the current index
        {
          iSpaces++;
        }
      }
      
      // prints the number of blanks spaces to the console
      System.out.println();
      System.out.println("Number of blank spaces: " + iSpaces);
      System.out.println();

      if (sPhrase.equals("quit"))
      {
        bFlag = false;

      }
    }

    kb.close(); // closing Scanner object
  }
}
