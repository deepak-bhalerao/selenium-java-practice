package StaticKeyword;

public class Test {
	
	static void checkString(String str)     {
		if(str.equalsIgnoreCase("Haresh"))
			System.out.println("Pass");
		else
			System.out.println("Fail");     }
	
	
	public static void main(String args[])  {

		checkString("haresh");    }
	
}
	