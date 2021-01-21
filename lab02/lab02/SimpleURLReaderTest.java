import cs1.SimpleURLReader;
/**
 * __Simple URL Reader___ 
 * @author __Abdul Moeed___
 * @version __23/2/2018__
 */ 
public class SimpleURLReaderTest
{
   public static void main( String[] args)
   {
      // variables
      SimpleURLReader a = new SimpleURLReader( "http://www.cs.bilkent.edu.tr/~david/housman.txt" );
      MySimpleURLReader b = new MySimpleURLReader ( "http://www.cs.bilkent.edu.tr/~david/housman.txt" );
      HTMLFilteredReader c = new HTMLFilteredReader( "http://www.cs.bilkent.edu.tr/~david/housman.htm" );
      SuperHTMLFilteredReader d = new SuperHTMLFilteredReader( "http://www.cs.bilkent.edu.tr/~david/index.html");
      
      // program code
      //testing SimpleURLReadder
      System.out.println("The contents of page are " + '\n' + a.getPageContents() ); //reading contents of txt url
      System.out.println("The number of lines are " + a.getLineCount() ); //getting the lines of the content
      System.out.println();
      System.out.println();
      
      //testing MySimpleURLReader
      //prints the name and url
      System.out.println("The name of file is " + b.getName() + " and the url is " + b.getURL());
      System.out.println("The contents of MSYR is " + '\n' + b.getPageContents() );
      System.out.println();
      System.out.println();
      
      //testing HTMLFilteredReader
      System.out.println("The contents of html code " + '\n' +   c.getUnfilteredPageContents());
      System.out.println("The contents of filtered content " + '\n' + c.getPageContents() );
      System.out.println();
      System.out.println();
      
      //testing SuperHTMLFilteredReader
      System.out.println("The overehead is " + d.getOverhead());
      System.out.println("The links are " + d.getLinks().toString() );
      System.out.println( "End.");
   }

}