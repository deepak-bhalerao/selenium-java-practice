package Strings_Arrays_Streams;

import java.util.*;

public class DupCharInString 
{
    public static void main(String args[]) 
    {
      
    	   String str="I love my india";
    	      HashMap<Character,Integer> map=new HashMap<>();
    	      for(char arr : str.toCharArray())
    	      {
    	          char ch=Character.toLowerCase(arr);
    	          if(ch!=' ')
    	          {
    	              if(map.containsKey(ch))
    	              map.put(ch,map.get(ch)+1);
    	              else
    	              map.put(ch,1);
    	          }
    	      }
    	      
    	      map.forEach((key,value)->
    	      {
    	          System.out.println(key+" --> "+value);
    	      });
    }
}
