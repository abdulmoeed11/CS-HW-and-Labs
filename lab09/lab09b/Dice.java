/**
 * __Dice___ 
 * @author __Abdul Moeed___
 * @version __30.11.2017__
 */ 

public class Dice
{
   // properties
   

   int total;
   Die die1;
   Die die2;
   // constructors
   
   public Dice () 
   {
     die1 = new Die();
     die2 = new Die();
   }
   
   // methods
   
   /**
    * This method rolls two dies and  returns the total
    * @return The sum of dies
    */
   
   public int roll()
   {
     return die1.roll() + die2.roll();
   }
   
   public int getDiceTotal()
   {
     return getDie1FaceValue() +  getDie2FaceValue();
   }
   
   /**
    * This method gets the value of the first die.
    * @return The value of the first die
    */
   
   public int getDie1FaceValue()
   {
     return die1.getFaceValue();
   }
   
   /**
    * This method gets the value of the second die.
    * @returns value of the 2nd die
    */
   
   public int getDie2FaceValue()
   {
     return die2.getFaceValue();
   }
   
   /**
    * This method converts the data into string
    * @return The string value of the two dice
    */
   
   public String toString()
   {
     return "Die 1 : " + getDie1FaceValue() + " Die 2 : " + getDie2FaceValue() +
       " Dice total: " +( getDie1FaceValue() + getDie2FaceValue() );
   }
   
}