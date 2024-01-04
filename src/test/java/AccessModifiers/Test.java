package AccessModifiers;

 class Test1 {
	
	public int a=10;
	protected int b=20;
	int c=30;
	private int d=40;
	
	public void show()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}

 public class Test extends Test1
 {
	public static void main(String[] args) {
		
		Test1 t=new Test1();
//		t.show();
		System.out.println(t.a);
		System.out.println(t.b);
		System.out.println(t.c);
		
//		System.out.println(t.d);  
//	    We can use private access modifiers member within the same class only .
//		We can access the data members with public , protected and default access
//		modifiers from outside of class .
	}

}
