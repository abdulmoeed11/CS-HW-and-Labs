import java.util.Scanner;

/**
 * __Library Test___ 
 * @author __Abdul Moeed___
 * @version __12/7/2017__
 */ 
public class LibraryTest
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // constants

      // variables
      Library bilkent;
      String command;
      String command2;
      String userTitle;
      String userAuthor;
      String date;
      LibraryBook book1;
      
      //initializing
      command = "";
      command2 = "";
      
      // program code
      bilkent = new Library();
      
      do
      {
        System.out.print("Enter a command Show, Add, Find, Exit");
        command = scan.nextLine();
        
        System.out.println();
        
        if ( command.equals("Show") )
        {
          System.out.println(bilkent);
        }else if (command.equals("Find") )
        {
          System.out.println("Please Enter Title");
          userTitle = scan.nextLine();
          book1 = bilkent.findByTitle( userTitle );
          if ( book1 == null)
          {
            System.out.println("No book");
          }else
          {
          System.out.println();
            
          System.out.println(" Do you want to Loan, Return or Remove or go to Main?");
          command2 = scan.nextLine();
          if  ( command2.equals("Loan") )
            {
            System.out.println("Enter Due Date");
            date = scan.nextLine();
            if ( book1.onLoan() == true)
            {System.out.println("Cannot be loaned");}else{
              book1.bookLoan( date );}
            }else
              if (command2.equals("Return"))
            {
              book1.bookReturn();
            }else 
              if (command2.equals("Remove"))
            {
              bilkent.remove( book1 );
            }
          }
        }else if (command.equals("Add"))
        {
         System.out.println("Give a Title");
         userTitle = scan.nextLine();
         
         System.out.println("Author's name");
         userAuthor = scan.nextLine();
         bilkent.add( userTitle, userAuthor );
        }
          
      }while (!command.equals("Exit"));
        
      
      
   }
      
}