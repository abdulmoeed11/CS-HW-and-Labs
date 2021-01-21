/**
 * __Die Class___ 
 * @author Abdul Moeed
 * @version 30.Nov.2017
 */ 
public class Die
{
   // properties
   
   private int faceValue;

   // constructors

   public  Die()
   {
    faceValue = roll();
   }
   
   // methods
   
   /**
    * This method genertaes a new face value
    * @return th new value of the die
    */
   
   public int roll()
   {
      faceValue = ( int ) ( Math.random() * 6 ) + 1;
      return faceValue;
   }
   
   /**
    * This method returns the current value of the die.
    * @return the value of the die
    */
   
   public int  getFaceValue()
   {
      return faceValue;
   }
   
   /**
    * This method turns the data in the die class to string.
    * @return The string value of die
    */
   public String toString()
   {
      return "Value of dice: " + faceValue;
   }
   
}