package Java8_Features;

@FunctionalInterface
public interface Functional_Interface 
{
	
//	Functional interface is an interface where we can define only one abstarct method 
//	and it can have multiple default and static method
	
	 void singleAbstractMethod();


	default void show()
	{
		System.out.println("default method"); 
	}
	
	static void run()
	{
		System.out.println("static method");
	}

}
