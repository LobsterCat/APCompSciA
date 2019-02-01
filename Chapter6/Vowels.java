import java.util.Scanner; // importing Scanner class

/**
 * Vowels.java
 *
 * Code Description: Reads a String form the user and prints
 * how many vowels appear in the entire String. Includes how
 * many of each vowel occurs as well as the # of non-vowels.
 * 
 * @author Jacob Robbins
 * @version 2/1/19
 * @contact 1002127@palisadessd.net
 */

public class Vowels
{
  /**
   * main method - Uses a for loop to record each individual
   * character from the String, which is then check in the
   * Switch statement to test whether the character meets
   * the vowel cases.
   * 
   * @param args
   */

  public static void main(String[] args)
  {
    
    // integers to store how many of each value has been added
    int iVowels = 0, iNonVowels = 0, 
        iA = 0, iE = 0, iI = 0, iO = 0, iU = 0;
    
    int iCount; // for for loop
    
    String sInput = ""; // for Scanner's input
    Scanner kb = new Scanner(System.in); // initializing Scanner class
    // prompts the user to enter a String
    System.out.println("Enter any phrase or letter sequence then press enter"
        + " and I shall count the vowels.");
    sInput = kb.nextLine(); // input
   
    // loops until the entire phrase has been checked
    for(iCount = 0; iCount < sInput.length(); iCount++){
      char cLetter = sInput.charAt(iCount); // character within phrase
      
      // switch statement for each case
      // in hindsight i did not need most of these cases after
      // adding the default case, but it just seemed too pretty to delete
      switch(cLetter) {
      
      case 'A': iNonVowels++; break;
      case 'B': iNonVowels++; break;
      case 'C': iNonVowels++; break; 
      case 'D': iNonVowels++; break;
      case 'E': iNonVowels++; break;
      case 'F': iNonVowels++; break;
      case 'G': iNonVowels++; break;
      case 'H': iNonVowels++; break;
      case 'I': iNonVowels++; break;
      case 'J': iNonVowels++; break;
      case 'K': iNonVowels++; break;
      case 'L': iNonVowels++; break;
      case 'M': iNonVowels++; break;
      case 'N': iNonVowels++; break;
      case 'O': iNonVowels++; break;
      case 'P': iNonVowels++; break;
      case 'Q': iNonVowels++; break;
      case 'R': iNonVowels++; break;
      case 'S': iNonVowels++; break;
      case 'T': iNonVowels++; break;
      case 'U': iNonVowels++; break;
      case 'V': iNonVowels++; break;
      case 'W': iNonVowels++; break;
      case 'X': iNonVowels++; break;
      case 'Y': iNonVowels++; break;
      case 'Z': iNonVowels++; break;
      case 'a': iVowels++; iA++; break;
      case 'b': iNonVowels++; break;
      case 'c': iNonVowels++; break;
      case 'd': iNonVowels++; break;
      case 'e': iVowels++; iE++; break;
      case 'f': iNonVowels++; break;
      case 'g': iNonVowels++; break;
      case 'h': iNonVowels++; break;
      case 'i': iVowels++; iI++; break;
      case 'j': iNonVowels++; break;
      case 'k': iNonVowels++; break;
      case 'l': iNonVowels++; break;
      case 'm': iNonVowels++; break;
      case 'n': iNonVowels++; break; 
      case 'o': iVowels++; iO++; break;
      case 'p': iNonVowels++; break;
      case 'q': iNonVowels++; break; 
      case 'r': iNonVowels++; break;
      case 's': iNonVowels++; break;
      case 't': iNonVowels++; break;
      case 'u': iVowels++; iU++; break;
      case 'v': iNonVowels++; break;
      case 'w': iNonVowels++; break;
      case 'x': iNonVowels++; break;
      case 'y': iNonVowels++; break;
      case 'z': iNonVowels++; break;
      default: iNonVowels++; break;

      
      }
    }
    
    // prints to console the correct # of each specification
    System.out.println("Number of vowels: " + iVowels);
    System.out.println("A's : " + iA);
    System.out.println("E's : " + iE);
    System.out.println("I's : " + iI);
    System.out.println("O's : " + iO);
    System.out.println("U's : " + iU);
    System.out.println("Number of non-vowels: " + iNonVowels);
    
    
    kb.close(); // closes Scanner
  }
}
