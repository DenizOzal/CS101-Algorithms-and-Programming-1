package obj;
public class LibraryBook
{
  // properties
  private String title;
  private String author;
  private String dueDate;
  private int timesLoaned;
  private boolean holded;
  
  // constructors
  
  public LibraryBook( String title, String author)
  {
    this.title = title;
    this.author = author;
    dueDate = "";
    this.timesLoaned = timesLoaned;
    holded = false;
  }
  // copy constructor 
  
  public LibraryBook( LibraryBook checkBook)
  {
    title = checkBook.title;
    author = checkBook.author;
    dueDate = checkBook.dueDate;
    timesLoaned = checkBook.timesLoaned;
    holded = checkBook.holded;
  }
  
  // The method whether checks the title and author are same or not
  
  public boolean equals( LibraryBook checkBook)
  {
    boolean check;
    check = false;
    if ( title.equals( checkBook.title) && author.equals( checkBook.author))
    {
      check = true;
    }
    return check;
  }
  
  // The method that gives the title
  public String getTitle()
  {
    return title;
  }
  
  
  // The method that arranges the due date( When the new due date is arranged, the number of time of loan increases)
  public void loanBook( String dueDate)
  {
    if ( holded == true)
    {
      System.out.println ( "?t is already holded");
    }
    else
    {
      this.dueDate = dueDate;
      timesLoaned++;
      holded = true;
    }
  }
  // The method that resets the due date
  public void returnBook()
  {
    if ( holded == true)
    {
      dueDate = "";
      holded = false;
    }
    else
    {
      System.out.println ( "There is no book to be returned");
    }
    
    // The method that gives the information that how many times the book is loaned
  }
  public int getTimesLoaned()
  {
    return this.timesLoaned;
  }
  // The method is to learn whether it is already loaned or not
  public boolean onLoan()
  {
    if ( holded == true)
    {
      return true;
    }
    else
    {
      return false;
    }
  }
  // The method that converts to string
  
  public String toString()
  {
    return ( title + " " + author + " " + timesLoaned);
  }
  // The method whether checks titles are same or not
  
  public boolean hasSameTitle( LibraryBook checkBook)
  {
    return title.equals( checkBook.title);
  }
  // The method whether checks authors same or not
  
  public boolean hasSameAuthor( LibraryBook checkBook)
  {
    return author.equals( checkBook.author);
  }
  // The method that clons the book
  public LibraryBook clone()
  {
    LibraryBook copy;
    copy = new LibraryBook ( title, author);
    copy.dueDate = dueDate;
    copy.timesLoaned = timesLoaned;
    copy.holded = holded;
    
    return copy;
  }
  // The method that returns the LibraryBook object
  public String toMyString()
  {
    String copy;
    copy = "The title of the book: " + title + "\nThe author of the book: " + author;
    
    if ( onLoan())
    {
      copy = copy + "The book could not found";
      System.out.println();
    }
    else
    {
      copy = copy + "The book is available";
      System.out.println();
    }
    return copy;
  }
    
  
  
  
  
  
}