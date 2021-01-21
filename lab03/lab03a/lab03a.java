import java.util.Scanner;

/**
 * __program description___ 
 * @author __your name___
 * @version __date__
 */ 
public class lab03a
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // constants

      // variables
        int n;
        int even;
        int odd;
        int sum1;
     int sum2;
        //initializing
        even=0;
        odd=0;
        n=0;
        sum1 =0;
      // program code
         n = scan.nextInt();
      
for ( int x = 0; x <= 50; x++ ) 
{      
      
    System.out.print(x + " ");
    
   if (x < 12 ||  x > 25)
  {
    System.out.print("out of range 12-25 ");
  }
   
   if (x%2 == 0)
   {
     even = even +1;
   } else
   {
     odd = odd + 1;
   }
   
   if (x%5 == 0 && x!=0)
   {
     System.out.println("High Five ");
   }
   else if (x%2 == 0 && x!=0)
   {
     System.out.println("High Two");
   } 
    else if (x%3 ==0 && x!=0)
   {
     System.out.println("High ThreeOrSeven");   
   }
    else if (x%7 == 0 && x!=0)
   {
     System.out.println("High ThreeOrSeven");
   }
    else
    {
      System.out.println("Hi Others");
    }
    
    if (x>=0 && x<=n)
    {
      sum1 = x + sum1;
    }
    
}

      System.out.println("The number of even numbers are " + even);
      
      System.out.println("The number of odd numbers are " + odd);
      
      sum2= (n * (n + 1))/2 ;
      if (sum1== sum2)
      {System.out.println("values are same");
      } else
      {System.out.println("values are not same");
      }
      System.out.println( "End.");
   
      scan.close();
   }

}