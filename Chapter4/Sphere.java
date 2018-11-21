/**
 * Sphere.java
 *
 * Code Description: Creates a class for creating spheres.
 * 
 * @author Jacob Robbins
 * @version 11/21/18
 * @contact 1002127@palisadessd.net
 */

public class Sphere
{
  // declaring doubles to calculate the sphere's
  // dimensions
  private int iDiameter, iRadius;
  private double dVolume, dSurfaceArea;

  /**
   * Constructor - Sets the counter to zero
   * 
   * @param
   */
  public Sphere()
  {
    iDiameter = 0;
    iRadius = iDiameter / 2;
  }

  /**
   * getDiameter - returns the diameter's value
   * 
   * @param
   */
  public int getDiameter()
  {
    return iDiameter; // returns the iDiameter integer
  }

  /**
   * setDiameter - Sets the diameter to the parameter
   * 
   * @param iDiameter
   *          - sets the diameter of the sphere to a specific integer
   */
  public void setDiameter(int iDiameterSet)
  {
    iDiameter = iDiameterSet;
    iRadius = iDiameter / 2;
  }

  /**
   * toString - returns a one line description of the sphere
   * 
   * @param
   */
  public String toString()
  {
    String sSphere = "The sphere is currently of diameter " + iDiameter
        + " with a volume of " + dVolume + " and a surface area of "
        + dSurfaceArea;
    return sSphere; // returns a string description

  }

  /**
   * volume - calculates the volume of the sphere with a preset diameter
   * 
   * @param
   */
  public double volume()
  {
    dVolume = ((4 / 3) * Math.PI * Math.pow(iRadius, 3));
    return dVolume; // returns the volume floating point
  }

  /**
   * volume - calculates the surface area of the sphere with a preset diameter
   * 
   * @param
   */
  public double surfaceArea()
  {
    dSurfaceArea = 4 * Math.PI * Math.pow(iRadius, 2);
    return dSurfaceArea; // returns the surface area floating point
  }
}
