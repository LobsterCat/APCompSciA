/**
 * PlayingCards.java
 *
 * Code Description: Uses enums and objects and practices
 * converting them to integers and other techniques.
 * 
 * @author Jacob Robbins
 * @version 10/30/18
 * @contact 1002127@palisadessd.net
 */

public class PlayingCards
{
  // declare Rank for the types of cards
  enum Rank
  {
    ace, jack, seven, nine
  }

  /**
   * main method - Creates objects, integers
   * and prints to the console
   * 
   * @param args
   */
  public static void main(String[] args)
  {
    // declaring variables for the enum
    Rank eHighCard, eFaceCard, eCardOne, eCardTwo;

    // declaring integers to store the
    // enum values
    int iCardOneVal, iCardTwoVal;

    // assigning values to the objects
    eHighCard = Rank.ace;
    eFaceCard = Rank.jack;
    eCardOne = Rank.seven;
    eCardTwo = Rank.nine;

    // assigning values to the integers
    // from the enum objects
    iCardOneVal = eCardOne.ordinal();
    iCardTwoVal = eCardTwo.ordinal();

    // prints to the console the enum objects
    System.out.println("A blackjack hand: " + eHighCard + " and " + eFaceCard
        + " and " + eCardOne + " and " + eCardTwo);

    // printing to the console the new integers
    System.out
        .println("A two card hand: " + iCardOneVal + " and " + iCardTwoVal);
    System.out.println("Hand value: " + (iCardOneVal + iCardTwoVal));

  }
}
