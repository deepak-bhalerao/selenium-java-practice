package Covariant_ReturnType;

class Y {
	
    Object show()  {
		long salary=10000;
		System.out.println(salary);
		return null;  }
}

public class X  extends Y 
{
	String show()   {
    	String name="Harry";
    	System.out.println(name);
    	return null;  }
	
	static public void main(String[] args)
	{
		Y y=new Y();
		y.show();
		X x=new X();
		x.show();
	}
}
