package FileHandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWrite 
{
	
	public static void main(String args[]) throws IOException
	{
		int i=0;
		String str="";
		
		try
		{
			FileReader fr=new FileReader("D:\\Java Practice\\FileRead.txt");
			while((i=fr.read())!=-1)
			{
				str=str+(char)i;
			}
			System.out.println(str);
			fr.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		try
		{
			FileWriter fw=new FileWriter("C:\\FileWrite\\TestFileWrite.txt");
			fw.write(str);
			fw.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
