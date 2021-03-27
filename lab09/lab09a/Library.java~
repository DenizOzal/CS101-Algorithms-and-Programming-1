import java.util.ArrayList;
public class Library
{
  ArrayList<LibraryBook> books; 
  
  // Constructor method
  public Library()
  {
    books = new ArrayList<LibraryBook>();
  }
  
  // A method whether Library is empty or not
  public boolean isEmpty()
  {
    if ( books.size() == 0)
      return true;
    else
      return false;
  }
  
  // A method that returns this Library object as a string 
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
      for ( int i = 0; i < books.size(); i++)
      {
        copy = copy + books.get(i) + "\n";
      }
    }
    
    return copy;
  }
  
  // A method to add a new book to the library
  public void add( String title, String author)
  {
    LibraryBook book;
    book = new LibraryBook( title, author);
    
    books.add( book);
  }
  
  // A method to remove a book from the library
  public boolean remove( LibraryBook book)
  {
    boolean copy = true;
    
    for ( int i = 0; i < books.size(); i++)
    {
      if ( books.get( i).equals( book))
      {
        books.remove( i);
        copy = true;
      }
    }
    
    
    return copy;
  }
  
  
  // A method that checks title and the book
  public LibraryBook findByTitle( String title)
  {
    LibraryBook book;
    book = null;
    
    for ( LibraryBook find_book : books)
    {
      if ( find_book.getTitle().equals( title))
        book = find_book;
    }
    
    return book;
  }
}