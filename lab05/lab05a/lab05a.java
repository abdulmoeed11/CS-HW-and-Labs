import java.util.Scanner;

/**
 * __lab05a___ 
 * @author __Abdul Moeed___
 * @version __11/2/2017__
 */ 
public class lab05a
{
   public static void main( String[] args)
   {
      

      // constants
     
     Scanner scan = new Scanner( System.in);

      // variables

      // program code
      System.out.println( "Start...");
      
      
          int width;
          int thickness;
          int height;
          char chr;
          String selection;
          do
          {
          
            System.out.print("Enter Character");
            chr = scan.next().charAt(0);
            
            System.out.println();
            
            System.out.print("Enter width");
            width = scan.nextInt();
            
            System.out.println();
            
            System.out.print("Enter height");
            height = scan.nextInt();
            
            System.out.println();
          
            System.out.print("Enter thickness");
            thickness = scan.nextInt();
            
            System.out.println();
        
            if ( thickness <= 0 || width <= 0 || height <= 0 )
            {
              System.out.println( "Error");
            }else 
              
            {
              
              for ( int i = 0 ; i < height ; i ++ )
                
              {
                
                for ( int j = 0 ; j < width ; j ++ )
                
                {
                  if ( i < thickness || i >= ( height - thickness ) )
                        
                  {
                    System.out.print(chr);
                    
                  }else if ( j < thickness ||  j >= ( width - thickness ) )
                  {
                    System.out.print(chr);
                  }else
                  {
                    System.out.print(" ");
                  }
                  
                  
                }
                   System.out.println();
                }
                
                
                }
            
            System.out.print("Repeat? y/n");
            selection = scan.next();
            
          } while ( selection.equals("y") );
   }

}


