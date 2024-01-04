package FileHandling;

import java.io.FileReader;
import java.io.IOException;

public class ReadFile1 
{

	public static void main(String[] args) throws IOException 
	{
		try
		{
			FileReader fr=new FileReader("D:\\Java Practice\\FileRead.txt");
			int i=0;
			String str="";
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

	}

}
