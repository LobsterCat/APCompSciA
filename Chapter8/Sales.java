import java.util.Scanner;

/**
 * Sales.java
 *
 * Code Description: Prints the minimum, maximum, and average sales in $ of 
 * a specified amount of salespersons.
 * 
 * @author Jacob Robbins
 * @version 2/5/19
 * @contact 1002127@palisadessd.net
 */

/**
 * main method - 
 * 
 * 
 * @param args
 */
public class Sales
{
  public static void main(String[] args)
  {

    int iSum, iAverage, iMax = 0, iMin = 240000000;
    // integers used to store the lowest and higher salespersons
    int iBestPerson = 1, iWorstPerson = 1;
    int iIndex, iSalesPeople;
    int iSalesExceed;

    System.out.println("Welcome to the sales person evaluator.");
    System.out.println("How many salespersons do you have?");
    Scanner kb = new Scanner(System.in);

    iSalesPeople = kb.nextInt();
    int[] iSales = new int[iSalesPeople];

    for (iIndex = 0; iIndex < iSales.length; iIndex++)
    {
      System.out.print("Enter sales for salesperson " + (iIndex + 1) + ": $");
      iSales[iIndex] = kb.nextInt();
    }

    System.out.println("\n  Sales Report");
    System.out.println(" ------------------ ");

    iSum = 0;
    for (iIndex = 0; iIndex < iSales.length; iIndex++)
    {
      System.out.println(" " + (iIndex + 1) + " $" + iSales[iIndex]);
      iSum += iSales[iIndex];
      if (iSales[iIndex] > iMax)
      {
        iMax = iSales[iIndex];
        iBestPerson = iIndex + 1;
      }
      if (iSales[iIndex] < iMin)
      {
        iMin = iSales[iIndex];
        iWorstPerson = iIndex + 1;
      }
    }

    iAverage = iSum / iSalesPeople;
    System.out.println("\nTotal sales: $" + iSum);
    System.out.println("Average Sales: $" + iAverage);
    System.out.println();
    System.out.println(
        "Salesperson " + iBestPerson + " had the highest sales with $" + iMax);
    System.out.println(
        "Salesperson " + iWorstPerson + " had the lowest sales with $" + iMin);
    System.out.println(
        "Now Enter a value in $ to see which salespersons exceeded that amount: $");
    iSalesExceed = kb.nextInt();

    kb.close();
  }
}
