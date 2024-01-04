package ListIterator;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIterator3 {

	public static void main(String[] args) {
		
		LinkedList<Object> list=new LinkedList<>();
		list.add(10);
		list.add("Apple");
		list.add(1000);
		list.add("Google");
		
		ListIterator<Object> itr=list.listIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println();
		
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());
		}
		
		list.add("Alphabet"); System.out.println(list);
		list.remove(4);       System.out.println(list);
		
	}

}
