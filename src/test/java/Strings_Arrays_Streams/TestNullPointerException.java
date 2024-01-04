package Strings_Arrays_Streams;

public class TestNullPointerException {
    public static void main(String args[]) {
    
    
      try
      {
          String str=null;
          if(str.equals("abc"))
          System.out.println("same");
          else
          System.out.println("not same");
      }
      catch(NullPointerException e)
      {
//          e.printStackTrace();
          System.out.println("null pointer exception caught");
      }
      
      
    }
}
