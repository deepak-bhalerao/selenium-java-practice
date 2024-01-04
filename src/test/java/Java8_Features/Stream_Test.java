package Java8_Features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Stream_Test {

	public static void main(String[] args) {
		
	 List<Integer> list=new ArrayList<>();
	 list.add(2);
	 list.add(3);
	 list.add(4);
	 list.add(5);
	 
//	 Stream<Integer> stream = list.stream();
//	 System.out.println(stream);
	 
	 list.stream().filter(i-> i%2==0).forEach(res -> System.out.println(res));
		
	}

}
