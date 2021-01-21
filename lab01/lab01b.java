/**
 * __Lab 01b___ 
 * @author __Abdul Moeed___
 * @version __2/11/__
 */ 
public class lab01b
{
  public static void main( String[] args)
  {
    // constants
    
    // variables
    IntBag prime = new IntBag();
    int count = 0;
    int z = 0;
    
    // program code
    for (int i = 3; i < 9999; i++)
    {
      for ( int j = 2; j < i; j++)
      {
        if ( i % j == 0 )
        {
          count++;
        }
      }
      if( count == 0 )
      {
        prime.add(i);
        z++; //keeping the count of prime numbers
      }
      count = 0;
      if( z == 100)
      {i = 9999;} //for stopping the method when there are 100 prime numbers
    }
    System.out.print(prime.toString());
  }
  
}