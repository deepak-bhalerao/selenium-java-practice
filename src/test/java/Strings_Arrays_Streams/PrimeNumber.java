package Strings_Arrays_Streams;

public class PrimeNumber 
{
    public static void main(String args[]) 
    {
      int num=20 , count;
      for(int i=2 ; i<=num  ; i++)
      {
          count=0;
          for(int j=1 ; j<=i ; j++)
          {
              if(i%j==0)
              count++;
          }  
          if(count==2)
          System.out.print(i+" ");
      }
      
   // These statements are used to check whether i and j gives remainder as 0 (zero) or not. 
   // If the remainder comes as zero, count gets incremented by one. 
   // The next statement checks whether count is equal to two or not.   
   // If two, then prints the value of i

    }
}