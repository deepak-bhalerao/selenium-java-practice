package Array_Segregation;

import java.util.*;
public class NumSegregaationArrays 
{
    public static void main(String args[]) 
    {
  
      int[] arr={1,0,0,1,1,0,1,0};
      Arrays.sort(arr);
      System.out.println(Arrays.toString(arr));
      
      Integer[] arr1={1,0,0,1,1,0,1,0};
      Arrays.sort(arr1,Collections.reverseOrder());
      System.out.println(Arrays.toString(arr1));
      
      // Arrays.toString() It is used to convert an array into string representation
      // and this method provided by java.util.Arrays class
      
      int[] numbers = {1, 2, 3, 4, 5};
      String numbersStr = Arrays.toString(numbers);
      System.out.println(numbersStr);
      
      int[][] matrix = 
    	  {
    		    {1, 2, 3},
    		    {4, 5, 6},
    		    {7, 8, 9}
    		};
      String matrixStr = Arrays.deepToString(matrix);
	  System.out.println(matrixStr);
      
    }
}
