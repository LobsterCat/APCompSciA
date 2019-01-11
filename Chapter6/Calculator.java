import java.util.Scanner; // imports Scanner class
import java.text.DecimalFormat; // imports DecimalFormat class

/**
 * Calculator.java
 *
 * Code Description: A program that plays the high low game with the user.
 * 
 * @author Jacob Robbins
 * @version 1/7/19
 * @contact 1002127@palisadessd.net
 */
public class Calculator
{
  /**
   * main method - Creates a random number and plays a guessing game with the
   * user.
   * 
   * @param args
   */
  public static void main(String[] args)
  {
    // creating a string to hold what operation the user wants to do
    String sOperator;
    // creates numbers to calculate what the user wants to do
    double dNumOne, dNumTwo;
    
    // insures that the number in the tenthes place is always shown
    DecimalFormat fmt = new DecimalFormat("0.0");
    
    // initializes a double to calculate result
    double dResult = 5.0;
    
    // initializing Scanner
    Scanner kb = new Scanner(System.in);

    // reads user input for 2 doubles
    System.out.print("Enter two numbers, with a space between each: ");
    dNumOne = kb.nextDouble();
    dNumTwo = kb.nextDouble();

    // reads user input for what operation to do
    System.out.print("Enter the operator (+, -, *, or /): ");
    sOperator = kb.next();

    // Add a switch statement here to perform the correct calculation
    // and print it and the result for the user.
    // Make sure to include a default case if the user enters an invalid option
    switch (sOperator)
    {
    case "+":
      sOperator = "+";
      dResult = dNumOne + dNumTwo;
      break;
    case "-":
      sOperator = "-";
      dResult = dNumOne - dNumTwo;
      break;
    case "*":
      sOperator = "*";
      dResult = dNumOne * dNumTwo;
      break;
    case "/":
      sOperator = "/";
      dResult = dNumOne / dNumTwo;
      break;
    default: 
      sOperator = "Invalid Operator";
      break;
    }
    // prints result to console
    System.out.println(dNumOne + " " + sOperator + " " + dNumTwo + " = " + dResult);
  }
}
