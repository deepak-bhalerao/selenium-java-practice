package Strings_Arrays_Streams;

public class DownwardTringleStarPattern 
{
    public static void main(String args[]) {
      
     int num=5;
     for(int i=num-1 ; i>=0 ; i--)    // outer loop 
     {
         for(int j=0 ; j<=i ; j++)    // inner loop
         {
             System.out.print("*"+" ");  // print stars and space
         }
         
         System.out.println();
         //throws the cursor in the next line after printing each line  
     }
 
    }
}