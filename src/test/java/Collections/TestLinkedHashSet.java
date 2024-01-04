package Collections;

import java.util.*;

public class TestLinkedHashSet 
{
	
    public static void main(String args[]) 
    {
    	
//    LinkedHashSet we have used to remove the duplicate value and preserv or
//    maintain the insertion order from the list 
//    LinkedHashSet is a child class of HashSet 	
     
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