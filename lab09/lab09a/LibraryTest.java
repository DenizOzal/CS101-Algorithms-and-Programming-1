import java.util.Scanner;

/**
 * __program description___ 
 * @author __Deniz Semih ?zal___
 * @version __date__
 */ 
public class LibraryTest
{
  //First Menu
  public static int options()
  {
    Scanner scan = new Scanner( System.in);
    
    System.out.println ( "****************");
    System.out.println ( "Choose one option from Library");
    System.out.println ( "1-Show");
    System.out.println ( "2-Find");
    System.out.println ( "3-Add");
    System.out.println ( "4-Exit");
    System.out.println ( "****************");
    
    return scan.nextInt();
  }
  //Second Menu( Find option)f
  public static int extraOptions()
  {
    Scanner scan = new Scanner( System.in);
    
    System.out.println ( "****************");
    System.out.println ( "1-Loan");
    System.out.println ( "2-Return");
    System.out.println ( "3-Remove");
    System.out.println ( "4-Exit");
    System.out.println ( "****************");
    
    return scan.nextInt();
  }
  
  
  
  public static void main( String[] args)
  {
    Scanner scan = new Scanner( System.in);
    
    Library library;
    library = new Library();
    boolean continue0;
    continue0 = true;
    
    while ( continue0)
    {
      int choose;
      choose = options();
      if ( choose == 1)
      {
        System.out.println( library.toString());
      }
      else if ( choose == 2)
      {
        System.out.println( "Enter the title of the book");
        String title;
        title = scan.nextLine();
        LibraryBook book;
        book = library.findByTitle( title);
        if ( book == null)
        {
          System.out.println ( "There is no available book");
        }
        else
        {
          boolean continue1;
          continue1 = true;
          while ( continue1)
          {
            int choose1;
            choose1 = extraOptions();
            if ( choose1 == 1)
            {
              if ( book.onLoan())
              {
                System.out.println ( "It is already loaned!!");
              }
              else 
              {
                String dueDate;
                
                System.out.println ( "To loan until...");
                dueDate = scan.nextLine();
                book.loanBook( dueDate);
                
                
                System.out.println ( "Book is loaned now");
              }
            }
            else if ( choose1 == 2)
            {
              if ( book.onLoan())
              {
                book.returnBook();
                System.out.println ( "Book is returned!");
              }
              else
              {
                System.out.println ( "There is no book to be returned");
              }
            }
            else if ( choose1 == 3)
            {
              library.remove( book);
              System.out.println( "The book is removed");
              continue1 = false;
            }
            else if ( choose1 == 4)
            {
              continue1 = false;
            }
            
          }
        }
      }
      else if ( choose == 3)
      {
        String title;
        String author;
        System.out.println ( "Please enter new title");
        title = scan.nextLine();
        System.out.println ( "Please enter new author");
        author = scan.nextLine();
        library.add( title, author);
      }
      else if ( choose == 4)
      {
        continue0 = false;
      }
    }
  }
}






























