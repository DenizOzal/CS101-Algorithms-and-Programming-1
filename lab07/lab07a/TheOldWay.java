import java.util.Scanner;

/**
 * ___Die&DiceGames(TheOldWay)__ 
 * @author __Deniz Semih Özal__
 * @version __11/25/2019__
 */ 
public class TheOldWay
{
  public static void main( String[] args)
  {
    Scanner scan = new Scanner( System.in);
    
    // constants
    
    // variables
    int dice1;
    int dice2;
    int numberOfRolls;
    int counter;
    // program code
    dice1 = 0;
    dice2 = 0;
    numberOfRolls = 0;
    counter = 0;
    while ( counter < 1)
    {
      dice1 = 1 + (int)(Math.random() * 6);
      dice2 = 1 + (int)(Math.random() * 6);
      System.out.print ( dice1 + "," +  dice2 + " ");
      
      if ( dice1 == 6 && dice2 == 6)
      {
        counter++;
      }
      numberOfRolls++;
    }
    
    System.out.println ( "Number of rolls : " + numberOfRolls);
  }
  
}