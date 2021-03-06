import java.util.ArrayList;
/**
 * @author Deniz Semih ?zal
 */ 
public class RollingDice
{
  public static void main( String[] args)
  {
    // Declaring variables & constants
    ArrayList<Integer> data = new ArrayList<Integer>();
    Dice dice = new Dice();
    final int noOfRolls = 1000;
    
    
    for ( int i = 1; i <= noOfRolls; i++)
      data.add( dice.roll());
    
    printHistogram( getFrequencyData( data));
  }
  
  // A method that gets data,  and returns it as frequencyData
  public static ArrayList<Integer> getFrequencyData( ArrayList<Integer> data)
  {
    ArrayList<Integer> frequencyData = new ArrayList<Integer>();
    
    for ( int i = 2; i <= 12; i++)
      frequencyData.add( 0);
    
    for ( int i = 2; i <= 12; i++)
    {
      for ( int vary : data)
      {
       
        if (vary == i)
          frequencyData.set( i - 2,  frequencyData.get( i - 2) + 1);
      }
    }
    
    return (frequencyData);
  }
  
  // A method that gets frequencyData, and returns it as histogramData
  public static ArrayList<Integer> getHistogramData (ArrayList<Integer> frequencyData)
  {
    ArrayList<Integer> histogramData = new ArrayList<Integer>();
    int maximum = 0;
    
    for ( int vary : frequencyData)
    {
      if (vary > maximum)
        maximum = vary;
    }
    
    int maximumBarSize = maximum / 10;
    
    for ( int vary : frequencyData)
    {
      histogramData.add( vary / maximumBarSize);
    }
    
    return (histogramData);
  }
  
  // A method that prints the histogram
  public static void printHistogram( ArrayList<Integer> frequencyData)
  {
    System.out.println( "Frequency Data: " + frequencyData);
    System.out.println();
    System.out.println( "Histogram Data: " + getHistogramData( frequencyData));
    System.out.println();
    for ( int i = 0; i < 10; i++ )
    {
      for ( int vary : getHistogramData( frequencyData) )
      {
        if ( 10 - i <= vary)
          System.out.print( "*");
        else 
          System.out.print( " ");
      }
      
      System.out.println();
    }
  }
}