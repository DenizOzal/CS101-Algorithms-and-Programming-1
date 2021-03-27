public class TestDiceGame
{
   public static void main( String[] args)
   {
      Die die1;
      Die die2;
      Dice dice;
      DiceGame diceGame;
     
      die1 = new Die();
      die2 = new Die();
      dice = new Dice( die1, die2);
      diceGame = new DiceGame(dice);
      
      System.out.println( diceGame.play( dice ));
      
   }
}