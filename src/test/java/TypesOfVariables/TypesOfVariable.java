package TypesOfVariables;

public class TypesOfVariable {
    
    int a=10;            // instance varibales 
	
//   Variables defines inside the class but outside the method ,constructor and block known as instance variable
//   Instance variables stored in Heap memory
//   We can use access specifiers with instance variables 

    static int b=20;     // static varibales
    
//   Variables defines with static keyword inside the class but outside the method, constructor and block known as static variable
//   Static variables stored in non-heap memory or static memory
//   We can use access specifiers with static variables
   
	public void Show()
	{
		int num=100;         // local variables
		
		//  local variables does not have any default values and value should be provided before use
		//  local variables always defines inside method,constructor or block
		//  local variables stored in stack memory
		//  We can not use access specifiers with local variables
	}
	
    public static void main(String args[]) {
     
     TypesOfVariable t=new TypesOfVariable();
     System.out.println(t.a);
     System.out.println(TypesOfVariable.b);
     
     t.a=1000;              // reinitialize the instance variable value
     t.b=2000;              // reinitialize the static variable value
     
     System.out.println(t.a);
     System.out.println(TypesOfVariable.b);
     
     TypesOfVariable t1=new TypesOfVariable();
     System.out.println(t1.a);    // again reinitialize the instance variable value 
     System.out.println(TypesOfVariable.b);  // but static variable cannot be reinitialize
      
      
      
    }
}