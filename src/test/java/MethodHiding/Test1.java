	package MethodHiding;
	
	
	//  Method Overriding 
	//  If parent and child method are non static then it will become method overriding
	//  Method resolution always takes care by JVM based on runtime object
	//  Overriding is runtime polymorphism or dynamic polymorphism or late biding
	
	
	class A
	{
		public void show()
		{
			System.out.println("Parent..");
		}
	}
	
	class B extends A
	{
		public void show()
		{
			System.out.println("Child..");
		}
	}
	
	public class Test1 {
		
		public static void main(String args[])
		{
			A a=new A();
			a.show();
			B b=new B();
			b.show();
			A a1=new B();
			a1.show();
	//		
	//		B b1=new A();   We cannot create reference object from child class to parent class
	//		b1.show();
			
		}
	
	}
