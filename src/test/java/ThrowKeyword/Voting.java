package ThrowKeyword;
import java.util.Scanner;

class YoungerAgeException extends RuntimeException  {
	
	YoungerAgeException(String msg)  {
		super(msg);   }
}

public class Voting {
	
	static public void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Age..");
		int age=sc.nextInt();

//  Throw keyword basically used for customized exception or user defined exception	
//	Throw can be used for checked and unchecked exceptions
//	But most probably we used throw for creating customized exception and it can be under unchecked category		
		
		try
		{
			if(age<18) {
				throw new YoungerAgeException("You are not eligible for vote"); 
//				System.out.println("Hey");  // we cannot write any statement just after the throw
				}
			else   {
				System.out.println("You are eligible for vote");  }
			System.out.println("Welcome to voting registration portal");
		}
		catch(YoungerAgeException e)
		{
			e.printStackTrace();
		}
		
		
	}

}
