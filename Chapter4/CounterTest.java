
/**
 * CounterTest.java
 *
 * Code Description: Allows a user to manipulate a counter created from another class.
 * 
 * @author Jacob Robbins
 * @version 11/14/18
 * @contact 1002127@palisadessd.net
 */

import java.util.Scanner; // imports Scanner class

public class CounterTest
{
  /**
   * main method - Creates two instances of the Counter.java class and tests
   * their functions.
   * 
   * @param args
   */

  public static void main(String[] args)
  {

    // declaring two object reference variables
    Counter counterOne, counterTwo;

    // initializing a scanner for user input
    Scanner kb = new Scanner(System.in);

    // declaring a string for user input
    // declaring a string for the secret
    String sInput, sSecret;

    // declaring an integer for user input
    int iInput;

    // instantiate the two object reference variables
    counterOne = new Counter();
    counterTwo = new Counter();

    // adding console output for the user
    // listing commands for the user to input and use
    System.out.println(
        "Welcome to Counter.java. There are various commands you can use to influence the counter.");
    System.out.println(
        "Just type the command into the console then press enter. Some commands prompt you for further input.");
    System.out.println();
    System.out.println("                                    COMMANDS: ");
    System.out.println(
        "Count - Prompts the user for an integer which is then added to the counter.");
    System.out.println("Reset - Resets the counter to zero.");
    System.out.println("ToString - Saves the counter's value as a String.");
    System.out.println(
        "GetCount - Returns and prints the current value of the the counter.");
    System.out.println("Increment - Increases the counter by one.");
    System.out.println();
    System.out.println("Now enter any command you would like.");

    // using counter two to create a secret
    counterTwo.click(935);
    sSecret = counterTwo.toString();

    // creating an infinite loop to keep prompting the user for input
    while (true)
    {
      // reading user input
      sInput = kb.next();

      // creating if statements to change the output for each command the user
      // enters into the console
      // prints to the console and possibly prompts the user
      if (sInput.equalsIgnoreCase("Count"))
      {
        System.out.println("Now enter an integer to add to the counter.");
        iInput = kb.nextInt();
        counterOne.click(iInput);
      }
      else if (sInput.equalsIgnoreCase("Reset"))
      {
        System.out.println("Resetting the counter...");
        counterOne.resetCount();
        System.out.println("Counter one equals: " + counterOne);
      }
      else if (sInput.equalsIgnoreCase("ToString"))
      {
        System.out.println("Converting the integer to a string...");
        counterOne.toString();
        System.out.println("Conversion succesful");
      }
      else if (sInput.equalsIgnoreCase("GetCount"))
      {
        System.out.println(
            "The counter is currently reading " + counterOne.getCount());
      }
      else if (sInput.equalsIgnoreCase("Increment"))
      {
        System.out.println("Incrementing the counter by one.");
        counterOne.increment();
        System.out
            .println("The counter is now equal to " + counterOne.getCount());
      }

      if (sInput == sSecret)
      {
        System.out.println("You found my secret!");
        System.out.println("Now you can visit this link: ");
        System.out.println("https://bit.ly/IqT6zt");
      }

    }

  }
}
