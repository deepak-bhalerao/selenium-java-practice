package Covariant_ReturnType;

class Test1 
{
	Integer show()   
	{
		int age=10;
		System.out.println(age);
		return null;  
		}
  }

public class Test extends Test1
{
	Integer show() 
	{
		int age=20;
		System.out.println(age);
		return null;  
		}
	
	static public void main(String args[])
	{
		Test1 t1=new Test1();
		t1.show();
		Test t=new Test();
		t.show();
	}
}
