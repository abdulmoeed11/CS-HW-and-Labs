/**
 * __LibraryBook___ 
 * @author __Abdul Moeed___
 * @version __12.7.2017__
 */ 

public class LibraryBook
{
  // properties
  
  private String author;
  private String dueDate;
  private int timesLoaned;
  private String title;
  private boolean loaned;
   
  
  // constructors
  
  public LibraryBook ( String title, String author)
  {
    this.title = title;
    this.author = author;
    dueDate = "";
    timesLoaned = 0;
    loaned = false;
  }
  
  //copy constructor
  public LibraryBook( LibraryBook bookE)
  {
    this.title = bookE.title;
    this.author = bookE.author;
    this.dueDate = bookE.dueDate;
    this.timesLoaned = bookE.timesLoaned;
    this.loaned = bookE.loaned;
  }
  
  // methods
  
  /**
   * The method updates the count every time a book is loaned
   * @param dueDate
   */
  
  public void bookLoan(String dueDate)
  {
    
    this.dueDate = dueDate;
    timesLoaned++;
    loaned = true;
  }
  
  /**
   * This method clears the due date value when the book is returned.
   */
  public void bookReturn()
  {
    dueDate = "";
    loaned = false;
  }
  
   /**
    * This method checks hoe many týmes the book is loaned.
    * @return The number of times book is loaned
    */
  
  public int getTimesLoaned()
  {
    return timesLoaned;
  }
  
   /**
    * This method checks the status of the book.
    * @return ýf the book is loaned or not
    */
  
  public boolean onLoan()
  {
    return loaned;
  }
  
  /**
   * Converts data into string
   * @return  string value of class
   */
  
  public String toString()
  {
    return title + "   " + author + "   " + dueDate + "   " + timesLoaned;
  }
  
  /**
   * Considers books with same Author amd name the same
   * irrespective of the due dates
   * @returns boolean true/false
   */
   public boolean equals(LibraryBook bookD)
   {
     if ( this.title.equals(bookD.title) && this.author.equals(bookD.author) )
     {
       return true;
     }else
     {
       return false;
     }
   }
   /*
    * checking if they have same title
    * @param LibraryBook
    * returns boolen true/false
    */ 
   public boolean hasSameTitle( LibraryBook bookF)
   {
     if ( this.title.equals(bookF.title) )
     {
       return true;
     }else
     {
       return false;
     }
   }
   
   /*
    * checking if they have same author
    * @param LibraryBook
    * returns boolen true/false
    */ 
   public boolean hasSameAuthor( LibraryBook bookG)
   {
     if ( this.author.equals(bookG.author) )
     {
       return true;
     }else
     {
       return false;
     }
   }
}
