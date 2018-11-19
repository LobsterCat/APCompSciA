
/**
 * PairOfDice.java
 *
 * Code Description:
 * 
 * @author Jacob Robbins
 * @version 11/19/18
 * @contact 1002127@palisadessd.net
 */

public class PairOfDice
{

  private Die dieOne, dieTwo;

  /**
   * constructor - creates two object reference variables of the diev2 class
   * 
   * @param
   */
  public PairOfDice()
  {
    dieOne = new Die();
    dieTwo = new Die();
  }

  /**
   * roll method - rolls two dice and returns the sum
   * 
   * @param
   */

  public int roll()
  {
    return dieOne.roll() + dieTwo.roll();
  }
  
  /**
   * toString - Converts the integer to a String
   * 
   * @param
   */
  public String toString()
  {
    String sCount = Integer.toString();
    return sCount; // returns the string version of the variable
    

  }

}
