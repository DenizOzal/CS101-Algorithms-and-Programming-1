/**
 * LabelsHangmanView - Displays the status of the game
 *
 * @author Deniz Semih ?zal
 * @version 15/04/2020
 */
package hangmangame.extras;
import javax.swing.*;
import java.awt.*;
import cs102.hangman.Hangman;
import cs102.hangman.IHangmanView;


public class LabelsHangmanView extends JPanel implements IHangmanView
{
   // properties
   private JLabel noOfTries, knownSoFar, usedWords, maxTry;
   
   // constructors
   public LabelsHangmanView()
   {
      super();
      noOfTries = new JLabel();
      knownSoFar = new JLabel();
      usedWords = new JLabel();
      maxTry = new JLabel();
      setLayout( new GridLayout( 4,0));
      setBackground( Color.GREEN);
      setPreferredSize( new Dimension( 400,400));
      add( noOfTries);
      add( knownSoFar);
      add( usedWords);
      add( maxTry);
   }
   
   // @Override
   // implementing IHangmanView
   public void updateView( Hangman hangman)
   {
      if ( hangman.isGameOver() == false) // when the game continues
      {
         noOfTries.setText( "Incorrect tries: " + hangman.getNumOfIncorrectTries());
         knownSoFar.setText( "Known So Far: " + hangman.getKnownSoFar());
         usedWords.setText( "Used Letters: " + hangman.getUsedLetters());
         maxTry.setText( "Max Allowed Incorrect Tries: " + hangman.getMaxAllowedIncorrectTries());
      }
      else
      {
         if ( hangman.hasLost() == true) // if the user lost the game
         {
            knownSoFar.setText( "Oops...Secret Word: " + hangman.getKnownSoFar());
            noOfTries.setText( "Incorrect tries: " + hangman.getNumOfIncorrectTries());
            usedWords.setText( "Used Letters: " + hangman.getUsedLetters());
         }
         else // if the user won the game
         {
            knownSoFar.setText( "YOU WON...Secret Word: " + hangman.getKnownSoFar());
            noOfTries.setText( "Incorrect tries: " + hangman.getNumOfIncorrectTries());
            usedWords.setText( "Used Letters: " + hangman.getUsedLetters());
         }
      }
   }   
}
