package obj;
public class Library
{
  // Properties
  LibraryBook b1;
  LibraryBook b2;
  LibraryBook b3;
  LibraryBook b4;
  
  // Constructor method
  public Library()
  {
    b1 = null; 
    b2 = null;
    b3 = null;
    b4 = null;
  }
  
  // A method that checks if library is empty
  public boolean isEmpty()
  {
    if ( b1 == null && b2 == null && b3 == null && b4 == null)
      return true;
    else
      return false;
  }
  
  // A method that returns this Library object as a string including books
  public String toString()
  {
    String copy;
    copy = "";
    
    if (isEmpty())
    {
      copy = copy + "There is no book in library ";
    }
    else 
    {
      copy = copy + " Available books"+ "\n";
      if (b1 != null)
      {
        copy = copy + b1+"\n";
      
      }
      if (b2 != null)
      {
        copy = copy + b2+"\n";
     
      }
      if (b3 != null)
      {
        copy = copy + b3+"\n";
       
      }
      if (b4 != null)
      {
        copy = copy + b4+"\n";
     
      }
    }
    
    return copy;
  }
  
  // A method to add a new book to the library
  public void add( String title, String author)
  {
    LibraryBook newBook;
    newBook = new LibraryBook( title, author);
    
    if ( b1 == null)
    {
      b1 = newBook;
    }
    else if ( b2 == null)
    {
      b2 = newBook;
    }
    else if ( b3 == null)
    {
      b3 = newBook;
    }
    else if ( b4 == null)
    {
      b4 = newBook;
    }
  }
  
  // A method to remove a book from the library
  public boolean remove( LibraryBook book)
  {
    boolean copy = true;
    
    if ( b1.equals( book) && b1 != null)
    {
      b1 = null;
    }
    else if ( b2.equals( book) &&  b2 != null)
    {
      b2 = null;
    }
    else if ( b3.equals( book) && b3 != null)
    {
      b3 = null;
    }
    else if ( b4.equals( book) && b4 != null)
    {
      b4 = null;
    }
    
    return copy;
  }
 
  
  // A method to get a book by it's title
  public LibraryBook findByTitle( String title)
  {
    LibraryBook book;
    book = null;
    
    if ( b1.getTitle().equals( title) && b1 != null)
    {
      book = b1;
    }
    else if ( b2.getTitle().equals( title) && b2 != null)
    {
      book = b2;
    }
    else if ( b3.getTitle().equals( title) && b3 != null)
    {
      book = b3;
    }
    else if ( b4.getTitle().equals( title) && b4 != null)
    {
      book = b4;
    }
    
    return book;
  }
}