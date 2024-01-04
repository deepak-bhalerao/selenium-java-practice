package Java8_Features;

import java.util.function.BiConsumer;

public class Test 
{
	public static void main(String[] args) 
	{
		
		  BiConsumer<Integer,Integer> biConsumer= (a,b) -> System.out.println(a+b);
	      biConsumer.accept(30,20);	
		
	}

}
