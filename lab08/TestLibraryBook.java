import obj.*;
import java.util.Scanner;


public class TestLibraryBook
{
  public static void main( String[] args)
  {
    
    // These are the some examples of books
    LibraryBook book1;
    LibraryBook book2;
    LibraryBook book3;
    LibraryBook book4;
    LibraryBook book5;
    
    book1 = new LibraryBook( "Title1", "Author1");
    book2 = new LibraryBook( "Title2", "Author2");
    book3 = book1;
    book4 = new LibraryBook( "Title2", "Author2");
    book5 = new LibraryBook( book4);
   
    
    
    
    // a) Two references to a single object
    System.out.println ( book5 == book4);
    System.out.println ( book5.equals( book4));
    System.out.println();
    
    // b) two references to two individual objects with different properties
    System.out.println ( book1 == book2);
    System.out.println ( book1.equals( book2));
    System.out.println();
    
     // c) two references to two individual objects with identical relevant properties
    /*
    book4 = book2.clone();
    System.out.println ( book4 == book2);
    System.out.println ( book4.equals( book2));
    */
    //  c) two references to two individual objects with identical relevant properties
    System.out.println ( book2 == book4);
    System.out.println ( book2.equals( book4));
    
    // Checking the other methods
    System.out.println ( book1.hasSameTitle( book2));
    System.out.println ( book2.hasSameAuthor( book4));
    
    //
    
    
    
    
    
  }
  
}