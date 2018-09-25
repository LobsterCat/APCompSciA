/**
 * ExpressionsLab.java
 *
 * Code Description: This is the place where you will give a reasonable
 * amount of information about your code that helps the reader understand
 * what the code should do.
 *    
 * @author Jacob Robbins
 * @version 9/25/18
 * @contact 1002127@palisadessd.net
 */

public class ExpressionsLab
{
  /**
   * main method - 
   * @param args
   */
  public static void main (String[] args)
  {
    // initializing all of the integers that will be used to test my answers
	// in the 2.4 Lab
    int iDiameter, iResult, iBase, iWeight, iNumOne, iNumTwo, result;

    // initializing all of the doubles required to test my answers
    // from the 2.4 Lab 
    double dResult, dValOne, dValTwo; 
    
    // testing questions 1-3 and comparing my answers
    iDiameter = 5;
    System.out.println(19 % 5);
    System.out.println(13 / 4);
    System.out.println(iDiameter = iDiameter * 4);
    
    // checking my answers for number 4 in the 2.4 lab
    System.out.println();
    System.out.println("Question 4 Answers");
    System.out.println(15 + 7 * 3);
    System.out.println((15 + 7) * 3);
    System.out.println(3 * 6 + 10 /5 +5);
    System.out.println(27 % 5 + 7 % 3);
    System.out.println(100 /2 /2 /2);
    System.out.println(100 / (2 / 2) /2);
    
    // checking answers for questions 5 and 6
    // if a line of code is commented out, then it failed to compile
    result = ( 5 + 2 );
    //result = ( 5 + 2 * (15 - 3);
    //result = ( 5 + 2 (;
    //result = ( 5 + 2 ( 4 ) );
    System.out.println();
    System.out.println("Answers for Number 6");
    System.out.println(iResult = 27);
    System.out.println(iResult = iResult + 3);
    System.out.println(iResult = iResult / 7);
    System.out.println(iResult = iResult * 2);
    
  }
}
