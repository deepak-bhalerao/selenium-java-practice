package Strings_Arrays_Streams;

public class LargeCharWordInString 
{
    public static void main(String args[]) 
    {
     
     String str="welcome to magnetic maharashtra";
     String[] arr=str.split(" ");
     
     String maxLen=" ";
     int count=0;
     
     for(int i=0 ; i<arr.length ; i++)
     {
         if(arr[i].length()>maxLen.length())
         maxLen=arr[i];
         count=maxLen.length();
     }

      System.out.println("large char count word : " +maxLen+" & its count "+count);
    }
}
