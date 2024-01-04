package Strings_Arrays_Streams;

public class ReverseStringMulWays {
	
    public static void main(String args[]) {
    	
      // Reverse string using normal for loop
      String str="Deepak Bhalerao";
      char[] arr=str.toCharArray();
      for(int i=arr.length-1 ; i>=0 ; i--)
      {
          System.out.print(arr[i]);
      }
      System.out.println();
      
      // Reverse string function using string builder class

      StringBuilder sb=new StringBuilder("HI HELLO");
      sb.reverse();
      System.out.println(sb);
      
      // Reverse string using normal for loop
      String str2="abcd" , rev="";
      for(int i=str2.length()-1 ; i>=0 ; i--)
      {
          rev=rev+str2.charAt(i);
      }
      System.out.println(rev);

    }
}
