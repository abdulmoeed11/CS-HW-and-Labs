import cs1.SimpleURLReader;
import java.util.ArrayList;
/**
 * __Super HTML Filtered Reader___ 
 * @author __Abdul Moeed___
 * @version __26/2/2018__
 */ 

public class SuperHTMLFilteredReader extends HTMLFilteredReader{
   
   //constructor
   public SuperHTMLFilteredReader( String a ){
      super( a );
   }
   
   //methods
   /*
    * @returns OverheadInSizeOfFile
    */ 
   public int getOverhead(){
      HTMLFilteredReader c = new HTMLFilteredReader( url );
      MySimpleURLReader d = new MySimpleURLReader ( url );
      double perc;
      perc = ((double)((d.getPageContents()).length() - (c.getPageContents()).length()) / (d.getPageContents()).length()) * 100;
      return (int)perc;
   }
  
   /*
    * @returns LinksInPageContent
    */ 
   public ArrayList<String> getLinks(){
      ArrayList<String> links = new ArrayList<String>();
      SimpleURLReader b = new SimpleURLReader ( url );
      String con = b.getPageContents();
      String a = "href=";
      String d = ">";
      int s = 0;
      int e = 0;
      int z = 0;
      
      for ( int i = 1; i < con.length()-1; i++ ){
         
         s = con.indexOf(a, z );
         if ( s > 0)
         {
            e = con.indexOf(d, s + 1 );
            links.add(con.substring( s+6, e - 1));
            z = e;
         }
      }
      return links;
   }
   
   //main
   public static void main( String[] args)
   {
      // constants
      
      // variables
      SuperHTMLFilteredReader c = new SuperHTMLFilteredReader( "http://www.cs.bilkent.edu.tr/~david/index.html");
      
      // program code
      System.out.println(c.getOverhead());
      
      System.out.println("The links are " + c.getLinks().toString() );
      System.out.println( "End.");
   }
}