import cs1.SimpleURLReader;


public class SuperHTMLFilteredReader extends HTMLFilteredReader{
   
   //constructor
   public SuperHTMLFilteredReader( String a ){
      super( a );
   }
   
 //methods
   public int getOverhead(){
      HTMLFilteredReader c = new HTMLFilteredReader( url);
      MySimpleURLReader d = new MySimpleURLReader ( url);
      int perc = 0;
      perc = (((c.getPageContents()).length() - (d.getPageContents()).length()) / (d.getPageContents()).length()) * 100;
      return perc;
      
   }
   
}