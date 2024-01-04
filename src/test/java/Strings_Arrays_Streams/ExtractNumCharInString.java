package Strings_Arrays_Streams;

public class ExtractNumCharInString 
{
    public static void main(String args[]) 
    {
     
      // print only numbers from given string
      String str="1q2w3e4r5t6y7u8i9o0p";
      for(int i=0 ; i<str.length() ; i++)
      {
          char ch=str.charAt(i);
          if(Character.isDigit(ch))
          System.out.print(ch);
      }
      System.out.println();
      
       // print only characters from given string
      String str1="1q2w3e4r5t6y7u8i9o0p";
      for(int i=0 ; i<str1.length() ; i++)
      {
          char arr=str1.charAt(i);
          if(Character.isAlphabetic(arr))
          System.out.print(arr);
      }
      
    }
}