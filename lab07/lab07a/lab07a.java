/**
 * __Old Method Dice___ 
 * @author __Abdul Moeed___
 * @version __30.11.2017__
 */ 

public class lab07a
{
   public static void main( String[] args)
   {
     
     //constant
     final int sum = 12;
     // Variables 
     
     int dice1;
     int dice2;
     int count;
     
      // Initialization
     
     count = 0;
     
     // Program code
     
     do
     {
       
         dice1 = ( int ) ( Math.random() * 6 ) + 1;
         dice2 = ( int ) ( Math.random() * 6 ) + 1;
         count = count + 1;
     }while( (dice1 + dice2) != sum );
      
     System.out.println( " Total no of Rolls made are " + count );
     
     
   }    

}