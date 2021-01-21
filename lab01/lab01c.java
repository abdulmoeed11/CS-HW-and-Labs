import java.util.Scanner;

/**
 * __Lab01c___ 
 * @author __Abdul Moeed___
 * @version __2/12/2018__
 */ 
public class lab01c
{
  public static void main( String[] args)
  {
    Scanner scan = new Scanner( System.in);
    
    // constants
    
    // variables
    int opt = 0;
    IntBag a = new IntBag();
    String d = "";
    // program code
    while ( opt != 9 )
    {
      System.out.println("Select the followng options:-" + '\n' + "1. Create a new empty collection." + '\n' + "2. Read a set of values into collection." 
                           + '\n' + "3. Print values." + '\n' + "4. Add value at specified location." + '\n' +
                         "5. Remove a value." + '\n' + "6. Read a single value." + '\n' + "7. Compute locations of test value." + '\n' +
                         "8. Print the location of test value." + '\n' + "9. Quit.");
      opt = scan.nextInt();
      if (opt == 1)
      {
        System.out.println("Give the specified maximum Capacity");
        a = new IntBag(scan.nextInt());
      }
      if (opt == 2)
      {
        System.out.println("Enter values. To stop, enter a negative value.");
        int nums = scan.nextInt();
        a.add(nums);
        while ( nums >= 0)
        {
          nums = scan.nextInt();
          if ( nums >= 0)
          {a.add(nums);}
        }
      }
      if (opt == 3 )
      {
        System.out.println( a.toString() );
      }
      if ( opt == 4 )
      {
        int locat;
        int num;
        System.out.println("Which number?");
        num = scan.nextInt();
        System.out.println("At which location?");
        locat = scan.nextInt();
        a.add(num , locat);
      }
      if ( opt == 5 )
      {
        System.out.println("Which location?");
        a.remove(scan.nextInt());
      }
      if ( opt == 6)
      {
        System.out.println("Add a single value");
        a.add(scan.nextInt());
      }
      if ( opt == 7 )
      {
        d = a.findAll(scan.nextInt());
      }
      if ( opt == 8 )
      {
        System.out.println("The locations are " + d);
      }
    }
    
  }
}