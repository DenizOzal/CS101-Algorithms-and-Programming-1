
/**
 * GallowsHangmanView - creates gallows hangman view.
 *
 * @author Deniz Semih ?zal
 * @version 15/04/2020
 */
package hangmangame.extras;

import javax.swing.*;
import java.awt.*;
import cs102.hangman.Hangman;
import cs102.hangman.IHangmanView;
import java.awt.geom.*;

public class GallowsHangmanView extends JPanel implements IHangmanView
{
   // properties
   private Hangman hangman;
   private JLabel resultLabel;
   
   // constructors
   public GallowsHangmanView( Hangman hangman)
   {
      super();
      this.hangman = hangman;
      resultLabel = new JLabel();
      setLayout( new BorderLayout());
      add( resultLabel, BorderLayout.WEST);
      setPreferredSize( new Dimension( 200,200));
      setBackground( Color.cyan);
      
   }
   // methods
   
   // @Override
   /*
    * draws a piece of hangman in every incorrect try
    * @param g in type of Graphics
    */
   public void paintComponent(Graphics g)
   {
      super.paintComponent( g);
      Graphics2D g2 = (Graphics2D) g; 
      g2.setStroke(new BasicStroke(5,BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL));
      g2.setColor(Color.BLACK); 
      g.drawLine( 50, 30, 50, 10);
      g.drawLine( 50, 10, 130, 10);
      g.drawLine( 130, 10, 130, 300);
      g.drawLine( 20, 300, 150, 300);
      resultLabel.setText( "");
      if (hangman.getNumOfIncorrectTries()>=1)
      {
         //draws the head
         g2.setStroke(new BasicStroke(3,BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL));
         Ellipse2D.Double head = new Ellipse2D.Double( 25, 30, 50, 50);
         g2.draw(head); 
         
         if (hangman.getNumOfIncorrectTries()>=2)
         {
            //draws the body
            g.drawLine(50, 80, 50, 180);
            if (hangman.getNumOfIncorrectTries()>=3)
            {
               //draws the left arm
               g.drawLine(10, 150, 50, 100);
               if (hangman.getNumOfIncorrectTries()>=4)
               {
                  //draws the right arm
                  g.drawLine(50, 100, 90, 150);
                  if (hangman.getNumOfIncorrectTries()>=5)
                  {
                     //draws the left leg
                     g.drawLine(30, 250, 50, 180);
                     if (hangman.getNumOfIncorrectTries()>=6)
                     {
                        //draws the right leg
                        g.drawLine(50, 180, 70, 250);
                        if ( hangman.hasLost())
                           resultLabel.setText( "LOST!!");
                     }
                  } 
               }
            }
         }
      }
   }
   
   // implementing IHangmanView
   public void updateView( Hangman hangman)
   {
      repaint();
   } 
}
