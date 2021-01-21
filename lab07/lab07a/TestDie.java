/**
 * __Test Die___ 
 * @author __Abdul Moeed___
 * @version __30.11.2017__
 */ 

public class TestDie
{
   public static void main( String[] args)
   {
      // Variables
      
      Die diceA;
      Die diceB;
      
      // Program Code
      
      diceA = new Die();
      diceB = new Die();
      
      // Rolls the dice 1 and gets the new value
      
      diceA.roll();
      System.out.println(  diceA.getFaceValue() );
      
      //Rolls the dice 2 and gets the new value
      
      diceB.roll();
      System.out.println( diceB.getFaceValue() );
      
      System.out.println( diceA );
      System.out.println( diceB );
   }
}