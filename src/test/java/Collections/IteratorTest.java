package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest 
{
	public static void main(String[] args) 
	{
		
		List<Integer> al=new ArrayList<>();
		for(int i=0 ; i<=10 ; i++)
		{
			al.add(i);
		}
		System.out.println(al);
		
		Iterator<Integer> itr=al.iterator();
		while(itr.hasNext()){
			int i = itr.next();
			System.out.println(i+" ");
			if(i%2!=0)
            itr.remove();
		}
		System.out.println("Evev Num in ArrayList : "+al);
	}
}
