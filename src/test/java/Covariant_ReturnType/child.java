package Covariant_ReturnType;

class parent
{
	String show()
	{
		System.out.println("Parent Class Method");
		return null;
	}
}

// Before 1.5 java version for overriden methods we have to use same return type

public class child extends parent 
{
	String show()
	{
		System.out.println("Child Class Method");
		return null;
	}

	public static void main(String[] args) {
		
		parent p=new parent();
		p.show();
		child c=new child();
		c.show();
	}

}
