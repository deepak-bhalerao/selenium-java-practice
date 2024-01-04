package Strings_Arrays_Streams;


import java.util.Arrays;

public class GenericFunctionArrayEquals1 
{

    static < T > boolean comparesArray(T[] arr1 , T[] arr2)
    {
    	// equals method is used to compares the Single / 1D array
        boolean result=Arrays.equals(arr1,arr2);
        return result;
    }
    public static void main(String args[]) 
    {
      
//       Integer[] arr1={1,2,3,4};
//       Integer[] arr2={1,2,3,5};
    
	     String[] a={"abc","str"};
	     String[] b={"abc","str"};
    
//       Character[] ch1={'a','b','c','d'};
//       Character[] ch2={'a','b','c','r'};
    
//		 Double[] dl1= {1.0,1.5,2.0,2.5};
//		 Double[] dl2= {1.0,1.5,2.0,2.0};
    
//       System.out.println(comparesArray(arr1,arr2));
         System.out.println(comparesArray(a,b));
//       System.out.println(comparesArray(ch1,ch2));
//       System.out.println(comparesArray(dl1,dl2));
      
    }
}
