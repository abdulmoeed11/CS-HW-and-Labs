import java.util.Scanner;

/**
 * __program description___ 
 * @author __your name___
 * @version __date__
 */ 
public class lab04a
{
   public static void main( String[] args)
   {

      // constants
     Scanner scan = new Scanner( System.in);
     
      // variables
     int x;
     int n;
     int count;
     
     
     //initializing
     count = 0;
     x = 0;
     
     System.out.print( "Enter n" );
     n = scan.nextInt();
     
     if ( n < 0)
     {
       System.out.println( "Stop" );
     }else
       
     {

      // program code
      System.out.println( "Start...");
      
      while ( n > x)
      {
        x = x + 1;
        System.out.print( x + " " );
        
        
      }
      
      System.out.println();
      
      x = 0;
      count = 0;
      
     while ( n > x)
     {
       x = x + 1;
         count = count + 1;
         
         if ( count % 5 == 0)
         {
           System.out.print( x + " ");
           System.out.println();
           
         } else
           
         { 
           System.out.print( x + " ");
         }
           
     }
     
     System.out.println();
     
     x = n;
     count = 0;
     
     while ( x != -1 )
       
     {
       System.out.print( x + " ");
       x = x - 1;
         
     }
     
     System.out.println();
       
        count = -n;
        while (count >= -n && count <= n )
     {
        if ( count % 2 == 0 )
        { System.out.print( + count + ( " " ));
          count++;
        } 
        else
        {
           count++;
        }   
     }  
         System.out.println();
        
     }

      System.out.println( "End.");
   }}
   

