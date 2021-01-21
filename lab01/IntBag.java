/**
 * __IntBag___ 
 * @author __Abdul Moeed___
 * @version __8/2/2018__
 */ 

public class IntBag
{
  //properties
  
  private int[] bag;
  private int valid;
  
  //constructors
  
  //this constructor creates the bag with space for 100 elements
  public IntBag()
  {
    this.bag = new int [100];
    this.valid = 0;
  }
  
  //this constructor takes parameter from the user to create the bag with space for the user entered value
  public IntBag( int n )
  {
    this.bag = new int [n];
    this.valid = 0;
  }
  
  
  //methods
  
  //@param x
  //adds value to the array if the array is not filled
  //otherwise ignores
  public void add( int x )
  {
    if ( this.valid < this.bag.length )
    {
      this.bag[this.valid] = x;
      this.valid = this.valid + 1;
    }
  }
  
  /**@param x
    * @param position
    adds value to the array at a specific position if the array is not filled
    otherwise ignores
    */
  public void add( int x, int position )
  {
    if ( this.valid < this.bag.length )
    {
      for ( int i = this.valid; i > position; i--)
      {
        this.bag[i] = this.bag[i-1 ];
      }
      this.bag[ position ] = x;
      this.valid = this.valid + 1;
    }
  }
  
  /*
   * @param position
   * removes a value from a specific index if it is present there
   * otherwise ignores
   */ 
  public void remove ( int position )
  {
    if ( valid != 0 )
    {
      for ( int i = position; i < this.valid; i++ )
      {
        this.bag[i] = this.bag[ i + 1];
      }
      this.bag[this.valid - 1] = 0;
      this.valid = this.valid - 1;
    }
  }
  
  public boolean contains (int x)
  {
    for (int i = 0; i < this.bag.length; i++)
    {
      if ( x == this.bag[i])
      { return true;}
    }
    return false;
  }
  
  /*
   * presents te array as a String
   * @returns str
   */ 
  public String toString()
  {
    String str = "";
    for (int i = 0 ; i < this.bag.length; i++ )
    {
      str = str + this.bag[i] + ", " ;
    }
    return str;
  }
  
  /*
   * @returns the index+1 till which the array is filled
   */ 
  public int size()
  {
    return this.valid;
  }
  //@returns the value at a specific index
  public int get( int position )
  {
    return this.bag[position];
  }
  /*@param x
   * @returns the locations of x
   */ 
  public String findAll( int x )
  {
    String result = "";
    for (int i =0; i < this.bag.length; i++)
    {
      if ( x == this.bag[i] )
      {
        result = result + i + ", ";
      }
    }
    return result;
  }
}