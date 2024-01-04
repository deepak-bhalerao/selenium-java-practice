package Strings_Arrays_Streams;

import java.util.*;

public class RemDupCharInString {
    public static void main(String args[]) {
    
      String str="ssmmaalllleerr";
      char[] arr=str.toCharArray();
      Set<Character> set=new LinkedHashSet<>();
      for(int i=0 ; i<arr.length ; i++)
      {
          set.add(arr[i]);
      }
      
      for(Character ch : set) {
          System.out.print(ch);
      }
      
    }
}