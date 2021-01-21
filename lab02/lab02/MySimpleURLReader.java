import cs1.SimpleURLReader;

/**
 * __My Simple URL Reader___ 
 * @author __Abdul Moeed___
 * @version __26/2/2018__
 */ 
public class MySimpleURLReader extends SimpleURLReader
{
   //properties
   String url;
   
   //constructors
   public MySimpleURLReader(String s) {
      super(s);
      url = s;
   }
   
   //methods
   /*
    * @returns url
    */ 
   public String getURL(){
      return url;
   }
   
   /*
    * @returns name
    */ 
   public String getName(){
      String result = "";
      for ( int i = url.length()- 5 ; i > 0; i--)
      {
         if ( url.charAt(i) == '/' )
            return result;
         result = url.charAt(i) + result;
      }
      return "";
   }
   
   /*
    * @returns PageContent
    */ 
   public String getPageContents(){
      SimpleURLReader c = new SimpleURLReader( url );
      return (c.getPageContents()).substring(4, (c.getPageContents()).length() -1 ) ;
   }
   
   //testing
   public static void main( String[] args){
      MySimpleURLReader b = new MySimpleURLReader("http://www.cs.bilkent.edu.tr/~david/housman.txt");
      System.out.println( "The name is " + b.getName() );
      System.out.println( "The url is " + b.getURL() );
      System.out.println( b.getPageContents() );
   }
}