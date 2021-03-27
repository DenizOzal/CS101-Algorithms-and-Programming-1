import java.util.Scanner;

/**
 * __program description___ 
 * @author __your name___
 * @version __date__
 */ 
public class Lab04d
{
  public static char design( char ch, int width)
  {
    int i;
    int line;
    for (  line = 0; line < width; line++)
    {
      for ( i = 0; i <= line; i++);
      {
        System.out.print ( ch);
      }
      System.out.println();
    }
    return ch;
  }
  
  
  public static void main( String[] args)
  {
    Scanner scan = new Scanner( System.in);
    
    // constants
    
    // variables
    /*
     char ch;
     int width;
     int line;
     int i;
     // program code
     ch = scan.next().charAt(0);
     width = scan.nextInt();
     for ( line = 0; line < width; line++)
     {
     for ( i = 0; i <= line; i++)
     {
     System.out.print ( ch);
     }
     System.out.println();
     }
     */
    /*
     char character;
     int a;
     character = scan.next().charAt(0);
     a = scan.nextInt();
     System.out.println ( design( character, a));
     */
    /*
     int heigth;
     int odd;
     int line;
     int number;
     odd = 1;
     heigth = scan.nextInt();
     for ( line = 1; line <= heigth; line++)
     {
     for ( number = 1; number <= odd; number++)
     {
     System.out.print ( number);
     
     }
     System.out.println();
     odd +=2;
     }
     */
    int width;
    width = scan.nextInt();
    int line;
    int i;
    int number;
    number = 1;
    int space;
    space = width - 1;
    for ( line = 0; line < width; line++)
    {
      for ( i = 1; i <= space; i++)
      {
        System.out.print ( " ");
      }
      for ( int k = 1; k <= number; k++)
      {
        System.out.print ( k);
      }
      
      System.out.println();
      space--;
      number += 2;
    }
    
    
    
    
    
    
    
  }
  
}