package Strings_Arrays_Streams;

public class RevStringSamePosition 
{
    public static void main(String args[]) 
    {
      // Reverse the string in same position 
    	
      String str="welcome to pune";
      for(String s : str.split(" "))
      {
          for(int i=s.length()-1 ; i>=0 ; i--)
          {
             System.out.print(s.charAt(i)); 
          }
          System.out.print(" ");
      }
      
    }
}