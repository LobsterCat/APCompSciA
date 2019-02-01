public class Coin
{
  private final int iHEADS = 0;
  private final int iTAILS = 1;

  private int iFace;

  public Coin()
  {
    flip();
  }

  public void flip()
  {
    iFace = (int) (Math.random() * 2);
  }

  public boolean isHeads()
  {
    return (iFace == iHEADS);
  }

  public String toString()
  {
    String sFaceName;

    if (iFace == iHEADS)
      sFaceName = "Heads";
    else
      sFaceName = "Tails";

    return sFaceName;
  }
}
