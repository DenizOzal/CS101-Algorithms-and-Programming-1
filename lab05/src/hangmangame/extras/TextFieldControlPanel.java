/**
 * NewGameButtonControl - Displays the text field 
 *
 * @author Deniz Semih Özal
 * @version 15/04/2020
 */
package hangmangame.extras;
import javax.swing.*;
import java.awt.event.*;
import cs102.hangman.Hangman;
public class TextFieldControlPanel extends JPanel
{
   // properties
   private Hangman hangman;
   private JTextField tf; 
   
   // constructors
   public TextFieldControlPanel( Hangman hangman)
   {
      super();
      this.hangman = hangman;
      tf = new JTextField(25);
      tf.addActionListener( new TextFieldActionListener());
      add( tf);
   }
   // inner class
   class TextFieldActionListener implements ActionListener
   {
      // implementing ActionListener
      public void actionPerformed( ActionEvent e)
      {
         for ( int i = 0; i < tf.getText().length(); i++)
         {
            hangman.tryThis( tf.getText().charAt( i));
         }
         tf.setText( "");
      }
   }
}