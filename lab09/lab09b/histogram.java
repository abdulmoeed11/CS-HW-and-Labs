import java.util.ArrayList;
/**
 * __Histogram___ 
 * @author __Abdul Moeed___
 * @version __12/14/2017__
 */ 
public class histogram
{
   public static void main( String[] args)
   {
      
     //array declaration
     ArrayList<Integer> diceSum;
      
     // variables
     Dice diceB; 

     // constants
     diceSum = new ArrayList<Integer> (11);
     diceB = new Dice();
     
     
     // program code
     
     
     //initializing the array to 0
     for (int i = 0; i < 11 ; i++ )
     {
       diceSum.add(0);
     }
     
     
     //storing the sum in array
     int store;
     for (int i = 0; i < 1000; i++)
     {         
       store = diceB.roll();   
       for (int j = 0; j < diceSum.size(); j++)
       {
         if (store - 2 == j)
           diceSum.set(j, diceSum.get(j) + 1);
       }
     }
     
     //ptinting the histogram
     histo(diceSum);
   }
   
   //Methods
     
     //getting the max diceSum
   
   /*
    * Static Method
    * getMax
    * @param ArrayList<Integer> a
    * @returns maxValue
    */ 
   
   
   public static int getMax(ArrayList<Integer> a)
   {
     int maxValue = a.get(0);
     for( int i = 1; i < a.size() ; i++ )
     {
       if ( a.get(i) > maxValue )
         {
         maxValue = a.get(i);
       }
     }
     return maxValue;
     }
   
   
   /*
    * Method
    * @param an Array
    * void
    * prints histogram
    */ 
   
   public static void histo(ArrayList<Integer> a)
   {
     int maxStars;
     int starrep;
     maxStars = getMax (a);
     starrep = maxStars / 10 ;
     System.out.print("Max freq is " + maxStars);
     System.out.println();
     int w = 9 ;
     for (int y = 0 ; y < 10 ; y++)
     { 
       for( int x = 0 ; x < 11 ; x++)
       {
         if (( a.get(x)) > w * starrep )
         {
           System.out.print("*");
         }
         else
           System.out.print(" ");
       }
       w--;
       System.out.println();
     } 
   
   }
}