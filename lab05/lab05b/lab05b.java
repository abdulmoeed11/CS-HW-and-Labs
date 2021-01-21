import java.util.Scanner;

/**
 * __lab 05b___ 
 * @author __Abdul Moeed___
 * @version __11/2/17__
 */ 
public class lab05b
{
   public static void main( String[] args)
   {
      

      // constants
      
      Scanner scan = new Scanner( System.in);

      
      // variables
      
      int rows;
      int columns;
      int count;
      

      // program code
      System.out.println("Enter rows");
        rows = scan.nextInt();
      
      System.out.println( "Enter Column");
        columns = scan.nextInt();
        
        //1.
        
        if ( rows <= 0 || columns <= 0 )
        { 
          System.out.println( "Error");
        }else
          
        {
          for ( int i = 1 ; i <= rows ; i++ )
          {
            for ( int j = 1 ; j <= columns ; j++ )
            {
              if (i < 10)
              {
                System.out.print(" ");
              }
              
              System.out.print( i + "," + j );
               
             System.out.print(" ");
            }
            System.out.println();
          }
        
        System.out.println();
        
        
        //2
      
          for ( int i = 1 ; i <= rows ; i++ )
          {
            for ( int j = 1 ; j <= columns ; j++ )
            {
              if ( ( i * j ) < 10)
              {
                System.out.print("   ");
              }
              if ( ( i * j ) >= 10 && ( i * j ) < 100 )
              {
                System.out.print("  ");
              }
              if ( ( i * j ) >= 100 && ( i * j ) < 1000 )
              {
                System.out.print(" ");
              }
              System.out.print( i * j );
               
             System.out.print(" ");
            }
            System.out.println();
          }
          
          System.out.println();
          
          //3
          count = 0;
          
          for ( int i = 0 ; i < rows ; i++ )
          {
            for ( int j = 0 ; j < columns ; j++ )
            {
              if (count < 10)
              {
                System.out.print("   ");
              }
              if ( count >= 10 && count < 100 )
              {
                System.out.print("  ");
              }
              if ( count >= 100 )
              {
                System.out.print(" ");
              }
              System.out.print( count );
               count++;
             System.out.print(" ");
            }
            System.out.println();
          
          }
           System.out.println();
          
          //4
          
          for ( int i = 1 ; i <= rows ; i++ )
          {
            for ( int j = 1 ; j <= columns ; j++ )
            {
              
              if ( j == 1)
            {
              System.out.print( i );
            }else
            {
              System.out.print("-");
            }
            System.out.print(",");
               
             System.out.print(" ");
            }
            System.out.println();
          }
          
          
          
        }
   }
}