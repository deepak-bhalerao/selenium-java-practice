 package Strings_Arrays_Streams;

public class RevWordPosition_AndItsChar {

	public static void main(String[] args) {
		
		 String str="I Love India";
	     String[] arr=str.split(" ");
	     for(int i=arr.length-3 ; i>=0 ; i--)
	     {
            //  System.out.print(arr[i]+" ");
	    	//  Outer for loop reverse the word in given string
	         
	         char[] ch=str.toCharArray();
	         for(int j=ch.length-1 ; j>=0 ; j--)
	         {
	        	 // inner for loop reverse the char in given string 
	             System.out.print(ch[j]);
	         }
	     }
	

	}

}
