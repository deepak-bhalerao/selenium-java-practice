package Strings_Arrays_Streams;

import java.util.*;

public class LargeNumArray_First_Third {
    public static void main(String args[]) {
     
     // largest num from array using stream
     int[] arr=new int[]{1,4,6,7,8,10};
     int size=arr.length;
     Arrays.sort(arr);
     int max=arr[size-1];
     System.out.print(max);
     System.out.println();
     
     // largest num from array using normal for loop
     int[] array={23,45,56,78,89,100};
     int maximum=arr[0];
     for(int i=0 ; i<array.length ; i++)
     {
         if(array[i]>maximum)
         maximum=array[i];
     }
     System.out.print(maximum);
     System.out.println();
     
     // Third largest num from array
     int[] arr1=new int[]{1,4,6,7,8,10};
     int arrSize=arr1.length;
     Arrays.sort(arr1);
     int largeNum=arr1[arrSize-3];
     System.out.println(largeNum);
     
    }
}