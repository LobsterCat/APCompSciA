package chapter3;

/**
 * PhoneNumbers.java
 *
 * Code Description: Creates and prints a random phone number.
 * @author Jacob Robbins
 * @version 11/9/18
 * @contact 1002127@palisadessd.net
 */

import java.util.Random; //importing Random class
import java.text.DecimalFormat; //import DecimalFormat class

public class PhoneNumbers
{
  /**
   * main method - Creates and prints a random phone number.
   * 
   * @param args
   */
  public static void main(String[] args)
  {
    // creating a random object
    Random gen = new Random();

    // creating integers to hold random values
    int iPhoneOne, iPhoneTwo, iPhoneThree, iPhoneFour, iPhoneFive;

    //creating a new format for 1 digit
    DecimalFormat fmtOneDigit = new DecimalFormat("0");
    
    // creating a new format for 3 digits
    DecimalFormat fmtThreeDigits = new DecimalFormat("000");

    // creating a new format for 4 digits
    DecimalFormat fmtFourDigits = new DecimalFormat("0000");

    // restricting the first 3 digits to not have 8 or 9
    iPhoneOne = gen.nextInt(8);
    iPhoneTwo = gen.nextInt(8);
    iPhoneThree = gen.nextInt(8);

    // generating the next 3 integers
    iPhoneFour = gen.nextInt(656);

    // generates the last 4 digits of the phone number
    iPhoneFive = gen.nextInt(10000);

    //making it nice for the user to read
    System.out.println("Generating random phone number...");
    
    // prints random phone number to console with correct formatting
    System.out.print(fmtOneDigit.format(iPhoneOne));
    System.out.print(fmtOneDigit.format(iPhoneTwo));
    System.out.println(fmtOneDigit.format(iPhoneThree) + "-"
        + fmtThreeDigits.format(iPhoneFour) + "-"
        + fmtFourDigits.format(iPhoneFive));

  }
}