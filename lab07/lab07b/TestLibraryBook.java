import java.util.Scanner;

/**
 * __program description___ 
 * @author __your name___
 * @version __date__
 */ 
public class TestLibraryBook
{
   public static void main( String[] args)
   {
     LibraryBook theMetamorphosis = new LibraryBook( "The Metamorphosis", "Franz Kafka", 1);
     LibraryBook crimeAndPunishment = new LibraryBook ( "Crime and Punishment", "Fyodor Dostoyevski",5);
     System.out.println ( theMetamorphosis);
     System.out.println ( crimeAndPunishment);
      
     theMetamorphosis.loanBook( "11/26/2019");
     System.out.println ( theMetamorphosis.getTimesLoaned());
     System.out.println ( theMetamorphosis.onLoan());
 
     theMetamorphosis.returnBook();
     System.out.println ( theMetamorphosis.onLoan());
      
    
   }

}