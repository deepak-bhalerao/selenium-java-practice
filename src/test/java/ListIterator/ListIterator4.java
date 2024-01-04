package ListIterator;

import java.util.ListIterator;
import java.util.Stack;

public class ListIterator4 {

	public static void main(String[] args) {
		
		Stack<String> st=new Stack<>();
		st.add("TATA");
		st.add("Land Rover");
		st.add("Jaguar");
		st.add("Range Rover");
		System.out.println(st);
		
		ListIterator<String> itr=st.listIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println();
		
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous()); 
		}
		
		st.add("Mahindra");     System.out.println(st);
		st.remove(4);           System.out.println(st);
		
		st.set(3, "Mahindra");  System.out.println(st);
	
	}

}
