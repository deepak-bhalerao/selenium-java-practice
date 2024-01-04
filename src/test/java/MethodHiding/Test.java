	package MethodHiding;
	
	
	//   Method Hiding Example
	//   If both parent and child method are static then it will become method hiding 
	//   Method resolution always takes care by compiler based on reference type
	//   Method hiding is compile time polymorphism or static polymorphism or early biding
	
	class P
	{
		static void show()
		{
			  System.out.println("parent..");
		}
	}
	class C extends P
	{
		static void show()
		{
			System.out.println("child..");
	    }
	}
	
	class Test 
	{
	public static void main(String args[])
	{
		  P p=new P();
		  p.show();	  
		  C c=new C();
		  c.show();
		  P p1=new C();
		  p1.show();
	
		  
	//	  C c1=new P();      // We cannot create reference object from child class to parent class
	//    c1.show();	    
	}
	}
