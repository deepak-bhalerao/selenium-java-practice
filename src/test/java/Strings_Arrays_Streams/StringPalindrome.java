package Strings_Arrays_Streams;

public class StringPalindrome {
    public static void main(String args[]) {
     
     
      String str="wow" , rev="";
      for(int i=str.length()-1 ; i>=0 ; i--)
      {
          rev=rev+str.charAt(i);
      }

      if(str.equals(rev))
      System.out.println("given string is palindrome");
      else
      System.out.println("given string is not palindrome");
      
      
    }
}
