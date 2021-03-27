import java.util.Scanner;

/**
 * __program description___ 
 * @author __Deniz Semih Özal___
 * @version __26/11/2019__
 */ 
public class TestLibraryBook
{
  public static void main( String[] args)
  {
    // These are the some examples of books
    LibraryBook theMetamorphosis = new LibraryBook( "The Metamorphosis", "Franz Kafka", 1);
    LibraryBook crimeAndPunishment = new LibraryBook ( "Crime and Punishment", "Fyodor Dostoyevski",5);
    
    // Demonstrating with using toString method
    System.out.println ( theMetamorphosis.toString());
    System.out.println ( crimeAndPunishment.toString());
    
     // Demonstrating without using toString method
    System.out.println ( theMetamorphosis);
    System.out.println ( crimeAndPunishment);
    
    // Loan the book until...
    theMetamorphosis.loanBook( "11/26/2019");
    crimeAndPunishment.loanBook( "12/01/2019");
    
    // How many times it is holded?
    System.out.println ( theMetamorphosis.getTimesLoaned());
    System.out.println ( crimeAndPunishment.getTimesLoaned());
    
    // Is it already holded??
    System.out.println ( theMetamorphosis.onLoan());
    System.out.println ( crimeAndPunishment.onLoan());
    
    // Return the book
    theMetamorphosis.returnBook();
    crimeAndPunishment.returnBook();
    
    // Final situation
    System.out.println ( theMetamorphosis.onLoan());
    System.out.println ( crimeAndPunishment.onLoan());
    
    
  }
  
}