package Strings_Arrays_Streams;

public class DupNumAndStringInArray {
    public static void main(String args[]) {
      
      
      int[] arr={1,2,3,4,1,4};
      for(int i=0 ; i<arr.length ; i++)
      {
          for(int j=i+1 ; j<arr.length ; j++)
          {
              if(arr[i]==arr[j])
              System.out.print(arr[i]+" ");
          }
      }
      System.out.println();
      
      String[] array={"haresh","harry","ganu","haresh","harry"};
      for(int i=0 ; i<array.length ; i++)
      {
          for(int j=i+1 ; j<array.length ; j++)
          {
              if(array[i]==array[j])
              System.out.print(array[i]+" ");
          }
      }

      
      
    }
}