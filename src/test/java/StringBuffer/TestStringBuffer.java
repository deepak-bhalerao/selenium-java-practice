package StringBuffer;

public class TestStringBuffer
{

	public static void main(String[] args) 
	{
        // StringBuffer objects are Mutable 		
		// All the methods are Synchronized in StringBuffer class
		StringBuffer sb=new StringBuffer();
		
		sb.append("Harry Potter");
		System.out.println(sb.capacity());
		
		System.out.println(sb.reverse());
		System.out.println(sb.reverse());
		
		System.out.println(sb.charAt(0));
		
		System.out.println(sb.isEmpty());
		
		System.out.println(sb.length());
		
		System.out.println(sb.toString());
		
		System.out.println(sb.substring(1));
		
		System.out.println(sb.insert(5, "P"));
		
		System.out.println(sb.indexOf("y"));
		
		System.out.println(sb.lastIndexOf("r"));
		
		System.out.println(sb.delete(7, 13));
		
	}
}
