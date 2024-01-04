package Java8_Features;

import java.util.Arrays;
import java.util.List;

public class TestLambdaExpression {

	public static void main(String[] args) {
		
		
		List<String> prodList=Arrays.asList("Google Pixel","iPhone 10","Samsung S20");
		
//		// normal for loop
//		for(int i=0 ; i<prodList.size() ; i++)
//		{
//			System.out.println(prodList.get(i));
//		}
//		
//		System.out.println("-------------");
//		
//		// forEach loop
//		for(String str : prodList)
//			System.out.println(str);
//		
//		System.out.println("-------------");
		
		// lambda expression
		prodList.forEach(str-> System.out.println(str));
		
//		System.out.println("-------------");
//		
//		// method references : 
//		prodList.forEach(System.out::println);

	}

}
