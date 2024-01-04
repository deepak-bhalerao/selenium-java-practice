package Strings_Arrays_Streams;

public class CharCountInString 
{
    public static void main(String args[])
    {
    	// Print char count in given string using forEach loop
        String str="welcome to india";
        int count=0;
        for(char ch : str.toCharArray())
        {
            if(ch!=' ')
            count++;
        }
        System.out.println(count);
        
        // Print char count in given string using normal for loop
        String str1="welcome to maharashtra";
        int counter=0;
        for(int i=0 ; i<str1.length() ; i++)
        {
            char ch=str1.charAt(i);
            if(ch!=' ')
            counter++;
        }
        System.out.println(counter);
    }
}