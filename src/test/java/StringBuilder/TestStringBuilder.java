package StringBuilder;

public class TestStringBuilder 
{
	public static void main(String args[])
	{
		// StringBuilder objects are Mutable
		// All the methods are Non Synchronized in StringBuilder class
		
		StringBuilder sb=new StringBuilder("Haresh");
		System.out.println(sb);
		
		System.out.println(sb.append(" Prajapati"));
		System.out.println(sb.toString());
		
		System.out.println(sb.capacity());
		
		System.out.println(sb.charAt(7));
		
		System.out.println(sb.reverse());
		System.out.println(sb.reverse());
		
		System.out.println(sb.indexOf("t"));
		
		System.out.println(sb.lastIndexOf("a"));
		
		System.out.println(sb.substring(1));
		
		System.out.println(sb.isEmpty());
		
		System.out.println(sb.length());
		
		System.out.println(sb.insert(0, "H"));
		
		System.out.println(sb.delete(0, 1));
		
	}
}
