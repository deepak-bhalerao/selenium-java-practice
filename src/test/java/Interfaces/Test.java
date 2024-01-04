package Interfaces;

interface I1
{
	 void show();  // by default methods in interface are public & abstract
	 int a=10;     // by default variables / fields are public static final 
	 
//	 protected void show();  
//	 default void disp();    
//   protected and default access modifiers cannot be used with abstract method in interface
}

interface I2
{
	 default void display()     // From java 8 version we can create default concrete methods in interface
	 {
		 System.out.println("default concrete methods");
//		 disp();        // calling non static private method
//		 disp1();       // calling static private method
	 }
	 static void run()    // From java 8 version we can create static concrete methods in interface
	 {
		System.out.println("static concrete methods ");
	 }
//	 private void disp()   // From java 9 version we can create private non static methods in interface
//	 {
//		 System.out.println("private non-static methods "); 
//	 } 
//	 
//	 private static void disp1() // From java 9 version we can create private static methods in interface
//	 {
//	     System.out.println("private static methods "); 
//	 }

}

  public class Test implements I1,I2
	{
		public void show()
		{
			System.out.println("Interface Examples");
		}
		public static void main(String args[])
		{
			Test t=new Test();
			t.show();
			t.display();
			I2.run();
			
//			I1 i=new I1();  we cannot create object of interface which is also simillar to abstract class
		}
	}