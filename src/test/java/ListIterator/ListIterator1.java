package ListIterator;

import java.util.ListIterator;
import java.util.Vector;

public class ListIterator1 
{
	public static void main(String[] args) 
	{
		
		Vector<Integer> v=new Vector<>();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		System.out.println(v);
		
		ListIterator<Integer> itr=v.listIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println();
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());
		}
		
		v.add(50);     System.out.println(v);
		v.remove(4);   System.out.println(v);
		v.set(3, 55);  System.out.println(v);
	}

}
