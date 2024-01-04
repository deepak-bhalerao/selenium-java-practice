package Strings_Arrays_Streams;

import java.util.*;
import java.util.stream.*;

public class RemoveDuplNumInArr 
{
    public static void main(String args[]) 
    {
     
      // Remove duplicate numbers from array using Set interface
      int[] arr={1,2,3,1,4,5,3,4,10,12,10,12,8};
      
      //LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
      Set<Integer> set=new HashSet<>();
      for(int i=0 ; i<arr.length ; i++)
      {
          set.add(arr[i]);
      }
      System.out.println(set);
      
     // Remove duplicate numbers from an array using streams API
//     List<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5));
//     
//     List<Object> newList=
//     list.stream().distinct().collect(Collectors.toList());
//     System.out.println(newList);
      
    }
}