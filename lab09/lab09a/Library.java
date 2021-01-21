import java.util.ArrayList;

/**
 * __Library___ 
 * @author __Abdul Moeed___
 * @version __12.7.2017__
 */ 

public class Library
{
  //properties
  
  ArrayList <LibraryBook> book; 
  
  //constructor
  public Library()
  {
    book = new ArrayList <LibraryBook>();
  }
  
  //methods
  
  /*
   * type boolean
   * returns true if no book
   */ 
  
  public boolean isEmpty()
  {
    if ( book.isEmpty() )
    {
      return true;
    }else
    {
      return false;
    }
  }
  /*
   * represents one book per line of the library
   * returns one book per line of the library
   * returns message if library is empty
   */ 
  
  
  public String toString()
  {
    String result = "";
    
    if ( book.isEmpty() )
    {
      return "Library is empty";
    }else
    {
      for (LibraryBook i : book)
      {
        result = result + i.toString() + '\n' ;
      }
      return result;
    }
  }
  
/*
 * declares a new book
 * with title and author name
 * returns boolean true/ false
 * boolean isn't needed
 */ 
  
  
  public void add( String title , String author)
  {
    book.add(new LibraryBook(title ,author)); 
  }
  
  /*
   * @param LibraryBook anybook
   * removes that book
   * return true if book removed
   * returrns false if there is not book
   */ 
  
  public boolean remove(LibraryBook anyBook)
  {
    boolean removed = false;
    int i = 0;
    while ( i < book.size() )
    {
      if ( book.get(i) == anyBook )
      {
        book.remove(i);
        removed =true;
      }else
      {
        i++;
      }  
    }
    return removed;
  }
  
  
  /*
   * @param title is tile of any book
   * returns the book with the same title if available
   * otherwise returns null
   */ 
  public LibraryBook findByTitle( String title)
  {
    LibraryBook  bookX = null ;
    LibraryBook  bookT = new LibraryBook( title , "author" );
    int i;
    for( i = 0; i < book.size() ; i++ )
    {
      if(book.get(i).hasSameTitle(bookT))
      {
      bookX = book.get(i);
      }
    }
    return bookX;
  } 
  
}