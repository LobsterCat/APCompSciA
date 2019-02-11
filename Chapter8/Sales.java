import java.util.Scanner; // imports Scanner class

/**
 * Sales.java
 *
 * Code Description: Prints the minimum, maximum, and average sales in $ of a
 * specified amount of salespersons.
 * 
 * @author Jacob Robbins
 * @version 2/5/19 2/11/19
 * @contact 1002127@palisadessd.net
 */

public class Sales
{
  /**
   * main method - Uses loops and integers to calculate and store various pieces
   * of memory to report statistics at the end of the program. Prompts user with
   * Scanner object and prints to the console.
   * 
   * 
   * @param args
   */
  public static void main(String[] args)
  {

    int iSum, iAverage, iMax = 0, iMin = 240000000; // ints for calculation,
    // min is set to 240 million (since sales will not exceed this)
    // integers used to store the lowest and higher salespersons
    int iBestPerson = 1, iWorstPerson = 1;
    int iIndex, iSalesPeople;
    int iSalesExceed;
    int iL, iExceeded = 0; // used for for loop

    // prompts user for how many salespersons
    System.out.println("Welcome to the sales person evaluator.");
    System.out.println("How many salespersons do you have?");
    Scanner kb = new Scanner(System.in); // initializing scanner

    // scanner gets how many salespersons there are
    iSalesPeople = kb.nextInt();
    int[] iSales = new int[iSalesPeople];

    // loops to prompt user for dollars sold from each salesperson
    for (iIndex = 0; iIndex < iSales.length; iIndex++)
    {
      System.out.print("Enter sales for salesperson " + (iIndex + 1) + ": $");
      iSales[iIndex] = kb.nextInt();
    }
    // formats the statistics for the user
    System.out.println("\n  Sales Report");
    System.out.println(" ------------------ ");

    iSum = 0; // initialized as $0 for the sum

    // loops to calculate sum, max, and min values
    for (iIndex = 0; iIndex < iSales.length; iIndex++)
    {
      System.out.println(" " + (iIndex + 1) + " $" + iSales[iIndex]);
      iSum += iSales[iIndex];
      // loops to find maximum
      if (iSales[iIndex] > iMax)
      {
        iMax = iSales[iIndex];
        iBestPerson = iIndex + 1;
      }
      // loops to find minimum
      if (iSales[iIndex] < iMin)
      {
        iMin = iSales[iIndex];
        iWorstPerson = iIndex + 1;
      }
    }

    // calculates the average sales
    // prints a bunch of statistics to the console
    iAverage = iSum / iSalesPeople;
    System.out.println("\nTotal sales: $" + iSum);
    System.out.println("Average Sales: $" + iAverage);
    System.out.println();
    System.out.println(
        "Salesperson " + iBestPerson + " had the highest sales with $" + iMax);
    System.out.println(
        "Salesperson " + iWorstPerson + " had the lowest sales with $" + iMin);
    System.out.print(
        "Now Enter a value in $ to see which salespersons exceeded that amount: $");
    iSalesExceed = kb.nextInt();

    // checks if 0 people exceed max
    if (iSalesExceed > iMax)
      System.out.println("Nobody exceeded that amount.");
    else
      System.out.println("Those who exceeded that amount: ");

    // extra loop to check who exceeded amount entered
    for (iL = 0; iL < iSales.length; iL++)
    {
      if (iSales[iL] > iSalesExceed)
      {
        System.out.println("Salesperson " + (iL + 1));
        iExceeded++;
      }
      // prints the total # of sales people who exceeded amount entered
      System.out.println(
          "In total, " + iExceeded + " salespersons exceeded that amount.");
    }

    kb.close(); // closing Scanner
  }
}
