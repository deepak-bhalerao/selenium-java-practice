package Strings_Arrays_Streams;

public class AdjacentValueInArray {

	public static void main(String[] args) {

        int[] arr= {1,3,7,10,15,25};
        System.out.println("Adjacent Values : ");
        for(int i=0 ; i<arr.length-1 ; i++)
        {
        	int currentValue = arr[i];
        	int nextValue = arr[i+1];
        	int adjacentValue = nextValue - currentValue ;
        	System.out.print(adjacentValue+" ");
        }
	}

}
