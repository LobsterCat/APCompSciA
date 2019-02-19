
// ***************************************************************
// Item.java
//
// Represents an item in a shopping cart.
// ***************************************************************
import java.text.NumberFormat;
public class Item 
{
  // instance variables declared
  private String sName;
  private double dPrice;
  private int iQuantity;

  public Item (String sItemName, double dItemPrice, int iNumPurchased)
    // Create a new item with the given attributes.
  {
    sName = sItemName;
    dPrice = dItemPrice;
    iQuantity = iNumPurchased;
  }

  public double getPrice()   // Returns the unit price of the item
  {
    return dPrice;
  }

  public String getName()  // Returns the name of the item
  {
    return sName;
  }

  public int getQuantity()  // Returns the quantity of the item
  {
    return iQuantity; }
  

  public String toString () // Return a string with the information about the item
  {
    NumberFormat fmtCurrency = NumberFormat.getCurrencyInstance();
    return (sName + "\t" + fmtCurrency.format(dPrice) + "\t" + iQuantity + "\t"
      + fmtCurrency.format(dPrice * iQuantity));
  }
}
