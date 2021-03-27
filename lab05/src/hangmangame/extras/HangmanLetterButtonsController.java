/**
 * HangmanLetterButtonsController - This is the controls class for HangmanLetterButtonControls
 *
 * @author Deniz Semih Özal
 * @version 15/04/2020
 */
package hangmangame.extras;

import javax.swing.*;
import java.awt.event.*;
import cs102.hangman.Hangman;
import cs102.hangman.IHangmanView;
public class HangmanLetterButtonsController implements ActionListener, IHangmanView 
{
   // properties
   private JButton button;
   private char c;
   private Hangman hangman;
   
   // constructors
   public HangmanLetterButtonsController( Hangman hangman)
   {
      this.hangman = hangman;
   }
   
   // implementing ActionListener
   public void actionPerformed( ActionEvent e)
   {
      button = (JButton)e.getSource();
      c = button.getText().charAt(0);
      hangman.tryThis( c);
   }
   
   // implementing IHangmanView
   // disable the button
   public void updateView( Hangman hangman)
   {
      button.setEnabled( false);
   }
}


