package Collections;


import java.util.*;

public class TestIterator1 {
    public static void main(String args[]) {
     
      ArrayList<Integer> al=new ArrayList<>();
      al.add(1);
      al.add(5);
      al.add(4);
      al.add(3);
      al.add(7);
      al.add(2);
      al.add(6);
      al.add(8);
      
      Iterator<Integer> itr=al.iterator();
      while(itr.hasNext())
      {
          int i=itr.next();
          System.out.print(i+" ");
          if(i%2==0)
          itr.remove();
      }
      System.out.println();
      System.out.println("ArrayList Odd Num : "+al);
      
    }
}