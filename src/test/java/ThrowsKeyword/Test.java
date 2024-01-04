package ThrowsKeyword;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;

	class ReadAndWrite
	{
		 void readFile() throws FileNotFoundException  {
		      FileInputStream fis=new FileInputStream("d:/abc.txt");
		 }
		 
//		 Throws keyword is used to declare the exception . It gives an information to the
//		 caller method that there might occure an exception , So it is better for the caller 
//		 method to provide the exception handling code so that normal flow can be maintained 
//		 Throws keyword is used to declare the checked exception only
		
		 void saveFile() throws FileNotFoundException  {
			  String str="this is haresh";
			  FileOutputStream fos=new FileOutputStream("d:/Test.txt");
		 }
	}

	class Test
	{
		 static public void main(String[] args) 
		 {
			 ReadAndWrite rw=new ReadAndWrite();
		
			  try  { 
			  rw.readFile();
			  }
			  catch(FileNotFoundException e) {
			   e.printStackTrace();
			  }
		
			  try  { 
			  rw.saveFile();
			  }
			  
			  catch(FileNotFoundException e)  {
			  e.printStackTrace();
			  }
			  
			  System.out.println("Program Ended Normally...");
		 }
	}








