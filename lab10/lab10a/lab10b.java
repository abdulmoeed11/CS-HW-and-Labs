import java.util.Scanner;

/**
 * __Lab 10b___ 
 * @author __Abdul Moeed___
 * @version __12/21/2017__
 */ 

public class lab10b
{
  public static void main( String[] args)
  {
    // constants
    
    Scanner scan = new Scanner( System.in);
    
    //creating an array of length 10
    BigNum[] newArray = new BigNum[10];
    
    // variables and intitializing
    BigNum b1;
    String s;
    int n;
    BigNum great = new BigNum();
    BigNum temp = new BigNum();
    int count = 0;
    
    // program code
    
    //creating a random array of 10 BigNUm
    for( int j = 0; j < 10; j++)
    {
      b1 = new BigNum();
      s = "";
      for (int i = 0; i < b1.SIZE; i++)
      {
        s = s + (int)(Math.random() * b1.BASE);
      }
      b1 = new BigNum(s);
      newArray[j] = b1;
    }
    
    
    //printing the random array of BigNum
    for( int j = 0; j < 10; j++)
    {
      System.out.println(newArray[j]);
    }
    
    
    
    /*Entering the nth value
     * swapping
     * And repeating until n > 0
     */
    n = 0;
    while( n >= 0 )
    {
      
      count = 0;
      System.out.print("Enter n");
      n = scan.nextInt();
      
      System.out.println();
      if ( n < 0 )
      {
        System.out.println("Error");
      }else
      {
        
        for(int i = 0; i < n-1; i++ )
        {
          if ( newArray[count].isLessThan(newArray[i + 1]) )
          {
            great = new BigNum( newArray[ i + 1 ] );
            count = i + 1;
          }
          
        }
        System.out.println("The big number is " + great + " at index location " + count);
        temp = newArray[count];
        newArray[count] = newArray[ n - 1 ];
        newArray[ n - 1 ] = temp;
        
        for( int j = 0; j < 10; j++)
        {
          System.out.println(newArray[j]);
        }
      }
    }
  }
  
}