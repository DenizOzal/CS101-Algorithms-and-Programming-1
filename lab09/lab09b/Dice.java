public class Dice
{
    // properties
    private Die die01;
    private Die die02;
  

    // constructors
    public Dice()
    {
     die01 = new Die();
     die02 = new Die();
    }
    
    // methods
    // The method that gives sum of the die1 and die2
    public int roll()
    {
      return (die01.roll() + die02.roll()) ;
    }
    
    // The method that gives the face of die1
    public int getDie1FaceValue()
    {
      return die01.getFaceValue();
    }
    
    // The method that gives the face of die2
    public int getDie2FaceValue()
    {
      return die02.getFaceValue();
    }
    
    // The method that gives total dice
    public int getDiceTotal()
    {
      return die01.getFaceValue() + die02.getFaceValue();
    }
    
    // The method that converts to String
    public String toString()
    {
      return ( "The face of Die 1 is : " + die01.getFaceValue() + " The face of Die 2 is: " + die02.getFaceValue() + " Sum: " + die01.getFaceValue() + die02.getFaceValue());
    }
      
    
}