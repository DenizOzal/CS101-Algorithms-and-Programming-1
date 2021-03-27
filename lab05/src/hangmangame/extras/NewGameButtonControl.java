/**
 * NewGameButtonControl - Displays the "new game" button 
 *
 * @author Deniz Semih Özal
 * @version 15/04/2020
 */
package hangmangame.extras;
import javax.swing.*;
import java.awt.event.*;
import cs102.hangman.Hangman;
import cs102.hangman.IHangmanView;

public class NewGameButtonControl extends JButton implements IHangmanView
{
   // properties
   private Hangman hangman;
   
   // constructors
   public NewGameButtonControl( Hangman hangman)
   {
      super();
      setText( "New Game");
      this.hangman = hangman;
      this.addActionListener( new ButtonControlListener());
      this.setEnabled( false);
   }
   
   // inner class
   class ButtonControlListener implements ActionListener
   {
      // implement ActionListener
      public void actionPerformed( ActionEvent e)
      {
         hangman.initNewGame();
         setEnabled( false);
      }
   }
   
   // implementing IHangmanView
   // re-enable the new game button
   public void updateView( Hangman hangman)
   {
      if ( hangman.isGameOver() == true)
         this.setEnabled( true);
   }
}