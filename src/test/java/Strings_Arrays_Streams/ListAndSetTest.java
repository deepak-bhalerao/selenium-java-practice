package Strings_Arrays_Streams;
import java.util.*;

public class ListAndSetTest 
{
    public static void main(String args[]) 
    {
     
      // list follows the insertion order
      // list allow the duplicate elements
      // multiple null elements can be stored in list
      List<Integer> list=new ArrayList<>();
      list.add(1);
      list.add(2);
      list.add(1);
      list.add(2);
      list.add(4);
      list.add(null);
      list.add(null);
      
      // set does not follows the insertion order
      // set does not allow the duplicate elements
      // null elements can be stored only once in set
      Set<Integer> set=new HashSet<>();
      set.add(1);
      set.add(2);
      set.add(1);
      set.add(2);
      set.add(4);
      set.add(null);
      set.add(null);

      System.out.println("list elements are : "+list);
      System.out.println("set elements are : "+set);
    }
}