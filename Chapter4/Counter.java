/**
 * Counter.java
 *
 * Code Description: Creates a counter with various ways of incrementing
 * 
 * @author Jacob Robbins
 * @version 11/14/18
 * @contact 1002127@palisadessd.net
 */

public class Counter
{
  // declare variable to represent the counter
  private int iCount;

  /**
   * Constructor - Sets the counter to zero
   * 
   * @param
   */
  public Counter()
  {
    iCount = 0;
  }

  /**
   * click - increments the counter by the parameter
   * 
   * @param iIncrement
   *          gets added to iCount
   */
  public int click(int iIncrement)
  {
    iCount += iIncrement;
    return iCount; // returns the counter integer
  }

  /**
   * getCount - returns the counter's value
   * 
   * @param
   */
  public int getCount()
  {
    return iCount; // returns the counter integer
  }

  /**
   * resetCount - Sets the counter to zero
   * 
   * @param
   */
  public void resetCount()
  {
    iCount = 0;
  }

  /**
   * toString - Converts the integer to a String
   * 
   * @param
   */
  public String toString()
  {
    String sCount = Integer.toString(iCount);
    return sCount; // returns a string version of iCount

  }

  /**
   * increment - Increases the counter by one
   * 
   * @param
   */
  public int increment()
  {
    iCount++;
    return iCount; // returns the count integer
  }

}
