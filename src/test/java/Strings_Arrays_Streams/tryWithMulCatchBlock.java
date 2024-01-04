package Strings_Arrays_Streams;

public class tryWithMulCatchBlock 
{
	
    public static void main(String args[]) 
    {
       // multiple catch block can be declare with single try block 
    	
	   try
	   {
	       int a=10/0;
	       System.out.println(a);
	   }
	   catch(ArithmeticException e1)
	   {
//	       e1.printStackTrace();
	       System.out.println("Number cannot be devided by zero");
	   }
	   catch(NumberFormatException e)
	   {
	       e.printStackTrace();
	   }
	   catch(Exception e)
	   {
		   e.printStackTrace();
	   }

     }
}