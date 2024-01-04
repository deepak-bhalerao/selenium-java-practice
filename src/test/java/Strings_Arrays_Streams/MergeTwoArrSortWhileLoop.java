package Strings_Arrays_Streams;
	
	import java.util.Arrays;
	 
	public class MergeTwoArrSortWhileLoop
	{
	    private static int[] mergeArray(int[] arrayA, int[] arrayB)
	    {
	        int[] mergedArray = new int[arrayA.length + arrayB.length];
	        int i=0, j=0, k=0; 
	        while (i < arrayA.length) 
			{
	            mergedArray[k] = arrayA[i];
	            i++;
	            k++;
	        }   
	        while (j < arrayB.length) 
	        {
	            mergedArray[k] = arrayB[j];
	            j++;
	            k++;
	        } 
			
	        // Using Arrays.sort() method to sort an array elements in ascending order		
	        Arrays.sort(mergedArray);
	        return mergedArray;
	    }
	     
	    public static void main(String[] args) 
	    {
	        int[] arrayA = new int[] {5,1,9,3};
	        int[] arrayB = new int[] {4,2,8,10};
	        int[] mergedArray = mergeArray(arrayA, arrayB);
	        System.out.println("Array A : "+Arrays.toString(arrayA));
	        System.out.println("Array B : "+Arrays.toString(arrayB));
	        System.out.println("Merged Array : "+Arrays.toString(mergedArray));
	    }
	}

