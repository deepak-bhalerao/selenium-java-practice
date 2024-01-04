package Iterator;


import java.util.*;

public class FirstCharOfEachStringList 
{
    public static void main(String args[]) 
    {
      
     List<String> lst=new ArrayList<>();
     lst.add("Maharashtra");
     lst.add("Gujrat");
     lst.add("Karnataka");
     lst.add("Madhya Pradesh");
     lst.add("Maharashtra");
     
     Iterator<String> itr=lst.iterator();
     while(itr.hasNext())
     {
         String s=itr.next();
         System.out.println(s.substring(0,1));
         
         // substring(0,1)  it will return the first char of each string in list
      }
    
    }
}