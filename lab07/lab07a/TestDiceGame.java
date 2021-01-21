/**
 * __Test dice game___ 
 * @author __Abdul Moeed___
 * @version __30.11.2017__
 */ 


public class TestDiceGame
{
   public static void main( String[] args)
   {
      // Variable
      
      DiceGame game;
      
      // Program Code
      
      game = new DiceGame();
      
      System.out.println( "Number of tries to get 2 sýxes: " + game.play() );
   }
}