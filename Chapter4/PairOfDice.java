
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

  private DieV2 dieOne, dieTwo;

  /**
   * constructor - creates two object reference variables of the diev2 class
   * 
   * @param
   */
  public PairOfDice()
  {
    dieOne = new DieV2();
    dieTwo = new DieV2();
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

}
