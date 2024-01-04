package Strings_Arrays_Streams;

import java.util.*;

public class DupWordInString 
{
    public static void main(String args[]) 
    {
     
    	  String str="This is Pune and this Is Mumbai";
          HashMap<String,Integer> map=new HashMap<>();
          for(String arr : str.split(" "))
          {
              String word=arr.toLowerCase();
              if(word!=" ")
              {
                  if(map.containsKey(word))
                  map.put(word,map.get(word)+1);
                  else
                  map.put(word,1);
              }
          }
          
          map.forEach((key,value)->
          {
        	  if(value>1)
              System.out.println(key+" --> "+value);
          });
      
    }
}
