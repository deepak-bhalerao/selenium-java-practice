package Strings_Arrays_Streams;

public class EvenLengthWord 
{
    public static void main(String args[]) 
    {
     
        // print the words in string those have even length using normal for loop
        String str="this is pune and this is jalgaon";
        String[] arr=str.split(" ");
        for(int i=0 ; i<arr.length ; i++)
        {
            if(arr[i].length()%2==0)
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        
        // print the words in string those have odd length using forEach loop
        String str1="this is india and this is america";
        for(String word : str1.split(" "))
        {
            if(word.length()%2!=0)
            System.out.print(word+" ");
        }
      
    }
}
