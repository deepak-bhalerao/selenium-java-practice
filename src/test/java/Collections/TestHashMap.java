package Collections;


import java.util.*;

public class TestHashMap {
    public static void main(String args[]) {
      
      HashMap<Integer,String> map=new HashMap<>();
     
      map.put(2,"Mahindra");
      map.put(1,"Tata Motors");
      map.put(4,"Eicher Motors");
      map.put(3,"BharatBenz");
      map.put(6,"Maruti Suzuki");
      map.put(5,"Hyundai");
      
      TreeMap<Integer,String> tr=new TreeMap<>(map);
      System.out.println(tr);
      
      tr.replace(5,"Hero MotoCorp");
      System.out.println(tr);
      System.out.println("Size of Map : "+tr.size());
      
      boolean res=tr.isEmpty();
      System.out.println(res);
      
    }
}
