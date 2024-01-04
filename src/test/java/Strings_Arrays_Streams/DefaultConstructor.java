package Strings_Arrays_Streams;

	public class DefaultConstructor {
		
		int i;
		String str;
		boolean bool;
		double dl;
		long l;
		float fl;
		char ch;
		
		public static void main(String args[]) {
		 
		  DefaultConstructor dc=new DefaultConstructor();
		  System.out.println(dc.i);      // 0 
		  System.out.println(dc.str);    // null
		  System.out.println(dc.bool);    // false
		  System.out.println(dc.dl);     // 0.0
		  System.out.println(dc.l);      // 0
		  System.out.println(dc.fl);     // 0.0
		  System.out.println(dc.ch);     // .

		  // So default values will be initialize by default
		  // constructor which was created by Compiler
		}
	}