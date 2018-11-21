
/**
 * CarTest.java
 *
 * Code Description: Creates object reference variables of the car class and
 * manipulates all of their various methods.
 * 
 * @author Jacob Robbins
 * @version 11/21/18
 * @contact 1002127@palisadessd.net
 */

public class CarTest
{
  /**
   * main method - creates three object reference variables and uses all of
   * their methods.
   * 
   * @param args
   */

  public static void main(String[] args)
  {

    // declaring two object reference variables
    Car carOne, carTwo, carThree;

    // instantiate the two object reference variables
    carOne = new Car();
    carTwo = new Car();
    carThree = new Car();

    // manipulating the three cars and printing to the console for the user to
    // see
    System.out.println("The default car instantiated is: " + carOne.toString());
    System.out.println();
    System.out.println("Setting the make and model of car two.");
    carTwo.setMake("Volkswagen");
    carTwo.setModel("Jetta");
    System.out.println();
    System.out.println("Make: " + carTwo.getMake());
    System.out.println("Model: " + carTwo.getModel());
    System.out.println("Year: " + carTwo.getYear());

    // manipulating the methods not used for carThree
    carThree.setYear(1999);
    carThree.setModel("Monte Carlo");
    carThree.setMake("Chevrolet");
    System.out.println(carThree.toString());

  }
}
