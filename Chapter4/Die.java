/**
 * Die.java
 *
 * Code Description: Class definitions for a playing Die
 * 
 * @author Mr. Einolf
 * @version 11/08/18
 * @contact teinolf@palisadessd.org
 */

public class Die
{
  // set maximum face value
  private final int iMAX = 6;

  // declare current value showing on the die
  private int iFaceValue;

  /**
   * Constructor - Sets the initial face value
   * 
   * @param
   */
  public Die()
  {
    iFaceValue = 1;
  }

  /**
   * roll - Rolls the die and returns the result
   * 
   * @param
   */
  public int roll()
  {
    iFaceValue = (int) (Math.random() * iMAX) + 1;
    return iFaceValue;
  }

  /**
   * setFaceValue - Face value mutator
   * 
   * @param
   */
  public void setFaceValue(int iValue)
  {
    iFaceValue = iValue;
  }

  /**
   * getFaceValue - Face value accessor
   * 
   * @param
   */
  public int getFaceValue()
  {
    return iFaceValue;
  }

  /**
   * toString - Returns a string representation of this die
   * 
   * @param
   */
  public String toString()
  {
    String sResult = Integer.toString(iFaceValue);
    return sResult;
  }

}
