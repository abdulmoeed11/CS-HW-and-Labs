import java.util.Scanner;

/**
 * __Flowers___ 
 * @author __Abdul Moeed___
 * @version __19-10-2017__
 */ 
public class lab03b
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // constants
      // Number of flowers in each square meter is 17 so
         final double flowersPerMeter = 17 ;

      // variables
      //length of sides of Tr�angle
         double a;
         double b;
         double c;
      //Semi-Perimeter
         double s;
      //Area of Triangle
         double area;
      //Total flowers that can be planted
         int totalFlowers;

      // program code
         System.out.println( "Start...");
      
         System.out.print("Enter side A");
         a = scan.nextDouble();
               
         System.out.print("Enter side B");
         b = scan.nextDouble();
               
         System.out.print("Enter side C");                 
         c = scan.nextDouble();
      if ((a >= b +c) || (b>= a + c) || (c>=a + b))
      {
        System.out.println("Values are invalid");
      } else
      {
        
        s = (a + b + c)/2 ;
        System.out.println("Semi-Perimeter is " + s );
      
         
         area = Math.sqrt(  s * ((s - a) * (s - b) * (s - c)));
         System.out.println("Area is " + area );
                       
         totalFlowers = (int) (area * flowersPerMeter) ;
         
         System.out.println("The total number of flowers that can be planted are " + totalFlowers );                 
                       
      }                
      


            System.out.println( "End.");
   }

}