
public class TestDie
{
  public static void main( String[] args)
  {
    // Creating two objects
    Die die1 = new Die();
    Die die2 = new Die();
    
    //System.out.println ( die1);
    //System.out.println ( die2);
    
    //Using roll method
    System.out.println ( "Roll 1: " + die1.roll());
    System.out.println ( "Roll 2: " + die2.roll());
    
    //Using getFaceValue method
    System.out.println ( "Face 1: " + die1.getFaceValue());
    System.out.println ( "Face 2: " + die2.getFaceValue());
    
    //Using toString method
    System.out.println ( die1.toString());
    System.out.println ( die2.toString());
    
    
    
    
    
  }
    
}