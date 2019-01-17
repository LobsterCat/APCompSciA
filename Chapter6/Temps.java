
/**
 * Temps.java
 *
 * Code Description: Gets the minimum and maximum out of a list.
 * Returns which entry had the max or min.
 * 
 * @author Jacob Robbins
 * @version 1/15/19
 * @contact 1002127@palisadessd.net
 */
import java.util.Scanner; // imports Scanner class

/**
 * main method - Finds the maximum and minimum temperatures out of a list of
 * values. Creates a for loop to check if the Scanner detects a number
 * higher or lower than previous numbers.
 * 
 * 
 * @param args
 */
public class Temps
{

  public static void main(String[] args)
  {
    // declares and initializes some variables to find the max and min
    final int iHOURS_PER_DAY = 24;
    int iHour;
    int iTemp;
    int iMax = -20000; // lower than any normal temperature
    int iMin = 20000; // higher than any normal temperature
    int iTimeOfMax = 0;
    int iTimeOfMin = 0;
    Scanner kb = new Scanner(System.in); // initializes scanner for user inputs

    // introduces the program, prompts the user to enter the 24 temperatures
    // within the loop
    System.out.println();
    System.out.println("Temperature Readings for 24 Hour Period");
    System.out.println();

    // loops through all 24 hours of the day, checking if the temperature
    // is above the previous ones or lower than the previous ones
    // also records the time of the max and min
    for (iHour = 0; iHour < iHOURS_PER_DAY; iHour++)
    {
      System.out
          .print("Enter the temperature reading at " + iHour + " hours: ");
      iTemp = kb.nextInt();
      if (iTemp > iMax)
      {
        iMax = iTemp;
        iTimeOfMax = iHour;
      }

      if (iTemp < iMin)
      {
        iMin = iTemp;
        iTimeOfMin = iHour;
      }

    }

    // Print the results
    System.out.println();
    System.out.println("Maximum Temperature: " + iMax);
    System.out.println("Time of Maximum: " + iTimeOfMax);
    System.out.println("Minimum Temperature: " + iMin);
    System.out.println("Time of Minimum: " + iTimeOfMin);

    kb.close(); // closes Scanner

  }
}
