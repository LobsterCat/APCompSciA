/**
 * Car.java
 *
 * Code Description: Creates instance data representing the make, model and year
 * of a car.
 * 
 * @author Jacob Robbins
 * @version 11/21/18
 * @contact 1002127@palisadessd.net
 */

public class Car
{

  // declaring variables to be accessed only from this class
  private String sMake, sModel;
  private int iYear;

  /**
   * Constructor - initializes the car's variables
   * 
   * @param
   */
  public Car()
  {
    sMake = "Toyota";
    sModel = "Prius";
    iYear = 2015;
  }

  /**
   * getMake - returns the car's make
   * 
   * @param
   */
  public String getMake()
  {
    return sMake; // returns a string
  }

  /**
   * getModel - returns the car's model
   * 
   * @param
   */
  public String getModel()
  {
    return sModel; // returns a string
  }

  /**
   * getYear - returns the car's year
   * 
   * @param
   */
  public int getYear()
  {
    return iYear; // returns an integer
  }

  /**
   * setMake - Sets the car's make to whatever string is put as the parameter
   * 
   * @param sParam
   *          sets the make of the car to this
   * 
   */
  public String setMake(String sParam)
  {
    sMake = sParam;
    return sMake;
  }

  /**
   * setModel - Sets the car's model to the string that is entered.
   * 
   * @param sParamTwo
   *          sets the model of the car to this
   * @return
   * 
   */
  public String setModel(String sParamTwo)
  {
    sModel = sParamTwo;
    return sModel;
  }

  /**
   * setMake - Sets the car's year to a specific integer
   * 
   * @param iParamThree
   *          sets the year of the car to this integer
   * 
   */
  public int setYear(int iParamThree)
  {
    return iYear = iParamThree;
  }

  /**
   * toString - returns a one line description of the sphere
   * 
   * @param
   */
  public String toString()
  {
    String sCar = iYear + " " + sMake + " " + sModel;
    return sCar; // returns the string description
  }

}
