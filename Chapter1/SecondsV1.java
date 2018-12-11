/**
 * SecondsV1.java
 *
 * Code Description: Converts a time from hours, minutes and seconds to purely just seconds.
 *    
 * @author Jacob Robbins
 * @version 9/26/18
 * @contact 1002127@palisadessd.net
 */

public class SecondsV1
{
  /**
   * main method - Converts a time from hours, minutes and seconds to purely seconds.
   * 
   * @param args
   */
  public static void main (String[] args)
  {
	//declares variables for hours, minutes, seconds and total seconds
	final int iHours, iMinutes, iSeconds, iTotalSeconds;
	  
    //assigning values to hours, minutes and seconds
    iHours = 3; iMinutes = 14; iSeconds = 11;
    
    //calculates how many total seconds are in the assigned time
    iTotalSeconds = (iHours * 3600) + (iMinutes * 60) + iSeconds;
    
    //prints to the console the original time and the time after it has been converted to seconds
    System.out.println(iHours + " hours " + iMinutes + " minutes and " + iSeconds + 
    " seconds is equivalent to " + iTotalSeconds + " seconds.");
  }
}
