/**
 * __Lab-10a, BigNum Test Class___ 
 * @author __Abdul Moeed___
 * @version __12/20/2017__
 */ 
public class lab10a
{
  public static void main( String[] args)
  {
    //variables and initializing
    BigNum b1 = new BigNum();
    BigNum b2 = new BigNum("954");
    BigNum b3 = new BigNum(b2);
    BigNum b4 = new BigNum("1023");
    
    
    //program code
    
    //checking is less than method
    if(b2.isLessThan(b4))
    {
      System.out.println("It is less");
    }else
    {
      System.out.println("It is more");
    }
    
    
    System.out.println(b2);
    
    
    
    //checking isZero method
    if (b1.isZero())
    {
      System.out.println("It is Zero");
    }else
    {
      System.out.println("It is not zero");
    }
    
    
    //checking equals method
    if (b2.equals(b3))
    {
      System.out.println("equal");
    }else
    {
      System.out.println("not equal");
    }
    
    //checking the add method and its overflow
    System.out.println("b2 is " + b2);
    System.out.println("b2 + b4 overflow is " + b2.add(b4));
    System.out.println("After addition " + b2);
    
    //checking the shift method
    b2.shift(false);
    System.out.println("After shifting to right " + b2);
    b2.shift(true);
    System.out.println("After shifting to left " + b2);
    
    b2.shift(true);
    System.out.println("After shifting to left " + b2);
  }
  
}