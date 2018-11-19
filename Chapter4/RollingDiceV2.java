/**
 * RollingDice.java
 *
 * Code Description: A program that creates two Die objects (using the Die
 * class) and rolls them several times
 * 
 * @author Mr. Einolf
 * @version 11/08/18
 * @contact teinolf@palisadessd.org
 */

public class RollingDiceV2
{
  /**
   * main method - creates two Die objects (using the Die class) and rolls them
   * several times
   * 
   * @param args
   */
  public static void main(String[] args)
  {
    // declare object reference variables for the dice.
    // and a variable for the roll total
    DieV2 dieOne, dieTwo;
    int iSum;

    // instantiate the two Die objects
    dieOne = new DieV2();
    dieTwo = new DieV2();

    // invoke methods (that are defined in the Die class)
    // to roll the dice, then print the results
    dieOne.roll();
    dieTwo.roll();
    System.out.println("Die One: " + dieOne + ", Die Two: " + dieTwo);

    // invoke method to roll one dice, and set the value of the other
    // then print the results
    dieOne.roll();
    dieTwo.setFaceValue(4);
    System.out.println("Die One: " + dieOne + ", Die Two: " + dieTwo);

    // invoke methods to get the face values, then calc. and print the sum
    iSum = dieOne.getFaceValue() + dieTwo.getFaceValue();
    System.out.println("Sum: " + iSum);

    // invoke methods to roll the dice, then calc. and print the sum
    iSum = dieOne.roll() + dieTwo.roll();
    System.out.println("Die One: " + dieOne + ", Die Two: " + dieTwo);
    System.out.println("New sum: " + iSum);
  }
}
