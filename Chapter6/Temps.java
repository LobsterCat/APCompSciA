
/**
 * Temps.java
 *
 * Code Description: 
 * 
 * @author Jacob Robbins
 * @version 1/15/19
 * @contact 1002127@palisadessd.net
 */
import java.util.Scanner; // imports Scanner class
/**
 * main method -
 * 
 * 
 * @param args
 */
public class Temps
{

  public static void main(String[] args)
  {
    final int iHOURS_PER_DAY = 24;
    int iHour;
    int iTemp;
    int iMax = 0;
    Scanner kb = new Scanner(System.in); // initializes scanner for user inputs

    System.out.println();
    System.out.println("Temperature Readings for 24 Hour Period");
    System.out.println();

    for (iHour = 0; iHour < iHOURS_PER_DAY; iHour++)
    {
      System.out
          .print("Enter the temperature reading at " + iHour + " hours: ");
      iTemp = kb.nextInt();
      if(iTemp > iMax)         
        iMax = iTemp;
      iMax = iTemp;
    
      
    }
    
    // Print the results
    System.out.println(iMax);
    
    kb.close(); // closes Scanner

  }
}
