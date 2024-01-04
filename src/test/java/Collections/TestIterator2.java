package Collections;


import java.util.*;
public class TestIterator2 {
    public static void main(String args[]) {
      
      
      ArrayList<String> al=new ArrayList<>();
      al.add("Apple");
      al.add("Microsoft");
      al.add("Google");
      al.add("OnePlus");
      al.add("Samsung");
      al.add("Pixel");
      
      Iterator<String> itr=al.iterator();
      while(itr.hasNext())
      {
          String str = itr.next();
          System.out.println(str);
      }
      System.out.println();
      
      al.remove("OnePlus");
      System.out.println(al);

      
    }
}