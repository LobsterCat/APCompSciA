/**
 * ExpressionsLab.java
 *
 * Code Description: I declare all of the variables used in the 2.4 Lab Questions
 * and then I do various calculations with the numbers provided in the lab. This
 * allows me to compare the answers I chose with the answers that the java compiler
 * would actually output.
 *    
 * @author Jacob Robbins
 * @version 9/25/18
 * @contact 1002127@palisadessd.net
 */

public class ExpressionsLab
{
  /**
   * main method -  The main method is used for declaring all of the variables that
   *     			are used in the lab and then prints values to the console
   *     			that simulate how the java compiler would solve the equations.
   * @param args
   */
  public static void main (String[] args)
  {
    // initializing all of the integers that will be used to test my answers
	// in the 2.4 Lab
    int iDiameter, iResult, iBase, iWeight, iNumOne, iNumTwo, result;

    // initializing all of the doubles required to test my answers
    // from the 2.4 Lab 
    double dResult, dValOne, dValTwo, value; 
    
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
    // result = ( 5 + 2 * (15 - 3);
    // result = ( 5 + 2 (;
    // result = ( 5 + 2 ( 4 ) );
    System.out.println();
    System.out.println("Answers for Number 6");
    System.out.println(iResult = 27);
    System.out.println(iResult = iResult + 3);
    System.out.println(iResult = iResult / 7);
    System.out.println(iResult = iResult * 2);
    
    // using the pre-defined variables to check if my calculations were
    // correct for number 7
    System.out.println();
    System.out.println("Answers for Number 7");
    // these don't compile being set as null
    // System.out.println(iBase); 
    // System.out.println(iResult);
    System.out.println(iBase = 5);
    System.out.println(iResult = iBase + 3);
    System.out.println(iBase = 7);
    
    // checking answers for if the value will change from int to double
    // for questions 10 and 11
    value = 0.0;
    System.out.println();
    System.out.println("Questions 10 and 11 Checks");
    // System.out.println(result = value);
    System.out.println(value = (int) result);
    
    // question 12 had various equations combining the use of integers
    // and doubles so this will be a good check to see if my answers
    // were the correct values as well as the correct numbers
    iNumOne = 17;
    iNumTwo = 5;
    dValOne = 12.0;
    dValTwo = 2.34;
    System.out.println();
    System.out.println("Question 12 Answers");
    System.out.println(iResult = iNumOne / iNumTwo);
    System.out.println(dResult = iNumOne / iNumTwo);
    System.out.println(dResult = dValOne / iNumTwo);
    System.out.println(dResult = (double) iNumOne / iNumTwo);
    System.out.println(iResult = (int) dValOne / iNumTwo);
  }
}
