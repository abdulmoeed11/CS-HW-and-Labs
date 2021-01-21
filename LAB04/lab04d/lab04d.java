import java.util.Scanner;

/**
 * __lab04d___ 
 * @author __Abdul Moeed___
 * @version __26 - 10 - 17__
 */ 
public class lab04d
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // constants
      
      // variables
      char ch;
      int width;
      int x;
      int y;
      
      // initýalýzýng variables
      
      x = 0;
      
      // program code
      
      
      System.out.print( "Enter Character" );
      ch = scan.next().charAt(0);
      
      System.out.println();
      
      System.out.print("Enter width");
      width = scan.nextInt();
      
      
      
      while ( x <= width)
      {
        y = 0;
         while( y <= x)
         {
           System.out.print(ch + " ");
           
           y++;
         }
         
         x++;
         System.out.println(); 
         
      }
      
      double d;
      d = 0.1;
      while ( d < 1.0 )
      {
         System.out.println( d);
         d = d + 0.1;
      }
      System.out.println( d + " <- final value after loop!");  
      
      
      
      
      
      
   }
   
   
   
   
   
   
   
   
   
   
   
   
   
}

