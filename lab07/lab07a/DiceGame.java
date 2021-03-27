// header comment
public class DiceGame
{
    // properties
    Dice dice;
    // constructors
    public DiceGame( Dice dice)
    {
      this.dice = dice;
    }
    
     
    // methods
    public int play( Dice dice)
    {
      int numberOfRolls;
      int count;
      count = 0;
      numberOfRolls = 1;
      while (  count < 1)
      {
        if ( dice.roll() == 12)
        {
          count++;
        }
        numberOfRolls++;
      }
      return numberOfRolls;
    }
        
    }