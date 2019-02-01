
/**
 * MultTable.java
 *
 * Code Description: program that produces a multiplication table, showing 
 * the results of multiplying the integers 1 through 12 by themselves
 * 
 * @author Jacob Robbins
 * @version 2/1/19
 * @contact 1002127@palisadessd.net
 */



/**
 * main method - Uses nested for loops to print a multiplication table
 * for the user.
 * 
 * 
 * @param args
 */
public class MultTable
{

  
  public static void main(String[] args)
  {
  int iOne, iTwo;
    
    for(iOne = 1; iOne <= 12; iOne++) {
      System.out.println();
      for(iTwo = 1; iTwo <= 12; iTwo++) {
        if(iOne < 10) {
        System.out.print(iOne * iTwo + "   ");
        } else {
          System.out.print(iOne * iTwo + "   ");
        }
        
      }
    }
    
  }
}
