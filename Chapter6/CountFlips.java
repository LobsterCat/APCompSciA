/**
 * CountFlips.java
 *
 * Code Description: Counts the number of times each side of a coin
 * landed face up.
 * 
 * @author Jacob Robbins
 * @version 2/1/19
 * @contact 1002127@palisadessd.net
 */

/**
 * main method - Uses a for loop to keep track of how many times
 * each side of the coin lands upright when flipped.
 * 
 * 
 * @param args
 */
public class CountFlips
{

  public static void main(String[] args)
  {

    int iFlips = 0, iHeads = 0, iTails = 0;
    Coin coin = new Coin();
    String sFaceValue = "";

    System.out.println("Flipping a Coin 100 Times: ");
    // for loop that flips the coin 100 times and keeps track of
    // how many times each one showed up
    for (iFlips = 0; iFlips < 100; iFlips++)
    {
      coin.flip();
      sFaceValue = coin.toString();
      System.out.println(sFaceValue);
      // increments the correct side of the coin
      if (sFaceValue.equals("Heads"))
      {
        iHeads++;
      }
      else
      {
        iTails++;
      }
      

    }
    
    // prints how many of each side was flipped.
    System.out.println("Number of Times it was Heads: " + iHeads);
    System.out.println("Number of Times it was Tails: " + iTails);
  }
}
