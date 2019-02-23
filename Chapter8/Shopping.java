import javax.swing.plaf.synth.SynthSeparatorUI;

/**
 * Shopping.java
 *
 * Code Description: Driver program to access the shoppingcart and items
 * and prompt the user to do various things.
 * 
 * @author Jacob Robbins
 * @version 2/22/19
 * @contact 1002127@palisadessd.net
 */
import java.util.Scanner; //imports Scanner object
import java.text.NumberFormat; // imports Decimal Format

public class Shopping
{

  /**
   * main method - Uses sysout to prompt the user for input and then manipulates
   * the shopping cart object which holds item objects.
   * 
   * @param args
   */

  public static void main(String[] args)
  {

    int iTotalCost; // total cost
    boolean bFlag = true; // used to loop the prompting in the program
    Scanner kb = new Scanner(System.in); // initializes Scanner
    String sCommand; // for user input
    ShoppingCart CartOne = new ShoppingCart(); // creates a cart
    NumberFormat fmtCurrency = NumberFormat.getCurrencyInstance(); // rounds decimals for total price

    // tells user what commands to input
    System.out.println(
        "Welcome to the shopping cart simulator. Here you start with a cart "
            + "that can hold 5 items, but the size will automatically increase as needed.");

    System.out
        .println("-----------------------------------------------------------");
    System.out.println("                         COMMANDS");
    System.out
        .println("CART                        Checks the contents of the cart");
    System.out
        .println("ADD                         Adds a new item to the cart");
    System.out
        .println("PAY                         Calculates your total owed");
    System.out.println(
        "STOP                        Ends the program and reads your final cart contents");

    while (bFlag)
    {
      System.out.println();
      System.out.print("Now type a command in all capital letters. Type \"HELP\" to see a list"
          + " or refer to the one above.");
      
      sCommand = kb.next(); // reads the command the user inputs

      switch (sCommand)
      {
      case "CART":
        CartOne.totalPrice();
        System.out.println(CartOne.toString());
        break;
      case "ADD":
        System.out.println(
            "Now type the item name, it's price, and how many you are buying.");
        CartOne.addToCart(kb.nextLine(), kb.nextDouble(), kb.nextInt());
        break;
      case "PAY":
        System.out.println("You owe: " + fmtCurrency.format(CartOne.totalPrice()));
        break;
      case "STOP":
        System.out.println("Ending the program.");
        bFlag = false;
      case "HELP":
        System.out.println(
            "-----------------------------------------------------------");
        System.out.println("                         COMMANDS");
        System.out.println(
            "CART                        Checks the contents of the cart");
        System.out
            .println("ADD                         Adds a new item to the cart");
        System.out
            .println("PAY                         Calculates your total owed");
        System.out.println(
            "STOP                        Ends the program and reads your final cart contents");
        CartOne.totalPrice();

      }
    }
    kb.close(); // closes Scanner object
  }

}
