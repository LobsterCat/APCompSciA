
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
    String sCount = Integer.toString(dieOne.roll());
    String sCountTwo = Integer.toString(dieTwo.roll());
    return sCount + (" ") + sCountTwo; // returns the string version of the die
                                       // roll
  }

  /**
   * sum - roll the dice and return the sum of the face values
   * 
   * @param
   */
  public int sum()
  {
    int iSum;
    iSum = dieOne.roll() + dieTwo.roll();
    return iSum;
  }

  /**
   * setFaceValues - set the face value of each die essentially setting the sum
   * as well
   * 
   * @param iFaceValueOne - sets the value for die one
   * @param iFaceValueTwo - sets the value for die two
   * @return 
   */
  public String setFaceValues(int iFaceValueOne, int iFaceValueTwo)
  {
    dieOne.setFaceValue(iFaceValueOne);
    dieTwo.setFaceValue(iFaceValueTwo);
    return "Die One: " + dieOne + "Die Two: " + dieTwo;
  }

}
