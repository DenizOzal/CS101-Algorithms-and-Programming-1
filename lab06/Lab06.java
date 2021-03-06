
import java.util.Scanner;

/**
 * Methods
 * @author Deniz Semih ?zal
 * @version 12.11.2019
 */
public class Lab06 
{
  
  /**
   * Returns a double resultwer, x to power of y.
   * @param x : Radix
   * @param y : Exponent
   * @return double x^y
   */
  static double power( double x, int y ) 
  {
    double result;
    result = 1;
    for( int i = 0; i< y; i++ ) 
    {
      result *= x;
    }
    return result;
  }
  
  /**
   * Returns a double result, n factorial.
   * @param n
   * @return double n!
   */
  static double factorial( int n ) 
  {
    double result;
    result = 1.0;
    for( int i = n; i>0; i-- ) 
    {
      result *= i;
    }
    return result;
  }
  
  /**
   * Returns a string where letters are reversed for each word.
   * @param s
   * @return String reverse
   */
  static String reverse ( String s)
  {
    int i;
    String reverse = "";
    
    for ( i = s.length() - 1; i >= 0; i--)
    {
      reverse = reverse  + s.charAt(i);
    }
    
    return reverse;
  }
  
 
  
  
  /**
   * Returns the decimal literal for the given binary number.
   * @param String base2
   * @return int sum
   */
  
  
  public static int toDecimal( String base2)
  {
    int total = 0;
    int a = 0;
    int sum = 0;
    
    for ( int i = base2.length() - 1; i >= 0; i--)
    {
      if ( base2.charAt(i) == '0')
      {
        total = 0 * (int) power( 2 , a);
        a++;
        
      }
      else if ( base2.charAt(i) == '1')
      {
        total = 1 * (int) power( 2 , a);
        a++;
      }
      sum += total;
    }
    return sum;
  }
  
  
  /**
   * Returns a string representing the binary format of given decimal integer.
   * @param int base 10
   * @return Integer.toBinaryString(base 10)
   */
  
  public static String toBinary( int base10)
  {     
    if ( base10 <= 0 )
    {
      System.out.println("The input must be positive !");
      return "" ;
    }
    return Integer.toBinaryString( base10 );      
  }
  
// Sixth: Comparing the datas
  /**
   * Finding sin(x) .
   * @param x : Angle (in radian)
   * @param repetition
   * @return double sin(x)
   */
  static double sin( double x, int repetition ) 
  {
    double previousOne;
    double sum;
    previousOne = x;
    sum = x;
    
    
    for( int i = 1; i < repetition; i++ ) 
    {
      previousOne *= (-1 * x * x ) / ( 2 * i * ( 2 * i + 1 ) );
      sum += previousOne;
    }
    return sum;
  }
  
  public static void main( String[] args ) {
    // Variables
    Scanner in = new Scanner( System.in );
    String line;
    String myInput;
    String myString;
    double x;
    double sum;
    
    // First
    System.out.println( "First: ");
    System.out.println( " n    n2    n3     n4" );
    for( int i = -1; i <= 10; i++ ) 
    {
      System.out.format("%2d %5.0f %5.0f %6.0f\n", i, power(i, 2), power(i, 3), power(i, 4) );
    }
    System.out.println();
    
    // Second
    System.out.println( "Second:" );
    
    
    System.out.println( " n\t         n!" );
    for( int i = 1; i <= 15; i++ ) 
    {
      System.out.format("%2d %15.0f\n", i, factorial(i) );
    }
    
    System.out.println();
    
    
    // Third
    
    System.out.println ("Enter 2 values");
    myInput = in.next();
    myString = in.next();
    System.out.println ( "Result: " + toBinary( toDecimal(myInput) + toDecimal(myString)));
    
    
    // Fourth
    
    System.out.println( "Fourth:" );
    System.out.println( "Please enter a line" );
    
    line = in.next();
    
    System.out.println( "Reversed form:" );
    System.out.println( reverse( line ) );
    
    System.out.println();
    
    
    // Fifth
    System.out.println( "Fifth:" );
    
    
    System.out.print( "Enter an angle: " );
    x = in.nextDouble();
    in.close();
    sum = 0;
    
    System.out.print( " n (-1)^n    x^(2*n+1)     (2*n+1)!   Current term      Sum\n" );
    for( int i = 0; i <= 10; i++ ) 
    {
      // Variables
      int pow1;
      double pow2;
      double term;
      double fact;
      
      
      pow1 = (int) power( -1, i );
      pow2 = power( x, ( 2 * i + 1 ) );
      fact = factorial( 2 * i + 1 );
      term = pow1 * pow2 / fact;
      sum += term;
      
      
      System.out.format( "%2d %6d  %12f  %1.5E %10f  %14f\n", i, pow1, pow2, fact, term, sum );
    }
    
    System.out.println();
    
    
    // Sixth 
    System.out.println( "Sixth:" );
    System.out.println( " n     Sum      sin(x)" );
    for( int i = 0; i <= 10; i ++) 
      
    {
      System.out.format("%2d   %6f %10f\n", i, sin(x, i), Math.sin(x));
    }
    System.out.println ( "Thank you!");
  }
  
  
}

