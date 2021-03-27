/**
 * HangmanLetterButtonControls - Displays a virtual keyboard
 *
 * @author Deniz Semih Özal
 * @version 15/04/2020
 */
package hangmangame.extras;
import cs102.hangman.Hangman;
import cs102.hangman.IHangmanView;

public class HangmanLetterButtonControls extends LetterButtonControls implements IHangmanView
{
   // constructors
   public HangmanLetterButtonControls( Hangman hangman, int rows, int columns)
   {
      super( hangman.getAllLetters(), rows, columns);
   }
   
   // @Override
   // implement IHangmanView
   public void updateView( Hangman hangman)
   {
      if ( hangman.isGameOver() == false)
         setDisabled( hangman.getUsedLetters());
      else
         setEnabledAll( true);
   }  
}