import java.util.Scanner;

/**
 * __program description___ 
 * @author __your name___
 * @version __date__
 */ 
public class Lab04a
{
  public static void main( String[] args)
  {
    Scanner scan = new Scanner( System.in);
    
    // constants
    
    // variables
    int i;
    int value;
    int square;
    int line;
    double k;
    double sum;
    // program code
    System.out.println ( "Start...");
    value = scan.nextInt();
    
    if ( value <= 0)
    {
      System.out.println ( "Error..");
    }
    // 1
    /*
     else
     {
     i = 0;
     while ( i < value )
     {
     System.out.print( i + " ");
     if ( i % 5 == 4)
     {
     System.out.println();  
     }
     i++;
     
     }
     }
     */
    // 2
    /*
     else 
     { 
     i = value;
     while ( i >= 0)
     {
     System.out.print ( i + " ");
     i--;
     }  
     } 
     */
    /*
     //3
     else
     {
     i = -value;
     
     while ( i <= value)
     {
     if ( i % 2 == 0)
     System.out.print ( i + " ");
     i++;  
     }
     } 
     */
    /*
     // 4
     else 
     {
     i = 0;
     square = 1;
     while ( i <= value )
     {
     square = i * i;
     
     if ( i % 2 == 0)
     {
     System.out.print ( (square) + " ");
     }
     else if ( i % 5 == 4)
     {
     System.out.println();
     }
     i++;
     }
     
     }
     */
    /*
     // 5
     else
     {
     line = 0;
     while ( value >= 3 )
     {
     if (( value % 3 == 0 || value % 4 == 0) && (value % 12 != 0))
     {
     System.out.print ( value + " ");
     line++;
     }
     if ( line % 5 == 0)
     {
     System.out.println();
     }
     value--;
     }
     }
     */
    // 6
    /*
     else 
     {
     i = 1;
     while ( i <= value )
     {
     if ( value % i == 0)
     {
     System.out.print ( i + " ");
     }
     i++;
     }
     }
     */
    //7
    /*
    else
    {
      k = value;
      i = 0;
      while ( i < value )
      {
        sum = 1 / k;
        
        if ( sum > 0.01)
        {
          System.out.print( Math.floor(sum * 100) / 100 + " ");
          k--;
          i++;
          
        }
      }
    }
    */
  }
}
