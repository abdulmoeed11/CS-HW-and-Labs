/**
 * __BigNum___ 
 * @author __Abdul Moeed___
 * @version __12/20/2017__
 */ 


public class BigNum
{
  //constants
  int SIZE = 8 ;
  int BASE = 10;
  
  
  int[] myArray;
  
  //constructors
  
  //intitializing the array to 0
  public BigNum()
  { 
    myArray = new int[SIZE];
    for (int i = 0; i < SIZE; i++)
    {
      myArray[i] = 0;
    }
  }
  
  //Giving input to constructor
  public BigNum( String s)
  { 
    int i = 0;
    myArray = new int[SIZE];
    for ( int j = s.length()-1; j >= 0 ; j--)
    {
      
      myArray[i] = s.charAt(j)- '0';
      i++;
    }
  }
  
  //copy constructor
  public BigNum( BigNum copy)
  {
    myArray = new int[SIZE];
    for ( int i =0; i < SIZE; i++)
    {
      this.myArray[i] = copy.myArray[i];
    }
  }
  
  //methods
  
  /*
   * Conversts array to String
   * @returns result
   */ 
  public String toString()
  {
    String result = "";
    for ( int i = 0; i < SIZE; i++)
    {
      result = myArray[i] + result;
    }
    return result;
    
  }
  
  
  /*
   * boolean
   * @param other BigNum
   * @returns true if equal
   * @returns false if not equal
   */ 
  
  public boolean equals(BigNum other)
  {
    int count = 0;
    boolean is = false;
    for ( int i = 0; i < SIZE; i++)
    {
      if(this.myArray[i] == other.myArray[i])
      {
        count++;
      }
    }
    if (count == SIZE)
    {
      is = true;
    }
    return is;
  }
  
  /*
   * boolean
   * checks if the array is initiailized to zero
   * @returns true if all values are zero
   */ 
  public boolean isZero()
  {
    boolean is = true;
    for (int i = 0; i < SIZE; i++)
    {
      if ( this.myArray[i] != 0)
      {
        is = false;
      }
    }
    return is;
  }
  
  /*
   * shift
   * @param boolean: true/false
   * if boolean is true, it shifts the array to right
   * if false, it shifts the array to left
   * Note it shifts the array not the BigNum
   */ 
  public void shift( boolean left)
  {
    
    if (left == true)
    {
      for ( int i = SIZE - 2; i >= 0 ; i--)
      {
        this.myArray[i + 1] = this.myArray[ i];
      }
      this.myArray[0] = 0;
    }
    if (left == false)
    {
      for ( int i = 1; i <= SIZE - 1 ; i++)
      {
        this.myArray[i - 1] = this.myArray[i];
      }
    }
  }
  
  
  /*
   * add
   * @param other Bigum
   * adds this to other
   * @returns the overflow
   */ 
  public int add(BigNum other)
  {
    int carry = 0;
    int sum = 0;
    for ( int i = 0; i < SIZE ; i++)
    {
      sum = this.myArray[i] + other.myArray[i] + carry;
      this.myArray[i] = sum % BASE;
      carry = ( sum - this.myArray[i] )/ BASE;
    } 
    return carry;
  }
  
  /*
   * isLessThan
   * @param other BigNum
   * @returns true if this is less than other
   * @returns false if this is greater than other
   */ 
  public boolean isLessThan(BigNum other)
  {
    for ( int i = SIZE - 1; i >= 0; i--)
    {
      if (this.myArray[i] < other.myArray[i] )
      {
        return true;
      }else if(this.myArray[i] > other.myArray[i] )
      {
        return false;
      }
    }
    return false;
  }
}