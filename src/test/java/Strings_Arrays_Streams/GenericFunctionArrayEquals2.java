package Strings_Arrays_Streams;


import java.util.Arrays;

public class GenericFunctionArrayEquals2 {
    
    static < T > boolean compareArray(T[] arr1, T[] arr2)
    {
    	// deepEquals method is used to compares the Multidiamentional Array
        boolean result=Arrays.deepEquals(arr1,arr2);
        return result;
    }
    
    public static void main(String args[]) {
      
	     Integer[][] arr1={ {1,2,3,4} , {5,6,7,8} };
	     Integer[][] arr2={ {1,2,3,4} , {5,6,7,8} };
    
//       String[][] str1= { {"abc","xyz"} , {"abc","xyz"} };
//       String[][] str2= { {"abc","str"} , {"abc","xyz"} };
    
//       Character[][] ch1= { {'a','b','c'} , {'s','t','r'} };
//       Character[][] ch2= { {'a','b','c'} , {'s','t','r'} };
    
//       Double[][] dl1={ {1.5,1.8} , {2.5,3.5} };
//       Double[][] dl2={ {1.5,1.8} , {2.5,3.0} };
      
         System.out.println(compareArray(arr1,arr2));
//       System.out.println(compareArray(str1,str2));
//       System.out.println(compareArray(ch1,ch2));
//       System.out.println(compareArray(dl1,dl2));

    }
}
