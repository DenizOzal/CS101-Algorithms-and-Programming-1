
/**
 * Collection of UI components to form a complete Hangman game. 
 * View components implement IHangmanView, so they can automatically update
 * whenever the hangmanModel associated with changes, changes.
 * Other components are hangman controllers that update the model.
 * @author Deniz Semih Özal
 * @version 15/04/2020
 */
package hangmangame.extras;
import cs102.hangman.HangmanModel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

public class HangmanGUIPanel extends JPanel {
   
   // properties
   HangmanModel hm;
   TextFieldControlPanel tfPanel;
   NewGameButtonControl gameButton;
   LabelsHangmanView labelsPanel;
   GallowsHangmanView gallowsView;
   HangmanLetterButtonControls letterButtons;
   
   // constructors
   public HangmanGUIPanel( HangmanModel hm) {
      this.hm = hm;
      tfPanel = new TextFieldControlPanel( hm);
      gameButton = new NewGameButtonControl( hm);
      labelsPanel = new LabelsHangmanView();
      gallowsView = new GallowsHangmanView(hm);
      letterButtons = new HangmanLetterButtonControls( hm, 13,2);
      letterButtons.addActionListener( new HangmanLetterButtonsController( hm));
      // adding view
      hm.addView( gameButton);
      hm.addView( labelsPanel);
      hm.addView( gallowsView);
      hm.addView( letterButtons);
      
      // setLayout and background 
      setLayout( new BorderLayout());
      setBackground(Color.YELLOW);
      
      // adding to the panel 
      add( tfPanel, BorderLayout.NORTH);
      add( gameButton, BorderLayout.SOUTH);
      add( labelsPanel, BorderLayout.WEST);
      add( gallowsView, BorderLayout.CENTER);
      add( letterButtons, BorderLayout.EAST);   
   } 
}
