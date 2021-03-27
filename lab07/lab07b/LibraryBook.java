// header comment
public class LibraryBook
{
  // properties
  String title;
  String author;
  String dueDate;
  int timesLoaned;
  boolean holded;
  
  // constructors
  public LibraryBook( String title, String author, int timesLoaned)
  {
    this.title = title;
    this.author = author;
    this.dueDate = "";
    this.timesLoaned = timesLoaned;
    holded = false;
  }
  // methods 
  public void loanBook( String dueDate)
  {
    if ( holded == true)
    {
      System.out.println ( "Ýt is already holded");
    }
    else
    {
      this.dueDate = dueDate;
      timesLoaned++;
      holded = true;
    }
  }
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
    
    
  }
  public int getTimesLoaned()
  {
    return this.timesLoaned;
  }
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
  
  
  public String toString()
  {
    return ( title + " " + author + " " + dueDate + " " + timesLoaned);
  }
  
  
  
}