/**
 * __Dice Game___ 
 * @author __Abdul Moeed___
 * @version __30.11.2017__
 */ 
public class DiceGame
{
   // Properties
   
   Dice dice1;
   int count;
   
   // Constructors
   
   public DiceGame()
   {
      dice1 = new Dice();
   }
   
   // method
    /**
    * This methods 2 dices until both are six.
    * @return The number of tries to get two sixes
    */
   
   public int play()
   {
     count = 1;
      while( dice1.roll() != 12 )
      {
         count++;  
      }
      return count;
   }
}
      