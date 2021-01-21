/**
 * __HTML Filtered Reader___ 
 * @author __Abdul Moeed___
 * @version __26/2/2018__
 */ 

public class HTMLFilteredReader extends MySimpleURLReader{
   
   //constructor
   public HTMLFilteredReader( String a){
      super( a );
   }
   
   //methods
   /*
    * @returns FilteredPageContents
    */ 
   public String getPageContents(){
      MySimpleURLReader b = new MySimpleURLReader( url );
      String html = b.getPageContents();
      int a = 0;
      String result = "" ;
      
      for ( int i = 0; i < html.length() - 1; i++){
         
         if( html.charAt(i) == '<' )
         {
            a = 2;
            for( int z = i + 1; z <  html.length() - 1; z++)
            {
               if( html.charAt(z) == '>' )
               {
                  a = 0;
                  i = z ;
                  z =  html.length() - 1;
               }
            }
         }  
         if( a == 0 &&  html.charAt(i) != '<' &&  html.charAt(i) != '>' )
         {
            result = result + html.charAt(i);
         }
      }
      return result.substring(35, result.length());
   }
   
   /*
    * @returns UnfilteredPageContents
    */ 
   public String getUnfilteredPageContents(){
      return (new MySimpleURLReader ( url )).getPageContents();
   }
   
   //testing
   public static void main( String[] args)
   {
      // variables
      HTMLFilteredReader c = new HTMLFilteredReader( "http://www.cs.bilkent.edu.tr/~david/housman.htm" );
      // program code
      System.out.println( c.getPageContents() );
      System.out.println( c.getUnfilteredPageContents() );
      System.out.println();
      System.out.println( "END" );
   }
}
