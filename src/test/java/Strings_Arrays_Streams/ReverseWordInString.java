package Strings_Arrays_Streams;

public class ReverseWordInString {
    public static void main(String args[]) {
      
      // print the words in reverse direction in given string	
    	
      String str1="welcome to goa";
      String[] arr1=str1.split(" "); 	
      for(int i=arr1.length-1 ; i>=0 ; --i)
      {
          System.out.print(arr1[i]+" ");
      }
      System.out.println();
      
      String str="my name is haresh prajapati";
      
      String[] arr=str.split(" ");
      System.out.print(arr[arr.length-1]);
      for(int i=arr.length-2 ; i>=0 ; i--)
      {
          System.out.print(" "+arr[i]);
      }
      
    }
}