// header comment
public class Dice
{
    // properties
    int die1_face;
    int die2_face;
    int result;

    // constructors
    public Dice( Die die1, Die die2)
    {
      die1_face = die1.currentFace;
      die2_face = die2.currentFace;
    }
    
    // methods
    public int roll()
    {
      die1_face = 1 + (int)( Math.random() * 6);
      die2_face = 1 + (int)( Math.random() * 6);
      result = die1_face + die2_face;
      return result;
    }
    public int getDie1FaceValue()
    {
      return die1_face;
    }
    public int getDie2FaceValue()
    {
      return die2_face;
    }
    public int getDiceTotal()
    {
      result = die1_face + die2_face;
      return result;
    }
    public String toString()
    {
      return ( "The face of Die 1 is : " + die1_face + " The face of Die 2 is: " + die2_face + " Sum: " + result);
    }
      
    
}