package Collections;

import java.util.HashMap;

public class HashMapTest 
{

	public static void main(String[] args) 
	{
		
		HashMap<Integer,String> map=new HashMap<>();
		map.put(3, "Ganesh");
		map.put(1, "Haresh");
		map.put(2, "Harry");
		map.put(4, "Neha");
		map.put(null, "Meena"); // we can store only one null element as key in hashmap
		map.put(5, null);    // and we can store multiple null elements as value in hashmap
		map.put(6, null);
		map.put(7, null);

		map.forEach((key,value)->
		{
			System.out.println(key+" "+value);
		});
		
		map.replace(4, "Potter");
		System.out.println(map);
		
		map.remove(4);
		System.out.println(map);

	}
}
