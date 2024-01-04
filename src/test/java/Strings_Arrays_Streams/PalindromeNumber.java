package Strings_Arrays_Streams;

public class PalindromeNumber {
    public static void main(String args[]) {
     
     int num=121 , rem , rev=0 , m;
     m=num;
     while(num>0)
     {
         rem=num%10;
         rev=rev*10+rem;
         num=num/10;
     }
     
     if(m==rev)
     System.out.println("given number is palindrome");
     else
     System.out.println("given number is not palindrome");
    }
}
