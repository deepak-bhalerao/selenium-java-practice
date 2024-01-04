package Collections;

import java.util.*;
public class TestIterator {
    public static void main(String args[]) {
      
      
      List<Integer> al=new ArrayList<>();
      for(int i=0 ; i<=10 ; i++)
      {
          al.add(i);
      }

      System.out.println(al);
      
      Iterator<Integer> itr=al.iterator();
      while(itr.hasNext())
      {
          int i=itr.next();
          System.out.print(i+" ");
          if(i%2!=0)
          itr.remove();
      }
      System.out.println();
      System.out.println("ArrayList Even Num : "+al);
    }
}