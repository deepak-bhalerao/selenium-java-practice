package Strings_Arrays_Streams;

public class DupNumCharString {
	
    public static void main(String args[])
    {
     
//       int[] arr={1,2,3,4,1,2};
//       for(int i=0 ; i<arr.length ; i++)
//       {
//           for(int j=i+1 ; j<arr.length ; j++)
//           {
//               if(arr[i]==arr[j])
//               System.out.print(arr[j]+" ");
//           }
//       	}
    
	     char[] arr={'a','b','c','a','b','d'};
	     for(int i=0 ; i<arr.length ; i++)
	     {
	         for(int j=i+1 ; j<arr.length ; j++)
	         {
	             if(arr[i]==arr[j])
	             System.out.print(arr[j]+" ");
	         }
	     }
    
//	    String[] arr={"harry","harsh","potter","harry"};
//	    for(int i=0 ; i<arr.length ; i++)
//	    {
//	        for(int j=i+1 ; j<arr.length ; j++)
//	        {
//	            if(arr[i]==arr[j])
//	            System.out.print(arr[j]+" ");
//	        }
//	    }

    }
}