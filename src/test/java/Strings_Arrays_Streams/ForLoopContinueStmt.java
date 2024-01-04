package Strings_Arrays_Streams;

public class ForLoopContinueStmt {
    
    public static void main(String args[]) {
      
      for(int i=1 ; i<=10 ; i++)
      {
          if(i > 4 && i < 9)
          {
              continue;   //  continue statement skip loop in between 5 to 8
          }
          System.out.print(i+" ");
      }
      // Output : 1 2 3 4 9 10
      
      
      for(int i=1 ; i<=10 ; i++)
      {
          if(i >= 4 && i <= 9)
          {
              continue;  //  continue statement skip loop in between 4 to 9
          }
          System.out.print(i+" ");
      }
   // Output 1 2 3 10    
      
      for(int i=1 ; i<=10 ; i++)
      {
          if(i > 4 && i < 9)
          { 
        	  //continue;
        	  System.out.print(i+" ");
          }
      }
      // Output 5 6 7 8
      
      for(int i=1 ; i<=10 ; i++)
      {
          if(i >= 4 && i <= 9)
          { 
        	  //continue;
        	  System.out.print(i+" ");
          }
      }
      // Output 4 5 6 7 8 9
      
      
      
      
      
      
      
      
      
      
      
      
      

      
    }
}