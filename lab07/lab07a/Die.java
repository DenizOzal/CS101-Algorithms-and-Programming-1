// header comment
public class Die
{
    // properties
    int currentFace;

    // constructors
    public Die()
    {
      currentFace = 1 + (int)( Math.random() * 6);
    }
    // methods
    // roll method
    public int roll()
    {
      currentFace = 1 + (int)( Math.random() * 6);
      return currentFace;
    }
    // getFaceValue method
    public int getFaceValue()
    {
      return currentFace;
    }
    // toString method
    public String toString()
    {
      return ( "Dice: " + currentFace);
    }
      
    
      
      
}   