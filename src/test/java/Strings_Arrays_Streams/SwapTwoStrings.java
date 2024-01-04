package Strings_Arrays_Streams;

public class SwapTwoStrings {
    public static void main(String args[]) {
      
      // Swapping two string    
    	
      String a="Harry";
      String b="Potter";
      System.out.println("before swap : "+a+" "+b);
      a=a+b;
      b=a.substring(0,a.length()-b.length());
      a=a.substring(b.length());
      System.out.println("after swap : "+a+" "+b);
      
    }
}