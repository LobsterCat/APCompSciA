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
    Scanner kb = new Scanner(System.in); // initializes Scanner
    String sCommand; // for user input
    ShoppingCart cart1 = new ShoppingCart(); // creates a cart

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

    sCommand = kb.nextLine();

    switch (sCommand)
    {
    case "CART":
      System.out.println(cart1.toString());
      break;
    case "ADD":
      System.out.println(
          "Now type the item name, it's price, and how many you are buying.");
      cart1.addToCart(kb.nextLine(), kb.nextDouble(), kb.nextInt());
      break;
    case "PAY":
      System.out.println("You owe: " + cart1.);

    }

    kb.close(); // closes Scanner object
  }

}
