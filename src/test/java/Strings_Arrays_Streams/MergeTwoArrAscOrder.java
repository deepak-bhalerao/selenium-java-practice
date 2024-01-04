package Strings_Arrays_Streams;
import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoArrAscOrder {
	
	// Merge Two Array in ASC Order
	
	static int[] mergeArray(int[] arr1,int[] arr2)
	{
		return IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2))
				.sorted()
				.toArray();
	}
	
	public static void main(String args[])
	{
		int[] arr1= {9,1,5,0,2};
		int[] arr2= {3,8,5,4,7};
		int[] mergedArr=mergeArray(arr1,arr2);
		System.err.println(Arrays.toString(mergedArr));
		
	}

}
