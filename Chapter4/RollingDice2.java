/**
 * RollingDice.java
 *
 * Code Description: A program that creates two Die objects (using the Die
 * class) and rolls them several times
 * 
 * @author Mr. Einolf & Jacob Robbins
 * @version 11/08/18 11/19/18
 * @contact teinolf@palisadessd.org 1002127@palisadessd.net
 */

public class RollingDice2
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
    // declaring objects for pair of dice
    Die dieOne, dieTwo;
    PairOfDice dicePairOne, dicePairTwo;
    int iSum;

    // instantiate the two Die objects
    dieOne = new Die();
    dieTwo = new Die();

    // instantiate the new pair of dice objects
    dicePairOne = new PairOfDice();
    dicePairTwo = new PairOfDice();

    // invoke methods (that are defined in the Die class)
    // to roll the dice, then print the results
    // printing to the console for the user
    // invoking methods for the pairs of dice
    dieOne.roll();
    dieTwo.roll();
    System.out.println("Rolling dice...");
    System.out.println("Die One: " + dieOne + ", Die Two: " + dieTwo);
    dicePairOne.roll();
    dicePairTwo.roll();
    System.out.println("Dice Pair One: " + dicePairOne);
    System.out.println("Dice Pair Two: " + dicePairTwo);

    // invoke method to roll one dice, and set the value of the other
    // then print the results
    // invoke method to roll pair of dice and set values
    // then print the results
    dieOne.roll();
    dieTwo.setFaceValue(4);
    System.out.println("Die One: " + dieOne + ", Die Two: " + dieTwo);
    dicePairOne.roll();
    dicePairTwo.setFaceValues(5, 1);
    System.out.println("Dice Pair One: " + dicePairOne);
    System.out.println("Dice Pair Two: " + dicePairTwo);

    // invoke methods to get the face values, then calc. and print the sum
    // uses the sum method in PairOfDice.java
    iSum = dieOne.getFaceValue() + dieTwo.getFaceValue();
    System.out.println("Sum: " + iSum);
    System.out.println("Sum of the first pair of dice: " + dicePairOne.sum());

    // invoke methods to roll the dice, then calc. and print the sum
    iSum = dieOne.roll() + dieTwo.roll();
    System.out.println("Die One: " + dieOne + ", Die Two: " + dieTwo);
    System.out.println("New sum: " + iSum);
    System.out.println("");
    System.out.println("Setting the pairs of dice as strings..");
    System.out.println(dicePairOne.toString());
    System.out.println(dicePairTwo.toString());
  }
}
