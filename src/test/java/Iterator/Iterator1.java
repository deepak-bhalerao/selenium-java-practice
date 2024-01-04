package Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator1 {

	public static void main(String[] args) {
		
		List<String> list=new ArrayList<>();
		
		list.add("TATA");
		list.add("Range Rover");
		list.add("Jaguar");
		list.add("Land Rover");
		
		System.out.println(list); System.out.println();	 
		
//	    By using iterator we can traverse in forward direction only
		
		Iterator<String> itr=list.iterator(); 
		while(itr.hasNext())    // hasNext() method return true if next elememt is available
		{
			System.out.println(itr.next()); // next()  method return the next element 
		}
		System.out.println();
		
		list.add("Mahindra");   System.out.println(list);
		list.remove(4);         System.out.println(list);

	}

}
