
package Strings_Arrays_Streams;

public class EachWordCharCountInString
{
    public static void main(String[] args)
    {
        int count;
        String s = "This is your string for example";
        String[] arr = s.split(" ");
        for(String str: arr)
        {
            char[] ch = str.toCharArray();   // convert string to char array
            count = 0;                       // reset count for every new word/string
            for(char c: ch)                  // iterate over all the characters
            {
                if(Character.isLetter(c))    // Returns true if the character is a Letter
                {
                    count++;                 // increase the count to represent no. of letters
                }
             }
        System.out.println(str+"=" +count);       // print the no.of characters that are letters in a word/string.
        }
    }
}