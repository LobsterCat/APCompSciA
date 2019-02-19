// ***************************************************************
// ShoppingCart.java
//
// Represents a shopping cart as an array of items
// ***************************************************************
import java.text.NumberFormat;
public class ShoppingCart
{
  private int iItemCount; // total number of items in the cart
  private double dTotalPrice; // total price of items in the cart
  private int iCapacity; // current cart capacity
  private Item[] cart; // array of items to be in the cart

  public ShoppingCart() // Creates an empty shopping cart with a capacity of 5 items.
  {
    iCapacity = 5;
    iItemCount = 0;
    dTotalPrice = 0.0;
    cart = new Item[iCapacity];
  }

  public void addToCart(String sItemName, double dPrice, int iQuantity) 
    // Adds an item to the shopping cart.
  {
    
    // add the itmes mannnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn
    
  }

  private void increaseSize() // Increases the capacity of the shopping cart by 3
  {
    // initializing a new array 3 items larger
    Item[] temp = new Item[cart.length+3];
    // integer used for for loop
    int iTemp;
    
    // loops to fill temp with all the values of original cart, adding 3 items
    for(iTemp = 0; iTemp < cart.length; iTemp++) {
      temp[iTemp] = cart[iTemp];
    }
      
    cart = temp; // creates a new array with values of temp
    
  }

  public String toString() 
  // Returns the contents of the cart together with summary information.
  {
    NumberFormat fmtCurrency = NumberFormat.getCurrencyInstance();
    String sContents = "\nShopping Cart\n";
    int iIndex;

    sContents += "\nItem\t\tUnit Price\tQuantity\tTotal\n";

    for (iIndex = 0; iIndex < iItemCount; iIndex++)
      sContents += cart[iIndex].toString() + "\n";

    sContents += "\nTotal Price: " + fmtCurrency.format(dTotalPrice);
    sContents += "\n";
    return sContents;
  }
}
