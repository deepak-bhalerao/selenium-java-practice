package Strings_Arrays_Streams;

import java.util.*;

public class SortHashMap 
{
    public static void main(String args[]) 
    {
      // sorting the HashMap using TreeMap 
      HashMap<Integer,String> map=new HashMap<>();
      map.put(3,"abc");
      map.put(2,"bbb");
      map.put(1,"ccc");
      map.put(4,"ddd");
      map.put(5,"eee");
      
      TreeMap<Integer,String> tr=new TreeMap<>(map);
      System.out.println(tr);
    }
}