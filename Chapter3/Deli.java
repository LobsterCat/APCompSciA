
/**
 * Deli.java
 *
 * Code Description: Computes the price of a deli item given the weight
 * (in ounces) and price per pound -- prints a label,
 * nicely formatted, for the item.
 *    
 * @author Jacob Robbins
 * @version 10/24/18
 * @contact 1002127@palisadessd.net
 */

import java.util.Scanner; //import Scanner class
import java.text.NumberFormat; //import number format class
import java.text.DecimalFormat; //import decimal format class

public class Deli
{
  /**
   * main method - reads in the price per pound of a deli item and number of
   * ounces of a deli item then computes the total price and prints a "label"
   * for the item
   * 
   * @param args
   */
  public static void main(String[] args)
  {
    // declaring a constant double
    final double dOUNCES_PER_POUND = 16.0;

    // declaring doubles for calculations
    double dPricePerPound;
    double dWeightOunces;
    double dWeightLbs;
    double dTotalPrice;

    // declaring a scanner to receive input
    Scanner kb = new Scanner(System.in);

    // initializing NumberFormat objects for currencies and percents
    NumberFormat fmtCurrency = NumberFormat.getCurrencyInstance();
    NumberFormat fmtPercent = NumberFormat.getPercentInstance();

    // initializing a DecimalFormat object for other decimals
    DecimalFormat fmtDecimal = new DecimalFormat("0.##");

    //prompts the user for price per pound of meat
    System.out.println("Welcome to the CS Deli! ! \n ");
    System.out.print("Enter the price per pound of your item: ");
    dPricePerPound = kb.nextDouble();

    //prompts the user for the total ounces of the meat
    System.out.print("Enter the weight (ounces): ");
    dWeightOunces = kb.nextDouble();

    //calculates how many pounds there are from ounces
    //calculates the total price with the given input
    dWeightLbs = dWeightOunces / dOUNCES_PER_POUND;
    dTotalPrice = dPricePerPound * dWeightLbs;

    // Print the label using the formatting objects fmtDecimal
    // for the weight in pounds and fmtCurrency for the prices
    System.out.println("        ***** CSDeli *****\r\n" + "    Unit Price: "
        + fmtCurrency.format(dPricePerPound) + " per pound"
        + "\r\n        Weight: " + fmtDecimal.format(dWeightLbs) + " pounds"
        + "\r\n         TOTAL: " + fmtCurrency.format(dTotalPrice) + "\r\n");
  }
}
