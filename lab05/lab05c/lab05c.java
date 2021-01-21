import java.util.Scanner;

/**
 * __lab05c___ 
 * @author __Abdul Moeed___
 * @version __1/2/17__
 */ 
public class lab05c
{
   public static void main( String[] args)
   {
     

      // constants
     
      Scanner scan = new Scanner( System.in);
     
      // variables
      
      String command;
      String input;
      double number = 0;
      double a;  
      char op;
      // program code
      
       System.out.println("Welcome to Calc");
      
       do
       {
     
      System.out.println("---------------");
      System.out.println("[" + number + "]");
      System.out.println("---------------");
      System.out.println("+,-,*,/ value");
      System.out.println("Clear");
      System.out.println("Quit");
      System.out.println("---------------");
                         
                         
      System.out.print("Select:" );
      command = scan.next();
      
      op = command.charAt(0);
      input = command.substring(1);
      a = Integer.parseInt(input);
                        
      
      if (op == '+' )
      {
        number = number + a ;
      }
      
      if (command.equals("-") )
      {
        number = (number -a);
      }
      
      if (command.equals("*") )
      {
        number = (number * a);
      }
      
      
      
      if (command.equals("/") )
      {
        number = (number / a);
      }
      
      if (command.equals("C") || command.equals("c") || command.equals("Clear") || command.equals("clear") )
      { 
        number = 0;
      }
      
      
      if (command.equals("sin"))
      {
        if ( number == 0)
        {
          number = ( ((a /(Math.PI)) * 180 ));
          number = -Math.sin(a)/2;
        }
        else
        {
          number = ( (number / 180) * (Math.PI) );
          number = -Math.sin(a);
        }
      }
      
      System.out.println();
      
       }
       
       while (!(command.equals("q") || command.equals("Q")));                     
              
              }

}