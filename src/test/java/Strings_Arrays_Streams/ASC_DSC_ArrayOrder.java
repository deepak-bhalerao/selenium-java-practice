package Strings_Arrays_Streams;

import java.util.*;

public class ASC_DSC_ArrayOrder {
    public static void main(String args[]) {
      
      // Print the given array in ASC and DSC order 
    	
      int[] array=new int[] {1,3,6,2,0,8,5,9,7,4};
      Arrays.sort(array);
      System.out.println(Arrays.toString(array));
      
     //Collections.reverseOrder do not work for primitive Types 
      
      Integer[] arr1=new Integer[] {1,3,6,2,0,8,5,9,7,4};
      Arrays.sort(arr1,Collections.reverseOrder());
      System.out.println(Arrays.toString(arr1));
      
    }
}