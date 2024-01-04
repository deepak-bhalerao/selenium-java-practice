package ListIterator;
import java.util.ArrayList;
import java.util.ListIterator;

public class ListIterator2 {
	
	static public void main(String[] args)
	{
		ArrayList<String> al=new ArrayList<>();
		al.add("Apple");
		al.add("Microsoft");
		al.add("Google");
		al.add("Alphabet");

		System.out.println(al);  System.out.println();
		
//		By using ListIterator we can traverse both direction like forward and backward
		ListIterator<String> itr=al.listIterator();
		
		while(itr.hasNext())    // hasNext method return true if next element is available
		{
			String str=itr.next();     // next method print next element 
			System.out.println(str);   
		}
		
		System.out.println();
		
		while(itr.hasPrevious())   // hasPrevious method return true if previous element is available
		{
			String str=itr.previous();   // previous method print previous element
			System.out.println(str);
		}
		
		al.add("Tesla");   System.out.println(al);
		al.remove(4);      System.out.println(al);
		
	}

}
